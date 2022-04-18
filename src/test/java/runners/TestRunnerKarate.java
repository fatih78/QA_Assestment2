package runners;


import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRunnerKarate {
    public static Results results;

    @Test
    public void testParallel() {
        results = Runner.path("classpath:features").parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

    public static void main(String[] args) {
        new TestRunnerKarate().testParallel();
    }
}


