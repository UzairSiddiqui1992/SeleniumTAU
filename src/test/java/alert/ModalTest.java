package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EntryAdModalPage;

public class ModalTest extends BaseTests {
    @Test
    public void CloseModal()
    {
        EntryAdModalPage modalPage=homePage.clicksOnEntryAd();

        modalPage.CloseModal();
    }
}
