package hw.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionFromEditPage extends TestBase {
    @Test
    public void testContactDeletion() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().initContactDeletion();

    }
}
