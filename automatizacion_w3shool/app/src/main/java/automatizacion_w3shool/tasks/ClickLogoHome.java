package automatizacion_w3shool.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import automatizacion_w3shool.userinterface.NavigationElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickLogoHome implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(NavigationElements.W3SCHOOLS_LOGO)
        );
    }

    public static ClickLogoHome toGoHome() {
        return instrumented(ClickLogoHome.class);
    }
}