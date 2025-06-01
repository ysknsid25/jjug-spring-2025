package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testGetYearsMessageWithStillActive() {
        Main.YearsActive stillActive = new Main.StillActive(2005);
        String result = Main.getYearsMessage(stillActive);
        assertEquals("Still active since 2005", result);
    }

    @Test
    void testGetYearsMessageWithActiveBetween() {
        Main.YearsActive activeBetween = new Main.ActiveBetween(1990, 2000);
        String result = Main.getYearsMessage(activeBetween);
        assertEquals("Active between 1990 and 2000", result);
    }
}
