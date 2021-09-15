package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By clicksSlider=By.cssSelector(".sliderContainer input");
    private By rangeValue=By.id("range");

    public HorizontalSliderPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public  void clicksOnSlider(String value)
    {
        while(!value.equals(getText()))
        driver.findElement(clicksSlider).sendKeys(Keys.ARROW_RIGHT);
    }
    public String getText()
    {
        return driver.findElement(rangeValue).getText();
    }




}
