package BaseTest;

import Sign_in_Pages.HomePage;
import Sign_in_Pages.ResearchPage;
import Sign_in_Pages.SignInFormPage;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homepage;
    protected SignInFormPage signInFormPage;
    protected ResearchPage researchPage;

    @BeforeClass
    public void setup() {
        driver = DriverFactory.getDriver();
        BrowserActions.navigateToURL(driver, "https://default.fashlab-staging.fashcon.com/");
        homepage = new HomePage(driver);
        signInFormPage=new SignInFormPage(driver);
        researchPage=new ResearchPage(driver);
    }


}