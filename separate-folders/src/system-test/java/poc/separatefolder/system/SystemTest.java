package poc.separatefolder.system;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/system-tests.xml")
public class SystemTest {
    @Test
    public void integrationTest() {
        System.out.println("*************************SYSTEM TEST IS RUNNING*************************");
        assertEquals("If you want systemTestResult tests to pass, use '-DsystemTestResult=pass'",
                systemTestResult, "pass");
    }

    @Autowired
    private String systemTestResult;
}
