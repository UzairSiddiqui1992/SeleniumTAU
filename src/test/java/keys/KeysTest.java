package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTest extends BaseTests {

    @Test
    public void testBackSpace()
    {
        var keyPressPage=homePage.clickKeyPress();
        keyPressPage.keyPresses("A" + Keys.BACK_SPACE);
        assertEquals(keyPressPage.getResult(),"You entered: BACK_SPACE","Incorrect: BackSpace Test Failed!");
    }

    @Test
    public void testSpecialCharacters()
    {
        var keyTest=homePage.clickKeyPress();
        keyTest.enterSpecialCharacters();
        Assert.assertEquals(keyTest.getResult(),"You entered: 4","Incorrect");
    }
}
