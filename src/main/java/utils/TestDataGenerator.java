package utils;

public class TestDataGenerator {

    public static int id;
    public static String drinkname = "";
    public static String email = "";

    private TestDataGenerator() {
    }


    public static String generateDrink() {
        var pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZabhcdefghijklmnopqrstuvwxyz";
        for(var i = 0; i<10; i++)
            drinkname += pattern.charAt((int) Math.floor(Math.random() * pattern.length()));
        return drinkname;
    }


    public static String generateRandomEmail() {
        var pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZabhcdefghijklmnopqrstuvwxyz";
        for(var i = 0; i<10; i++)
            email += pattern.charAt((int) Math.floor(Math.random() * pattern.length()));
        email += "@gmail.com";
        return email;
    }

    public static int generateNextInt() {
        id = (int) Math.floor(Math.random() * 30) + 5;
        return id;
    }

}
