package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class DropdownPage {

private WebDriver driver;
private By dropdownElement=By.id("dropdown");


public DropdownPage(WebDriver driver)
{
    this.driver=driver;
}
public void dropdownSelect(String option)
{
    Select selectDropdown=getSelectDropdown();
    selectDropdown.selectByVisibleText(option);
}

public List<String> getSelectText()
{
    List<WebElement> selectedOptions= getSelectDropdown().getAllSelectedOptions();
    return selectedOptions.stream().map(e->e.getText()).collect(Collectors.toList());
}
private Select getSelectDropdown()
{
    return new Select(driver.findElement(dropdownElement));
}


}

