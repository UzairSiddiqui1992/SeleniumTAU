package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String frame_top="frame-top";
    private String frame_left="frame-left";
    private String frame_middle="frame-middle";
    private String frame_right="frame-right";
    private String frame_bottom="frame-bottom";
    private By getContent= By.tagName("body");

    public NestedFramesPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public String getTextFromLeftFrame()
    {
        switchTotopFrame();
        switchToLeftFrame();
        String leftText=driver.findElement(getContent).getText();
        switchToParentFrame();
        switchToParentFrame();
        return leftText;
    }

    public String getTextFromBottomFrame()
    {
        driver.switchTo().frame(frame_bottom);
        String bottomText=driver.findElement(getContent).getText();
        driver.switchTo().parentFrame();
        return bottomText;
    }

    private void switchToLeftFrame()
    {
        driver.switchTo().frame(frame_left);
    }
    private void switchTotopFrame()
    {
        driver.switchTo().frame(frame_top);
    }




    private void switchToParentFrame()
    {
        driver.switchTo().parentFrame();
    }
}
