package hw.addressbook.tests;

import hw.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreation extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoNewContact();
    app.getContactHelper().fillContactForm(new ContactData("FirstName", "MiddleName", "LastName", "nickname", "lorem ipsum link", "lorem ipsum", "lorem ipsum address", "22222", "33333", "444444", "11@qwerty.com", "13@qwerty.com", "13@qwerty.com", "qwerty.com", "15", "December", "1993", "16", "November", "2013", "address 2", "house 2", "notes", "name 1"), true);
    app.getContactHelper().submitCreation();

  }
}
