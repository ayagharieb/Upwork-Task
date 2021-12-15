package Sign_in_Pages;
import com.shaft.gui.element.ElementActions;
import com.shaft.gui.element.WebDriverElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private  WebDriver driver;
    By signInButton=By.xpath("(//div[@class='header-nav none']//li)[5]");
    public  HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void signInMenu()
    {
        WebDriverElementActions.waitForElementToBePresent(driver,signInButton,5,true);
        ElementActions.click(driver, signInButton);

    }
}
