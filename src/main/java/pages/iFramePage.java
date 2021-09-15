package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class iFramePage {
    private WebDriver driver;
    private String iFrame="mce_0_ifr";
    private By textArea= By.id("tinymce");
    private By decreaseIndent=By.cssSelector(".tox-toolbar__primary>div:nth-child(5)>button:nth-child(2)");

    public iFramePage(WebDriver driver)
    {
        this.driver=driver;
    }

    private void switchTextArea()
    {
        driver.switchTo().frame(iFrame);
    }

    private void switchMainArea()
    {
        driver.switchTo().parentFrame();
    }
    public void clearTextArea()
    {
        switchTextArea();
        driver.findElement(textArea).clear();
        switchMainArea();
    }
    public void setTextArea(String text)
    {
        switchTextArea();
        driver.findElement(textArea).sendKeys(text);
        switchMainArea();
    }
    public void clicksDecreaseIndent()
    {
        driver.findElement(decreaseIndent).click();
    }
    public String getTextFromTextArea()
    {
        switchTextArea();
        String text=driver.findElement(textArea).getText();
        switchMainArea();
        return text;
    }


}
