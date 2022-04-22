package utils;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.NumberUtils;

public class TestDataGenerator {

    private TestDataGenerator() {
    }


    public static String generateDrinkName(int length) {
        return generateAlphabeticString(length);
    }


    public static String generateRandomEmail(int emailNameLength, int subDomainLength, int domainLength ) {
        StringBuilder builder = new StringBuilder();
        builder.append( generateAlphanumericString(emailNameLength));
        builder.append("@");
        builder.append(generateAlphanumericString(subDomainLength));
        builder.append(".");
        builder.append(generateAlphanumericString(domainLength));
        return builder.toString();
    }

    public static int generateNextInt(int maxValue) {
        return Integer.parseInt(RandomStringUtils.randomNumeric(maxValue));
    }

    private static String generateAlphabeticString(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

    private static String generateAlphanumericString(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

}
