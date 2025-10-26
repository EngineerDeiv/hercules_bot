package automatizacion_w3shool.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToHomeBash implements Task {

    // Elementos del menú de navegación
    private static final Target LOGO_W3SCHOOLS = Target.the("W3Schools logo")
            .located(By.cssSelector("a[href='/']"));
    
    private static final Target BASH_MENU_ITEM = Target.the("Bash menu item")
            .located(By.xpath("//a[contains(text(),'BASH')]"));

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(LOGO_W3SCHOOLS),
            Click.on(BASH_MENU_ITEM)
        );
    }

    public static GoToHomeBash fromHomePage() {
        return instrumented(GoToHomeBash.class);
    }
}