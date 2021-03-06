package poc.separatefolders;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/test-context.xml")
@Ignore("stopped working on categories, not worth it")
public class UnitTest {

    @Test
    public void junitTestShouldFail() throws Exception {
        System.out.println("*************************UNIT TEST IS RUNNING*************************");
        assertEquals(
                "If you want them to pass, then '-DunitTestResult=pass' while running unit tests",
                "pass", unitTestResult);
        assertTrue(new ClassPathResource("/some-resource.xml").exists());
    }

    @Autowired
    private String unitTestResult;
}
