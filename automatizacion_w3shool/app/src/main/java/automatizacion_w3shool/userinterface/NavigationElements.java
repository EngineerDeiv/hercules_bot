package automatizacion_w3shool.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NavigationElements {
    public static final Target MAIN_MENU_BUTTON = Target.the("Main navigation menu button")
            .located(By.id("navbtn_menu"));
}