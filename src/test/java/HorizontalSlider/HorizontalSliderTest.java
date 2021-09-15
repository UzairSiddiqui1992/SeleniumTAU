package HorizontalSlider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends BaseTests {

    @Test
    public void TestHorizontalSlider()
    {
        String value="4";
        var horizontalSlider=homePage.clickHorizontalSlider();
        horizontalSlider.clicksOnSlider(value);
        Assert.assertEquals(horizontalSlider.getText(),value, "Incorrect Value Found!");
    }


}
