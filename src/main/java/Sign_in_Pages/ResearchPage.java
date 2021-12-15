package Sign_in_Pages;

import com.shaft.gui.element.ElementActions;
import com.shaft.gui.element.WebDriverElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResearchPage {
    private WebDriver driver;
    By Text =By.xpath("(//div[@class='region region-breadcrumb']//li)[2]");
    public  ResearchPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public String getTextName() {
        WebDriverElementActions.waitForElementToBePresent(driver, Text, 5, true);
        return ElementActions.getText(driver, Text);
    }
}
