package hw.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ContactCreation extends TestBase{



  @Test
  public void testContactCreation ()  {
    gotoNewContact();
    fillContactForm(new ContactData("FirstName", "MiddleName", "LastName", "nickname", "lorem ipsum link", "lorem ipsum", "lorem ipsum address", "222222", "33333", "444444", "11@qwerty.com", "13@qwerty.com", "13@qwerty.com", "qwerty.com", "15", "December", "1993", "16", "November", "2013", "address 2", "house 2", "notes"));
    submitCreation();
  }

}
