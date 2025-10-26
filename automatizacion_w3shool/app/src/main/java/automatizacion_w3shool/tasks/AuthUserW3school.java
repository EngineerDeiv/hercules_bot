package automatizacion_w3shool.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import automatizacion_w3shool.userinterface.AuthAction;
import automatizacion_w3shool.models.credentialsUserLogin;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AuthUserW3school implements Task {
    
    private final credentialsUserLogin credentials;

    public AuthUserW3school(credentialsUserLogin credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(AuthAction.BTN_SIGN_IN),
            Enter.theValue(credentials.getEmail()).into(AuthAction.INPUT_EMAIL),
            Enter.theValue(credentials.getPassword()).into(AuthAction.INPUT_CLAVE),
            Click.on(AuthAction.BTN_INICIOSESION)
        );
    }

    public static AuthUserW3school withCredentials(credentialsUserLogin credentials) {
        return instrumented(AuthUserW3school.class, credentials);
    }
}