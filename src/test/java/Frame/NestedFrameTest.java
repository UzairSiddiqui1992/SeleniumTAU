package Frame;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;

public class NestedFrameTest extends BaseTests {
    @Test
    public void NestedFrameTest()
    {
        FramesPage framePage=homePage.clicksOnFramesPage();
        NestedFramesPage nestedFrames=framePage.clicksOnNestedFrame();
        String resultLeft=nestedFrames.getTextFromLeftFrame();
        String resultBottom=nestedFrames.getTextFromBottomFrame();
        Assert.assertEquals(resultLeft,"LEFT","Incorrect Left Frame Text");
        Assert.assertEquals(resultBottom,"BOTTOM","Incorret Bottom Frame Text");
    }
}
