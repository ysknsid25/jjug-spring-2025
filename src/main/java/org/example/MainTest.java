package org.example;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testGetYearsMessageWithStillActive() {
        Main.PeriodInYears stillActive = new Main.PeriodInYears(2005, Optional.of(9999));
        String result = Main.getYearsMessage(stillActive);
        assertEquals("Still active since 2005", result);
    }

    @Test
    void testGetYearsMessageWithActiveBetween() {
        Main.PeriodInYears stillActive = new Main.PeriodInYears(1990, Optional.of(2000));
        String result = Main.getYearsMessage(stillActive);
        assertEquals("Active between 1990 and 2000", result);
    }
}
