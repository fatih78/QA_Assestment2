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
        var drinkName = TestDataGenerator.generateDrink();
        Assert.assertEquals(drinkName, "Something");
    }

    @Test
    public void testRandomEmail() {
        var email = TestDataGenerator.generateRandomEmail();
        Assert.assertEquals(email, "test@gmail.com");
    }


    @Test
    public void testRandomInt() {
        var number = TestDataGenerator.generateNextInt();
        Assert.assertTrue(number <= 10);
    }


//    @Test
//    public void testCurrentDate() {
//        var firstDate = TestDataGenerator.currentDate();
//        var secondDate = firstDate.minusDays(1);
//        Assert.assertEquals(secondDate, firstDate.minusDays(1));
//    }
//
//    @Test
//    public void testFutureDate() {
//        var futureDateOne = TestDataGenerator.futureDate(1, "yyyy-MM-dd");
//        var futureDateTwo = TestDataGenerator.futureDate(3, "yyyy-MM-dd");
//        var futureDateNow = TestDataGenerator.futureDate(0, "yyyy-MM-dd");
//
//        Assert.assertNotEquals(futureDateOne, futureDateTwo);
//        Assert.assertEquals(futureDateNow, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//    }
//
//
//
//    @Test
//    public void testEncodedEmail() {
//        var encodedMail = TestDataGenerator.generateEncodedEmail();
//        Assert.assertTrue(encodedMail.contains("%2B"));
//    }
//
//
//
//    @Test
//    public void testUUIDGenerator() {
//        var uuId = TestDataGenerator.generateUUID();
//        Assert.assertTrue(uuId.contains("-"));
//    }
//
//    @Test
//    public void testTimeStampGenerator() {
//        var ts = TestDataGenerator.generateTimeStamp();
//        Assert.assertTrue(ts.contains(":"));
//    }



    @Test
    public void test_X_API_KEY() {
        var number = Key.getKey();
        Assert.assertTrue(number == "1234");
    }


}
