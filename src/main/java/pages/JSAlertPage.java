package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertPage {
    private WebDriver driver;
    private By jsAlertt= By.cssSelector("li:nth-child(1)>button");
    private By jsConfirm=By.cssSelector("li:nth-child(2)>button");
    private By jsPrompt=By.cssSelector("li:nth-child(3) button");
    private By alertResult=By.id("result");

    public JSAlertPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void clicksOnAlertButton()
    {
        driver.findElement(jsAlertt).click();
    }

    public void clicksOnJSConfirmbutton()
    {
        driver.findElement(jsConfirm).click();
    }
    public String getAlertTextFromAlert()
    {
        return driver.switchTo().alert().getText();
    }

    public void clicksonJSPromptButton()
    {
        driver.findElement(jsPrompt).click();
    }
    public void clicksOnJSAlert()
    {
        driver.switchTo().alert().accept();
    }

    public void TextSend(String text)
    {
        driver.switchTo().alert().sendKeys(text);
        clicksOnJSAlert();
    }

    public void clicksOnJSConfirmAlert()
    {
        driver.switchTo().alert().dismiss();
    }

    public String getAlertResult()
    {
        return driver.findElement(alertResult).getText();
    }

    private void clicksOnJSConfirm()
    {
        driver.switchTo().alert().dismiss();
    }



}
