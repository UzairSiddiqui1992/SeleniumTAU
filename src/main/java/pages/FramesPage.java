package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;
    private By iFrame= By.linkText("iFrame");
    private By nestedFrames=By.linkText("Nested Frames");


    public FramesPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public iFramePage clicksOniFrame()
    {
        driver.findElement(iFrame).click();
        return new iFramePage(driver);
    }

    public NestedFramesPage clicksOnNestedFrame()
    {
        driver.findElement(nestedFrames).click();
        return new NestedFramesPage(driver);
    }

}
