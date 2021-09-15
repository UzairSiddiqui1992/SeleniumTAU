package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample1Page {
    private WebDriver driver;

    private By startBtn= By.cssSelector("#start button");
    private By loadingIndicator=By.id("loading");
    private By textLocator=By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver)
    {
        this.driver=driver;
    }
    public void  clickStartBtn()
    {
        driver.findElement(startBtn).click();
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }
    public String getText()
    {
        return driver.findElement(textLocator).getText();
    }
    public boolean IsStartButtonDisplayed()
    {
        return driver.findElement(startBtn).isDisplayed();
    }
}
