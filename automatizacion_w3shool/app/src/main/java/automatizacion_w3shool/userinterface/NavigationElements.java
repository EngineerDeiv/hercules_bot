package automatizacion_w3shool.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NavigationElements {

    // W3Schools logo at the top left
    public static final Target W3SCHOOLS_LOGO = Target.the("W3Schools logo")
            .located(By.id("w3-logo"));
    
    // Main navigation menu button
    public static final Target MAIN_MENU_BUTTON = Target.the("Main navigation menu button")
            .located(By.id("navbtn_menu"));
    
    // Navigation menu container
    public static final Target NAVIGATION_MENU = Target.the("Navigation menu")
            .located(By.id("sidenav"));
    
    // Vertical navigation menu
    public static final Target VERTICAL_MENU = Target.the("Vertical navigation menu")
            .located(By.cssSelector(".w3-bar-block"));
    
    // Home page indicator
    public static final Target HOME_PAGE_TITLE = Target.the("Home page title")
            .located(By.cssSelector("h1"));
    
    // Main content area
    public static final Target MAIN_CONTENT = Target.the("Main content area")
            .located(By.id("main"));
}