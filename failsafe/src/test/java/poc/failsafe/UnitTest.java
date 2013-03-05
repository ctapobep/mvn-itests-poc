package poc.failsafe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/test-context.xml")
public class UnitTest {

    @Test
    public void junitTestShouldFail() throws Exception {
        System.out.println("*************************UNIT TEST IS RUNNING*************************");
        assertEquals(
                "If you want them to pass, then '-DunitTestResult=pass' while running unit tests",
                "pass", unitTestResult);
    }

    @Autowired
    private String unitTestResult;
}
