package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewPage {
    private WebDriver driver;
    private By textLocator= By.cssSelector(".example h3");

    public NewPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public String getTextData()
    {
        return driver.findElement(textLocator).getText();
    }
}
