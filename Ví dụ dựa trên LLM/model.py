import torch
import math
from transformers import AutoModelForCausalLM, AutoTokenizer

class CodeNaturalnessEvaluator:
    def __init__(self):
        # Model CodeGGT
        self.model_name = "microsoft/CodeGPT-small-java-adaptedGPT2"
        self.tokenizer = AutoTokenizer.from_pretrained(self.model_name)
        self.model = AutoModelForCausalLM.from_pretrained(self.model_name)
        self.model.eval()

    def calculate_score(self, code_snippet):
        # Ngữ cảnh
        context_before = """
        public class DiscountService {
            public double calculateFinalPrice(double price, boolean isVip) {
        """
        full_code = context_before + code_snippet + "\n    }\n}"
        
        # Mã hóa phần ngữ cảnh
        context_tokens = self.tokenizer(context_before, return_tensors="pt")["input_ids"]
        context_len = context_tokens.shape[1]

        # Mã hóa toàn bộ
        full_tokens = self.tokenizer(full_code, return_tensors="pt")
        input_ids = full_tokens["input_ids"]
        
        # Tạo nhãn (labels) từ input_ids
        labels = input_ids.clone()
        
        # Gán giá trị -100 cho toàn bộ phần Ngữ cảnh (Context)
        labels[:, :context_len] = -100
        
        # Tính toán
        with torch.no_grad():
            outputs = self.model(input_ids, labels=labels)
            loss = outputs.loss.item()

        # Chuyển Loss thành Score
        score = math.exp(-loss)
        return score

if __name__ == "__main__":
    evaluator = CodeNaturalnessEvaluator()
    patch_a = """
        if (isVip) {
            return price * 0.90; 
        }
        return price;"""
    patch_b = """
        return price - (1000 / price);"""

    score_a = evaluator.calculate_score(patch_a)
    score_b = evaluator.calculate_score(patch_b)

    print(f"Score A: {score_a:.10f}")
    print(f"Score B: {score_b:.10f}")

    print("-" * 30)
    # Logic so sánh
    if score_a > score_b:
        print("Chọn bản vá A")
    else:
        print("Chọn bản vá B")