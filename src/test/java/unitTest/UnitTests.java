package unitTest;

import org.junit.Assert;
import org.junit.Test;
import utils.TestDataGenerator;


public class UnitTests {

    @Test
    public void generateDrink() {
        String drinkName = TestDataGenerator.generateDrink();
        Assert.assertNotNull(drinkName);
        Assert.assertEquals(drinkName.getClass(), String.class);
        assert drinkName.length() >= 10;
    }

    @Test
    public void generateRandomEmail() {
        String email = TestDataGenerator.generateRandomEmail();
        Assert.assertNotNull(email);
        Assert.assertEquals(email.getClass(), String.class);
        assert email.length() >= 10;
    }


    @Test
    public void generateNextInt() {
        Integer id = TestDataGenerator.generateNextInt();
        Assert.assertTrue(id>0);
        Assert.assertEquals(id.getClass(), Integer.class);
    }
}
