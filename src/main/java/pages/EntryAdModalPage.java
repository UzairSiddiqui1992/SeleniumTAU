package pages;

import net.bytebuddy.description.modifier.Visibility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class EntryAdModalPage {

    private WebDriverWait wait;
    private WebDriver driver;
    private By _closebtn= By.cssSelector(".modal-footer>p");


public EntryAdModalPage(WebDriver driver)
{
    this.driver=driver;
}
public void CloseModal()
{
    driver.switchTo().defaultContent();
    WebElement closeElement=wait.until(visibilityOfElementLocated(_closebtn));
    closeElement.click();
}

}
