package automatizacion_w3shool.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import automatizacion_w3shool.userinterface.NavigationElements;

public class IsVerticalMenuDisplayed implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(NavigationElements.VERTICAL_MENU).answeredBy(actor);
    }

    public static IsVerticalMenuDisplayed correctly() {
        return new IsVerticalMenuDisplayed();
    }
}