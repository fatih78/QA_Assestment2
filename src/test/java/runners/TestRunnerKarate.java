package runners;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;

import static org.junit.Assert.*;


public class TestRunnerKarate {
    public static Results results;

    public static void testParallel() {
        Results results = Runner.path("classpath:features")
                .outputCucumberJson(true)
                .parallel(1);

        assertEquals(results.getErrorMessages(), 0, results.getFailCount());
    }

    public static void main(String[] args) {
        TestRunnerKarate.testParallel();
    }
}


