package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetreivePasswordPage {
    private WebDriver driver;
    private By getConfirmationText= By.id("content");

    public RetreivePasswordPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public String getInfoMessage()
    {
        String message=driver.findElement(getConfirmationText).getText();
        return message;
    }
}
