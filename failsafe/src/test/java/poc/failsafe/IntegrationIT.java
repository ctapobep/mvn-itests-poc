package poc.failsafe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/test-context.xml")
public class IntegrationIT {
    @Test
    public void integrationTest() {
        assertEquals("If you want integration tests to pass, use '-DintegrationTestResults=pass'",
                integrationTestResult, "pass");
    }

    @Autowired
    private String integrationTestResult;
}
