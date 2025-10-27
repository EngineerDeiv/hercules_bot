package automatizacion_w3shool.userinterface.MainScrollMenu;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NavScrollMenuOptions {

    // Target for the main scroll menu options
    public static final Target MAIN_SCROLL_MENU_OPTIONS = Target.the("Main scroll menu option")
            .located(By.id("subtopnav"));

    public static final Target CLICK_IN_THE_ARROW_AT_RIGHT = Target.the("Arrow button to the right")
            .located(By.id("scroll_right_btn"));

    public static final Target CLICK_IN_THE_ARROW_AT_LEFT = Target.the("Arrow button to the right")
            .located(By.id("scroll_left_btn"));
}