package poc.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static junit.framework.Assert.assertEquals;

/**
 * @author stanislav bashkirtsev
 */
public class GoOutSteps {
    @Given("the weather is $weatherState")
    public void ridingBicycle(String weatherState) {
        this.weatherState = weatherState;
    }

    @When("I wake up")
    public void wakeUp(){

    }

    @Then("I $action")
    public void iDo(String action) {
        System.out.println("*************************JBEHAVE TEST IS RUNNING*************************");
        boolean expectedGoOut = action.equalsIgnoreCase("go biking");
        assertEquals(expectedGoOut, sut.ridingBicycle(weatherState));
    }

    private String weatherState = null;
    private GoOutDecisionMaker sut = new GoOutDecisionMaker();
}
