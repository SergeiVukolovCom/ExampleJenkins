package testForm.utils;

import java.util.Random;

public class RandomString {
    private static final String LATINSYMBOLS = "abcdefghijklmnopqrstuvwxyz";
    private static final String COUNTS = "1234567890";
    private static final Random random = new Random();

    private RandomString() {}

    public static String getRandomString() {
        StringBuilder randStringTitle = new StringBuilder();
        int count = random.nextInt(LATINSYMBOLS.length()) + 1;
        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(LATINSYMBOLS.length());
            randStringTitle.append(LATINSYMBOLS.charAt(randomIndex));
        }
        return randStringTitle.toString();
    }

    public static long getRandomLong() {
        StringBuilder randInt = new StringBuilder();
        int count = 10;
        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(COUNTS.length());
            randInt.append(COUNTS.charAt(randomIndex));
        }
        return Long.parseLong(randInt.toString());
    }

}
