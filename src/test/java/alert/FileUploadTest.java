package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadsPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {
    @Test
    public void uploadFile()
    {
        FileUploadsPage fileUpload=homePage.clicksOnFileUpload();
        fileUpload.sendOfFile("C:\\Users\\01694\\Downloads\\M\\AUT.PNG");
        fileUpload.uploadFile();
        String text=fileUpload.getTextFile();
        assertEquals(text,"AUT.PNG","File incorrect");
    }
}
