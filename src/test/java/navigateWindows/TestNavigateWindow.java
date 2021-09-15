package navigateWindows;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MultipleWindowsPage;

public class TestNavigateWindow extends BaseTests {
    @Test
    public void testNavigation()
    {
        var clicksOnExample=homePage.clicksOnDynmaicLoadingPage().clicksOnExample1Page();
        clicksOnExample.clickStartBtn();
        getWindow().goBack();
        getWindow().goForward();
        getWindow().refreshPage();
        getWindow().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab()
    {
        MultipleWindowsPage multipleWindow=homePage.clicksOnMultipleWindowPage();
        var newWindow=multipleWindow.clicksOnClickHere();
        getWindow().switchToWindow("New Window");
        Assert.assertEquals(newWindow.getTextData(),"New Window","Get Text incorrect!");
    }
}
