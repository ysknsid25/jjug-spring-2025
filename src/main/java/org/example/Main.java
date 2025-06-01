package org.example;

import java.util.Optional;

public class Main {
    public record PeriodInYears(int start, Optional<Integer> end){};

    public static void main(String[] args) {
        PeriodInYears p1 = new PeriodInYears(1981, Optional.empty());
        PeriodInYears p2 = new PeriodInYears(1968, Optional.of(1980));

        System.out.println(getYearsMessage(p1));
        System.out.println(getYearsMessage(p2));

    }

    static String getYearsMessage(PeriodInYears p1) {
        if (p1.end().isEmpty()) {
            return "Still active since " + p1.start();
        } else {
            return "Active between " + p1.start() + " and " + p1.end().get();
        }
    }
}

