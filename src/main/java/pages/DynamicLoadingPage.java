package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class DynamicLoadingPage {
    private WebDriver driver;

    public DynamicLoadingPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public DynamicLoadingExample1Page clicksOnExample1Page()
    {
        clicksOnDynamicPage("Example 1:");
        return new DynamicLoadingExample1Page(driver);
    }
    public DynamicLoadingExample2Page clicksOnExample2Page()
    {
        clicksOnDynamicPage("Example 2");
        return new DynamicLoadingExample2Page(driver);
    }
    public void clicksOnDynamicPage(String partialLinkText)
    {
        driver.findElement(By.partialLinkText(partialLinkText)).click();
    }
    public DynamicLoadingExample2Page openInNewTabExample2()
    {
        String clickBtn=Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.partialLinkText("Example 2")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
        return new DynamicLoadingExample2Page(driver);

    }
    public DynamicLoadingExample1Page openInNewTabExample1()
    {
        driver.findElement(By.partialLinkText("Example 1")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
        return new DynamicLoadingExample1Page(driver);
    }
}
