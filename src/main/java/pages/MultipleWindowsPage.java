package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By linkClickHere= By.cssSelector(".example a");

    public MultipleWindowsPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public NewPage clicksOnClickHere()
    {
        driver.findElement(linkClickHere).click();
        return new NewPage(driver);
    }
}
