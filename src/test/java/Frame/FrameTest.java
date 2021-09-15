package Frame;

import base.BaseTests;
import org.testng.annotations.Test;

public class FrameTest extends BaseTests {
    @Test
    public void testiFrame()
    {
        var iFrameObj=homePage.clicksOnFramesPage();
        iFrameObj.clicksOniFrame();
    }
    @Test
    public void testNestedIFrames()
    {
        var nestedFrames=homePage.clicksOnFramesPage();
        nestedFrames.clicksOnNestedFrame();
    }
}
