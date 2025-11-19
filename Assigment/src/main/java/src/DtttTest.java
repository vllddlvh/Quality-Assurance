package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DtttTest {

    @Test
    void testDTT1() {
        boolean result = Main.withdraw(
                "060905", "060905", 0,
                "ACTIVE", 3_650_000,
                7_750_000, 1_200_000);
        assertTrue(result); // Expected: True
    }

    @Test
    void testDTT2() {
        boolean result = Main.withdraw(
                "34cv8g", "060905", 0,
                "BLOCKED", 31_000,
                20_070, 10_031_000);
        assertFalse(result); // Expected: False
    }

    @Test
    void testDTT3() {
        boolean result = Main.withdraw(
                "060905", "060905", 0,
                "BLOCKED", 4_650_000,
                5_543_220, 850_000);
        assertFalse(result); // Expected: False
    }

    @Test
    void testDTT4() {
        boolean result = Main.withdraw(
                "060905", "060905", 0,
                "ACTIVE", 15_000,
                29_766_012, 850_000);
        assertFalse(result); // Expected: False
    }

    @Test
    void testDTT5() {
        boolean result = Main.withdraw(
                "060905", "060905", 0,
                "ACTIVE", 2_536_000,
                40_362_171, 3_000_000);
        assertFalse(result); // Expected: False
    }

    @Test
    void testDTT6() {
        boolean result = Main.withdraw(
                "060905", "060905", 0,
                "ACTIVE", 4_900_000,
                4_821_545, 0);
        assertFalse(result); // Expected: False
    }

    @Test
    void testDTT7() {
        boolean result = Main.withdraw(
                "060905", "060905", 0,
                "ACTIVE", 4_500_000,
                17_699_375, 9_000_000);
        assertFalse(result); // Expected: False (vượt hạn mức trong ngày)
    }

}
