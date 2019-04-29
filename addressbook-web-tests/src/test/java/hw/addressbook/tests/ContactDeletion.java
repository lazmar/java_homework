package hw.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletion extends TestBase {
    @Test
    public void testContactDeletion() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().initContactDeletion();
        
    }
}
