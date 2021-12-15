package signIn;

import BaseTest.BaseTests;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.ValidationEnums;
import com.shaft.validation.Validations;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignInTest extends BaseTests {

    @Test
    public void SignIn()
    {
        homepage.signInMenu();
        signInFormPage.signInCredintials("xohigeg992@macauvpn.com","Testpass1");
        signInFormPage.succlogin();

        Validations.assertThat().browser(driver)
                .attribute(ValidationEnums.BrowserAttribute.CURRENT_URL)
                .contains("label")
                .perform();
    }
}
