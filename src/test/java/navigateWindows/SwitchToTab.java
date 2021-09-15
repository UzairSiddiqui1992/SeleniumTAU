package navigateWindows;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwitchToTab extends BaseTests {
    @Test
    public void testSwitchToTabExample2()
    {
        var DynamicLoading=homePage.clicksOnDynmaicLoadingPage();
        var DynamicLoadingPage2=DynamicLoading.openInNewTabExample2();
        getWindow().clickNewTab();
        Assert.assertTrue(DynamicLoadingPage2.IsStartButtonDisplayed(),"Start Button not displayed");
    }
    @Test
    public void testSwitchToTabExample1()
    {
        var DynamicLoading=homePage.clicksOnDynmaicLoadingPage();
        var DynamicLoadingExample1=DynamicLoading.openInNewTabExample1();
        getWindow().clickNewTab();
        Assert.assertTrue(DynamicLoadingExample1.IsStartButtonDisplayed(),"StartButton Example1 not displayed..");

    }

}
