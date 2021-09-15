package forgotPassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;
import pages.ForgotPasswordPage;
import pages.RetreivePasswordPage;
import pages.SecureAreaPage;

import java.util.concurrent.TimeUnit;

public class ForgotPasswordTest extends BaseTests {
    @Test
    public void RetreivePasswordTest() throws InterruptedException {
       // ForgotPasswordPage forgotPassword= homepage.clickForgotPassword();
        //var message=forgotPassword.RetreivePassword("Uzair.hasan@ositech.com");
      //  Assert.assertTrue(message.getInfoMessage().contains("Your e-mail's been sent!"));
        ForgotPasswordPage forgotPassword= homePage.clickForgotPassword();
        forgotPassword.enterEmail("uzair.hasan@ositech.com");
        TimeUnit.SECONDS.sleep(3);
        var message=forgotPassword.clickRetreivePassword().getInfoMessage();
        Assert.assertTrue(message.contains("Your e-mail's been sent!"));
    }
}
