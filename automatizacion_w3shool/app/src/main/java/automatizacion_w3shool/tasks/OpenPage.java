package automatizacion_w3shool.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import automatizacion_w3shool.userinterface.w3school_link_home;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn().the(w3school_link_home.class)
        );
    }

    public static OpenPage toW3Schools() {
        return instrumented(OpenPage.class);
    }
}