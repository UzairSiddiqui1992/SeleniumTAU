package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField= By.id("target");
    private By results=By.id("result");

    public KeyPressesPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void keyPresses(String text)
    {
            driver.findElement(inputField).sendKeys(text);
    }
    public String getResult()
    {
        return driver.findElement(results).getText();
    }

    public void enterSpecialCharacters()
    {
        keyPresses(Keys.chord(Keys.SHIFT,"2","3")+ "+4");
    }


}
