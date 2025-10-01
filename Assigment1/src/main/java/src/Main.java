package src;

import java.util.Scanner;

public class Main {
    public static boolean withdraw(
            String pin,
            String correctPin,
            int pinAttempts,
            String cardStatus,
            int withdrawalAmount,
            int accountBalance,
            int totalWithdrawToday) {

        // 1. Kiểm tra PIN
        if (pin == null || !pin.equals(correctPin) || pin.length() != 6) {
            return false;
        }

        // 2. Kiểm tra trạng thái thẻ
        if (!"ACTIVE".equalsIgnoreCase(cardStatus)) {
            return false;
        }

        // 3. Kiểm tra số tiền rút hợp lệ
        // - Tối thiểu 50,000
        // - Tối đa 5,000,000 mỗi lần rút
        // - Phải là bội số của 50,000
        if (withdrawalAmount < 50_000 || withdrawalAmount >= 5_000_000 || withdrawalAmount % 50_000 != 0) {
            return false;
        }

        // 4. Kiểm tra số dư tài khoản
        if (withdrawalAmount > accountBalance) {
            return false;
        }

        // 5. Kiểm tra hạn mức rút trong ngày (<= 10,000,000)
        if (totalWithdrawToday > 10_000_000) {
            return false;
        }

        // Nếu qua hết kiểm tra -> giao dịch thành công
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}