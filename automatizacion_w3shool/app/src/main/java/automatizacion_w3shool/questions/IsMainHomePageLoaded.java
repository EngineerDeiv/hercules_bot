package automatizacion_w3shool.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import automatizacion_w3shool.userinterface.NavigationElements;

public class IsMainHomePageLoaded implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(NavigationElements.MAIN_CONTENT).answeredBy(actor);
    }

    public static IsMainHomePageLoaded correctly() {
        return new IsMainHomePageLoaded();
    }
}