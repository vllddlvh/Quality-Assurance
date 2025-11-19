## Yêu cầu

- Node.js >= 16 hoặc Python 3.8+
- npm / pip

## Cài đặt nhanh (Node.js)

```bash
# cài dependencies
npm install

# chạy dev
npm run dev
```

**Hoặc (Python/Flask)**

```bash
python -m venv venv
source venv/bin/activate  # macOS / Linux
venv\Scripts\activate     # Windows
pip install -r requirements.txt
python app.py
```

## Cấu hình API và biến môi trường

Tạo file `.env` (không commit vào git):

```
LLM_API_KEY=your_api_key_here
LLM_API_BASE=https://api.your-llm-provider.com
PORT=3000
```

Cách đọc biến môi trường tùy framework (dotenv cho Node/Python).
