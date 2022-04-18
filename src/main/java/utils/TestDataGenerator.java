package utils;

import java.util.List;
import java.util.Random;

public class TestDataGenerator {

    private static final List<String> taste = List.of("sour", "sweet", "bitter", "spicy");
    private static final List<String> liquor = List.of("whiskey", "rum", "vodka", "tequila");
    private static final List<String> emailDomains = List.of("@gmail.com", "@hotmail.com", "@abhi.in");
    public static int id;
    public static String drinkname = "";
    public static String email = "";

    private TestDataGenerator() {
    }


    public static String generateDrink() {
        Random r = new Random();
        drinkname = taste.get(r.nextInt(taste.size())) + liquor.get(r.nextInt(liquor.size()));
        return drinkname;
    }


    public static String generateRandomEmail() {
        var pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZabhcdefghijklmnopqrstuvwxyz";
        Random r = new Random();
        String emailId = "";
        for(var i = 0; i<10; i++){
            emailId += pattern.charAt((int) Math.floor(Math.random() * pattern.length()));
        }
        email = emailId + emailDomains.get(r.nextInt(emailDomains.size()));
        return email;
    }

    public static int generateNextInt() {
        id = (int) Math.floor(Math.random() * 30) + 5;
        return id;
    }

}
