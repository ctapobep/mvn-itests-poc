package poc.jbehave;

/**
 * @author stanislav bashkirtsev
 */
public class GoOutDecisionMaker {
    boolean ridingBicycle(String weatherState) {
        if ("shiny".equalsIgnoreCase(weatherState)) {
            return true;
        } else if ("rainy".equalsIgnoreCase(weatherState)) {
            return false;
        } else {
            throw new IllegalArgumentException("The weather state is not recognized: " + weatherState);
        }
    }
}
