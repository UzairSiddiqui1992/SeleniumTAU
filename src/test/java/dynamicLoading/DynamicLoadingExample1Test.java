package dynamicLoading;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingExample2Page;
import pages.DynamicLoadingPage;

public class DynamicLoadingExample1Test extends BaseTests {
    @Test
    public void testelementInvisibility()
    {
        DynamicLoadingPage dynamicLoadingPage=homePage.clicksOnDynmaicLoadingPage();
        DynamicLoadingExample1Page dynamicLoadingExample1Page=dynamicLoadingPage.clicksOnExample1Page();
        dynamicLoadingExample1Page.clickStartBtn();
        String result=dynamicLoadingExample1Page.getText();
        Assert.assertEquals(result,"Hello World!","Incorrect Result Page");

    }

    @Test
    public void testElementVisibility()
    {
        DynamicLoadingPage dynamicLoadingPage=homePage.clicksOnDynmaicLoadingPage();
        DynamicLoadingExample2Page dynamicLoadingExample2Page=dynamicLoadingPage.clicksOnExample2Page();
        dynamicLoadingExample2Page.clicksOnStartBtn();
        String result=dynamicLoadingExample2Page.getTextOfPage();
        Assert.assertEquals(result,"Hello World!","Visible text incorrect!");
    }
}
