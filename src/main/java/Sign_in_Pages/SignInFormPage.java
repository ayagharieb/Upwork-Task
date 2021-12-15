package Sign_in_Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInFormPage {
    private WebDriver driver;
    By email=By.xpath("//input[@type='email']");
    By pass=By.xpath("//input[@type='password']");
    By logIn=By.xpath("//input[@type='submit']");
    public  SignInFormPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void signInCredintials(String Email,String Pass)
    {
        ElementActions.type(driver,email,Email);
        ElementActions.type(driver,pass,Pass);
    }
    public ResearchPage succlogin()
    {
        ElementActions.click(driver,logIn);
        return new ResearchPage(driver);
    }
}
