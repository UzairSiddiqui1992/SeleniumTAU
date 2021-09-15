package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailTextbox= By.id("email");
    private By btnRetreivePassword=By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver)

    {
        this.driver=driver;
    }

    public void enterEmail(String email)
    {
        driver.findElement(emailTextbox).sendKeys(email);
    }
    public RetreivePasswordPage clickRetreivePassword()
    {
        driver.findElement(btnRetreivePassword).click();
        return new RetreivePasswordPage(driver);
    }
    public RetreivePasswordPage RetreivePassword(String email)
    {
        enterEmail(email);
        return clickRetreivePassword();
    }

}
