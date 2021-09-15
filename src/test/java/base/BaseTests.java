package base;

import com.google.common.io.Files;
import junit.framework.TestResult;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
        browserInitialize("Chrome");
        //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        goHome();
        setCookies();
        driver.manage().window().maximize();

    }

    @BeforeMethod
    public void goHome()
    {

        driver.get("http://the-internet.herokuapp.com/");
        homePage=new HomePage(driver);
    }

    @AfterMethod
    public void TakeScreenshots(ITestResult result)
    {
        if(ITestResult.FAILURE==result.getStatus())
        {
            var camera=(TakesScreenshot)driver;
            var screenshots=camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshots, new File("resources/screenshots/" + result.getName() + ".png"));
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    private ChromeOptions getChromeOptions()
    {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable-infobars");
        options.setHeadless(false);
        return options;
    }

    private void setCookies()
    {
        Cookie cookie=new Cookie.Builder("TAU","123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }



    @AfterClass
public void tearDown()

{
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.quit();
}

public WindowManager getWindow()
{
    return new WindowManager(driver);
}


public void browserInitialize(String browser)
{
    if(browser=="Chrome")
    {
        driver=new ChromeDriver(getChromeOptions());
    }
    else if (browser=="Firefox")
    {
        driver=new FirefoxDriver();
    }
}
}