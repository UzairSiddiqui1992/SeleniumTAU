package utils;

import org.openqa.selenium.WebDriver;

import java.awt.event.WindowListener;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver)
    {
        this.driver=driver;
        navigate= driver.navigate();
    }

    public void goBack()
    {
        navigate.back();
    }
    public void goForward()
    {
        navigate.forward();
    }
    public void refreshPage()
    {
        navigate.refresh();
    }
    public void goTo(String url)
    {
        navigate.to(url);
    }
    public void switchToWindow(String title)
    {
        var window=driver.getWindowHandles();

        for(String windows:window)
        {
            driver.switchTo().window(windows);
            if(title.equals(driver.getTitle()))
            {
                break;
            }
        }

    }
    public void clickNewTab()
    {
        var newTab=driver.getWindowHandles();
        newTab.forEach(driver.switchTo()::window);
    }
}
