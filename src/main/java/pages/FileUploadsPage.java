package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadsPage {
    private WebDriver driver;
    private By _chooseFileBtn= By.id("file-upload");
    private By _uploadBtn=By.id("file-submit");
    private By _uploadFileText=By.id("uploaded-files");
    public FileUploadsPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void sendOfFile(String absolutePath)
    {
        driver.findElement(_chooseFileBtn).sendKeys(absolutePath);
    }
    public void uploadFile()
    {
        driver.findElement(_uploadBtn).click();
    }

    public String getTextFile()
    {
        return driver.findElement(_uploadFileText).getText();
    }



}
