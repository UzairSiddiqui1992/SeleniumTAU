package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {

    private WebDriver driver;
    private By startBtn= By.cssSelector("#start button");
    private By textOfPage=By.cssSelector("#finish >h4");

    public DynamicLoadingExample2Page(WebDriver driver)
    {
        this.driver=driver;
    }

    public void clicksOnStartBtn()
    {
        driver.findElement(startBtn).click();
        //WebDriverWait wait=new WebDriverWait(driver,5);
        //wait.until(ExpectedConditions.presenceOfElementLocated(textOfPage));

        FluentWait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                            .ignoring(NoSuchElementException.class)
                            .pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(textOfPage));


    }
    public boolean IsStartButtonDisplayed()
    {
        return driver.findElement(startBtn).isDisplayed();
    }
    public String getTextOfPage()
    {
        return driver.findElement(textOfPage).getText();
    }

}
