package hw.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionFromStartPage extends TestBase{
    @Test
    public void testContactDeletionFromStartPage() {
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactDeletion();
        app.getContactHelper().closeAlert();
    }
}
