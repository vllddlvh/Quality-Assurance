package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AllUsesTest {

    @Test
    public void TC1() {
        String pin = "123456";
        String correctPin = "123456";
        int pinAttempts = 0;
        String cardStatus = "ACTIVE";
        int withdrawalAmount = 30_000;
        int accountBalance = 2_000_000;
        int totalWithdrawToday = 0;

        boolean result = Main.withdraw(pin, correctPin, pinAttempts, cardStatus,
                withdrawalAmount, accountBalance, totalWithdrawToday);

        assertFalse(result);
    }

    @Test
    public void TC2() {
        String pin = "123456";
        String correctPin = "123456";
        int pinAttempts = 0;
        String cardStatus = "ACTIVE";
        int withdrawalAmount = 50_000;
        int accountBalance = 2_000_000;
        int totalWithdrawToday = 0;

        boolean result = Main.withdraw(pin, correctPin, pinAttempts, cardStatus,
                withdrawalAmount, accountBalance, totalWithdrawToday);

        assertTrue(result);
    }

    @Test
    public void TC3() {
        String pin = "123456";
        String correctPin = "123456";
        int pinAttempts = 0;
        String cardStatus = "ACTIVE";
        int withdrawalAmount = 2_500_000;
        int accountBalance = 5_000_000;
        int totalWithdrawToday = 0;

        boolean result = Main.withdraw(pin, correctPin, pinAttempts, cardStatus,
                withdrawalAmount, accountBalance, totalWithdrawToday);

        assertTrue(result);
    }

    @Test
    public void TC4() {
        String pin = "123456";
        String correctPin = "123456";
        int pinAttempts = 0;
        String cardStatus = "ACTIVE";
        int withdrawalAmount = 5_000_000;
        int accountBalance = 10_000_000;
        int totalWithdrawToday = 0;

        boolean result = Main.withdraw(pin, correctPin, pinAttempts, cardStatus,
                withdrawalAmount, accountBalance, totalWithdrawToday);

        assertTrue(result);
    }

    @Test
    public void TC5() {
        String pin = "123456";
        String correctPin = "123456";
        int pinAttempts = 0;
        String cardStatus = "ACTIVE";
        int withdrawalAmount = 5_100_000;
        int accountBalance = 10_000_000;
        int totalWithdrawToday = 0;

        boolean result = Main.withdraw(pin, correctPin, pinAttempts, cardStatus,
                withdrawalAmount, accountBalance, totalWithdrawToday);

        assertFalse(result);
    }

    @Test
    public void TC6() {
        String pin = "123456";
        String correctPin = "123456";
        int pinAttempts = 0;
        String cardStatus = "ACTIVE";
        int withdrawalAmount = 2_550_000;
        int accountBalance = 5_000_000;
        int totalWithdrawToday = 0;

        boolean result = Main.withdraw(pin, correctPin, pinAttempts, cardStatus,
                withdrawalAmount, accountBalance, totalWithdrawToday);

        assertTrue(result);
    }

    @Test
    public void TC7() {
        String pin = "123456";
        String correctPin = "123456";
        int pinAttempts = 0;
        String cardStatus = "ACTIVE";
        int withdrawalAmount = 1_000_000;
        int accountBalance = 5_000_000;
        int totalWithdrawToday = 0;

        boolean result = Main.withdraw(pin, correctPin, pinAttempts, cardStatus,
                withdrawalAmount, accountBalance, totalWithdrawToday);

        assertTrue(result);
    }

    @Test
    public void TC8() {
        String pin = "123456";
        String correctPin = "123456";
        int pinAttempts = 0;
        String cardStatus = "ACTIVE";
        int withdrawalAmount = 8_000_000;
        int accountBalance = 20_000_000;
        int totalWithdrawToday = 3_000_000;

        boolean result = Main.withdraw(pin, correctPin, pinAttempts, cardStatus,
                withdrawalAmount, accountBalance, totalWithdrawToday);

        assertTrue(result);
    }

    @Test
    public void TC9() {
        String pin = "123456";
        String correctPin = "123456";
        int pinAttempts = 0;
        String cardStatus = "ACTIVE";
        int withdrawalAmount = 5_000_000;
        int accountBalance = 10_000_000;
        int totalWithdrawToday = 5_000_000;

        boolean result = Main.withdraw(pin, correctPin, pinAttempts, cardStatus,
                withdrawalAmount, accountBalance, totalWithdrawToday);

        assertTrue(result);
    }

    @Test
    public void TC10() {
        String pin = "123456";
        String correctPin = "123456";
        int pinAttempts = 0;
        String cardStatus = "ACTIVE";
        int withdrawalAmount = 50_000;
        int accountBalance = 20_000_000;
        int totalWithdrawToday = 10_000_000;

        boolean result = Main.withdraw(pin, correctPin, pinAttempts, cardStatus,
                withdrawalAmount, accountBalance, totalWithdrawToday);

        assertFalse(result);
    }

    @Test
    public void TC11() {
        String pin = "999999";
        String correctPin = "123456";
        int pinAttempts = 0;
        String cardStatus = "ACTIVE";
        int withdrawalAmount = 500_000;
        int accountBalance = 2_000_000;
        int totalWithdrawToday = 0;

        boolean result = Main.withdraw(pin, correctPin, pinAttempts, cardStatus,
                withdrawalAmount, accountBalance, totalWithdrawToday);

        assertFalse(result);
    }

    @Test
    public void TC12() {
        String pin = "123456";
        String correctPin = "123456";
        int pinAttempts = 0;
        String cardStatus = "BLOCKED";
        int withdrawalAmount = 500_000;
        int accountBalance = 2_000_000;
        int totalWithdrawToday = 0;

        boolean result = Main.withdraw(pin, correctPin, pinAttempts, cardStatus,
                withdrawalAmount, accountBalance, totalWithdrawToday);

        assertFalse(result);
    }

    @Test
    public void TC13() {
        String pin = "123456";
        String correctPin = "123456";
        int pinAttempts = 0;
        String cardStatus = "ACTIVE";
        int withdrawalAmount = 3_000_000;
        int accountBalance = 2_000_000;
        int totalWithdrawToday = 0;

        boolean result = Main.withdraw(pin, correctPin, pinAttempts, cardStatus,
                withdrawalAmount, accountBalance, totalWithdrawToday);

        assertFalse(result);
    }
}
