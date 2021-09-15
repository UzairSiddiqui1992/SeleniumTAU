package alert;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTest extends BaseTests {
    @Test
    public void testContextMenu()
    {
        ContextMenuPage contextMenuPage=homePage.clicksOnContext();
        contextMenuPage.clicksRight();
        String text=contextMenuPage.getTextFromAlert();
        contextMenuPage.clicksOnAccept();
        Assert.assertEquals(text,"You selected a context menu","Incorrect message");
    }


}
