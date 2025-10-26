package automatizacion_w3shool.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class AuthAction extends PageObject {
    // acceder al login
    public static Target BTN_SIGN_IN = Target.the("Sign In button").located(By.id("tnb-login-btn"));
    
    // FORM login
    public static Target INPUT_EMAIL = Target.the("input email").located(By.id("tnb-login-dropdown-email"));
    public static Target INPUT_CLAVE = Target.the("Enter your Password").located(By.id("tnb-login-dropdown-password"));
    public static Target BTN_INICIOSESION = Target.the("Click Button sign in").located(By.xpath("//button[@type='submit']//span[text()='Sign In']"));
    public static Target MENSAJE_LOGIN = Target.the("message login").located(By.xpath("//div[@data-testid='royal_login_form']"));

}
