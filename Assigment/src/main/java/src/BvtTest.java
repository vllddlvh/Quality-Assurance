package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BvtTest {

    private final String correctPin = "060905";

    @Test
    void testBVT1() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 2_500_000, 100_000_000, 5_000_000);
        assertTrue(result);
    }

    @Test
    void testBVT2() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 2_500_000, 100_000_000, 0);
        assertTrue(result);
    }

    @Test
    void testBVT3() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 2_500_000, 100_000_000, 50_000);
        assertTrue(result);
    }

    @Test
    void testBVT4() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 2_500_000, 100_000_000, 9_500_000);
        assertFalse(result);
    }

    @Test
    void testBVT5() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 2_500_000, 100_000_000, 10_000_000);
        assertFalse(result);
    }

    @Test
    void testBVT6() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 50_000, 10_000_000, 5_000_000);
        assertTrue(result);
    }

    @Test
    void testBVT7() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 100_000, 10_000_000, 5_000_000);
        assertTrue(result);
    }

    @Test
    void testBVT8() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 4_500_000, 10_000_000, 5_000_000);
        assertTrue(result);
    }

    @Test
    void testBVT9() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 5_000_000, 10_000_000, 5_000_000);
        assertTrue(result);
    }

    @Test
    void testBVT10() {
        boolean result = Main.withdraw("060905", "102102", 0, "ACTIVE", 2_500_000, 100_000_000, 5_000_000);
        assertFalse(result);
    }

    @Test
    void testBVT11() {
        boolean result = Main.withdraw("060905", correctPin, 0, "BLOCKED", 2_500_000, 100_000_000, 0);
        assertFalse(result);
    }

    @Test
    void testBVT12() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 2_500_000, 1_000_000, 5_000_000);
        assertFalse(result);
    }

    @Test
    void testBVT13() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 0, 100_000_000, 5_000_000);
        assertFalse(result);
    }

    @Test
    void testBVT14() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 5_050_000, 100_000_000, 5_000_000);
        assertFalse(result);
    }

    @Test
    void testBVT15() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 2_500_000, 100_000_000, -50_000);
        assertFalse(result);
    }
    @Test
    void testBVT16() {
        boolean result = Main.withdraw("060905", correctPin, 0, "ACTIVE", 2_500_000, 100_000_000, 10_050_000);
        assertFalse(result);
    }
}
