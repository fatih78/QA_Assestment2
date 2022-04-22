package unitTest;

import org.junit.Assert;
import org.junit.Test;
import utils.TestDataGenerator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UnitTests {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    @Test
    public void generateDrinkName() {
        String drinkName = TestDataGenerator.generateDrinkName(3);

        Assert.assertNotNull(drinkName);
        Assert.assertEquals(drinkName.getClass(), String.class);
        Assert.assertEquals(drinkName.length(), 3);
    }

    @Test
    public void generateRandomEmail() {
        String email = TestDataGenerator.generateRandomEmail(5,4,3);
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);

        Assert.assertNotNull(email);
        Assert.assertTrue(matcher.find());
        Assert.assertEquals(email.getClass(), String.class);
    }

    @Test
    public void generateNextInt() {
        Integer numericValue = TestDataGenerator.generateNextInt(3);

        Assert.assertNotNull(numericValue);
        Assert.assertEquals(numericValue.getClass(), Integer.class);
        Assert.assertTrue(numericValue > 0);
    }


}
