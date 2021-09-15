package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By BoxArea= By.id("hot-spot");

    public ContextMenuPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void clicksRight()
    {
        Actions action=new Actions(driver);
        WebElement element=driver.findElement(BoxArea);
        action.contextClick(element).perform();
    }
    public void clicksOnAccept()
    {
        driver.switchTo().alert().accept();
    }
    public String getTextFromAlert()
    {
        return driver.switchTo().alert().getText();
    }

}
