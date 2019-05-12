package hw.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionFromEditPage extends TestBase {
    @Test
    public void testContactDeletion() {
        if (! app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().gotoNewContact();
            app.getContactHelper().createContact();
            app.getNavigationHelper().gotoHomePage();
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().initContactDeletion();

    }
}
