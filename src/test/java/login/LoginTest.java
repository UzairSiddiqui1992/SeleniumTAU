package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage=homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.clickBtn();
        Assert.assertTrue(secureAreaPage.getAlert().contains("You logged into a secure area!"));

    }

}
