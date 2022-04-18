package unitTest;

import org.junit.Assert;
import org.junit.Test;
import utils.TestDataGenerator;
import java.util.regex.Pattern;


public class UnitTests {

    @Test
    public void generateDrink() {
        String drinkName = TestDataGenerator.generateDrink();
        Assert.assertNotNull(drinkName);
        Assert.assertEquals(drinkName.getClass(), String.class);
        Assert.assertTrue(drinkName.length() >= 10);
    }

    @Test
    public void generateRandomEmail() {
        String email = TestDataGenerator.generateRandomEmail();
        Assert.assertNotNull(email);
        Assert.assertEquals(email.getClass(), String.class);
        Assert.assertTrue(email.length() >= 10);
        Assert.assertTrue(testOwaspValidation(email));
    }

    @Test
    public void generateNextInt() {
        Integer id = TestDataGenerator.generateNextInt();
        Assert.assertTrue(id>0);
        Assert.assertEquals(id.getClass(), Integer.class);
    }

    private boolean testOwaspValidation(String emailAddress) {
        String regexPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        boolean matches = Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
        return matches;
    }
}
