package utils;

import com.fasterxml.uuid.Generators;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class TestDataGenerator {
    private static final Random rand = new Random();
    public static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final int MAX_RANDOM = 10000;
    public static final int LENGTH = 20;

    private TestDataGenerator() {
    }


    public static String generateDrink() {
//  Below is an example. Please write a method which generates dynamically random names
//  You could for example use 'StringBuilder()'

        String drinkName = "Something";
        return drinkName;
    }


    public static String generateRandomEmail() {
//  Below is an example. Please write a method which generates dynamically random emails
        return "test@gmail.com";
    }

    public static int generateNextInt(){
        Random random = new Random();
        int bound = 10;
        int i = random.nextInt(bound);
        return i;
    }

//    public static long number() {
//        var offset = rand.nextInt() * 1000 + 1;
//        return System.currentTimeMillis() + offset;
//    }
//
//
//    public static String generateEncodedEmail() {
//        var MAIL = generateRandomEmail();
//        return MAIL.replaceAll("\\+", "%2B");
//    }
//
//    //futureDateWithDays - aanpassen
//    public static String futureDate(int days, String format) {
//        var now = LocalDateTime.now();
//        var date = now.plusDays(days);
//        var dateTimeFormatter = DateTimeFormatter.ofPattern(format);
//        return dateTimeFormatter.format(date);
//    }
//
//    //    Kijken of deze weg kan of hernoemen naar 'now'
//    public static LocalDate currentDate() {
//        return LocalDate.now();
//    }
//
//
//    public static String generateUUID() {
//        var uuid1 = Generators.timeBasedGenerator().generate();
//        return uuid1.toString();
//    }
//
//    public static String generateTimeStamp() {
//        return new Timestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)).toString();
//    }
//
//    public static int generateRandomInt() {
//        return rand.nextInt(MAX_RANDOM - 1) + 1;
//    }

}
