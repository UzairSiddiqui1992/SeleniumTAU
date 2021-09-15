package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);

    }

    public DropdownPage clickDropdownLink() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHoversPage() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPress() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider() {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public JSAlertPage clicksOnJSAlert() {
        clickLink("JavaScript Alerts");
        return new JSAlertPage(driver);
    }

    public FileUploadsPage clicksOnFileUpload()
    {
        clickLink("File Upload");
        return new FileUploadsPage(driver);
    }
    public EntryAdModalPage clicksOnEntryAd()
    {
        clickLink("Entry Ad");
        return new EntryAdModalPage(driver);
    }
    public ContextMenuPage clicksOnContext()
    {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public FramesPage clicksOnFramesPage()
    {
        clickLink("Frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage clicksOnDynmaicLoadingPage()
    {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public MultipleWindowsPage clicksOnMultipleWindowPage()
    {
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }


}