package dropdown;

import base.BaseTests;
import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.DropdownPage;



public class DropdownTest extends BaseTests {

    @Test
    public void selectDropdown()
    {
        DropdownPage dropdownPage= homePage.clickDropdownLink();
        String option="Option 1";
        dropdownPage.dropdownSelect(option);
        var getSelectOptions=dropdownPage.getSelectText();
        Assert.assertEquals(getSelectOptions.size(),1,"incorrect size option");
        Assert.assertTrue(getSelectOptions.contains(option),"Option not selected");


    }

}
