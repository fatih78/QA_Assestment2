package unitTest;

import org.junit.Assert;
import org.junit.Test;
import runners.TestRunnerKarate;
import utils.Key;
import utils.TestDataGenerator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class UnitTests {
    @Test
    public void testRandomDrink() {

    }

    @Test
    public void testRandomEmail() {

    }


    @Test
    public void testRandomInt() {

    }



    @Test
    public void test_X_API_KEY() {
        var number = Key.getKey();
        Assert.assertTrue(number == "1234");
    }


}
