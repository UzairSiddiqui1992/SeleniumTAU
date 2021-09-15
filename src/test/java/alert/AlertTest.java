package alert;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JSAlertPage;

public class AlertTest extends BaseTests {

    @Test
    public void testAccept()
    {
        JSAlertPage jsAlertPage= homePage.clicksOnJSAlert();
        jsAlertPage.clicksOnAlertButton();
        jsAlertPage.clicksOnJSAlert();
        Assert.assertEquals(jsAlertPage.getAlertResult(),"You successfully clicked an alert","There is an error on Accept alert.");
    }

    @Test
    public void testDismiss()
    {
        var jsAlertDismiss=homePage.clicksOnJSAlert();
        jsAlertDismiss.clicksOnJSConfirmbutton();
        String text=jsAlertDismiss.getAlertTextFromAlert();
        jsAlertDismiss.clicksOnJSConfirmAlert();
        Assert.assertEquals(text,"I am a JS Confirm","Cancel message incorrect");

    }
    @Test
    public void testAcceptPrompt()
    {
        JSAlertPage jsAlertPage= homePage.clicksOnJSAlert();
        jsAlertPage.clicksonJSPromptButton();
        jsAlertPage.TextSend("Uzair Hasan");
        Assert.assertEquals(jsAlertPage.getAlertResult(),"You entered: Uzair Hasan","JS Prompt incorrect!");
    }


}
