package stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PreparingScenario {

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
        theActorCalled("matrucs");
    }
}