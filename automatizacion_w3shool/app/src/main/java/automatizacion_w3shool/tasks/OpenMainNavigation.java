package automatizacion_w3shool.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import automatizacion_w3shool.userinterface.NavigationElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenMainNavigation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(NavigationElements.MAIN_MENU_BUTTON)
        );
    }

    public static OpenMainNavigation menu() {
        return instrumented(OpenMainNavigation.class);
    }
}