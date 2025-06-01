package org.example;

public class Main {
    public sealed interface YearsActive permits StillActive, ActiveBetween {}
    public record StillActive(int since) implements YearsActive {}
    public record ActiveBetween(int start, int end) implements YearsActive {}

    public static void main(String[] args) {
        YearsActive y1 = new StillActive(2005);
        YearsActive y2 = new ActiveBetween(1990, 2000);

        System.out.println(getYearsMessage(y1));
        System.out.println(getYearsMessage(y2));
    }

    static String getYearsMessage(YearsActive ya) {
        return switch (ya) {
            case StillActive sa ->
                    "Still active since " + sa.since();
            case ActiveBetween ab ->
                    "Active between " + ab.start() + " and " + ab.end();
        };
    }
}

