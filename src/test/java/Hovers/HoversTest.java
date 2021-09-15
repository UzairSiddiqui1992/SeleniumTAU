package Hovers;

import base.BaseTests;
import static org.testng.Assert.*;
import org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoversTest extends BaseTests {

    @Test
    public void testHoverUser1()
    {
        var hoverPage=homePage.clickHoversPage();
        var captionFigure=hoverPage.hoverOverFigure(1);
        assertTrue(captionFigure.captionIsDisplayed(),"Caption not displayed");
        assertEquals(captionFigure.getTitle(),"name: user1","Caption title incorrect!");
        assertEquals(captionFigure.getLinkText(),"View profile","Caption link text incorrect!");
        assertTrue(captionFigure.getLink().endsWith("/users/1"));


    }
}
