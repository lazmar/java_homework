package hw.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionFromStartPage extends TestBase{
    @Test
    public void testContactDeletionFromStartPage() {
        if (! app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().gotoNewContact();
            app.getContactHelper().createContact();
            app.getNavigationHelper().gotoHomePage();
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactDeletion();
        app.getContactHelper().closeAlert();
    }
}
