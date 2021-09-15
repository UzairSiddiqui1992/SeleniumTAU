package Frame;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.iFramePage;

import java.awt.*;

public class iFrameTest extends BaseTests {
    @Test
    public void testIFrames()
    {
        FramesPage framesPage=homePage.clicksOnFramesPage();
        iFramePage iFrame=framesPage.clicksOniFrame();
        iFrame.clearTextArea();
        iFrame.setTextArea("Hello ");
        iFrame.clicksDecreaseIndent();
        iFrame.setTextArea("World");
        Assert.assertEquals(iFrame.getTextFromTextArea(),"Hello World","Incorrect Text");

    }
}
