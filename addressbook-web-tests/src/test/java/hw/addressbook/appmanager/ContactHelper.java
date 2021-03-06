package hw.addressbook.appmanager;

import hw.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitCreation() {
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("work"), contactData.getWork());
        type(By.name("fax"), contactData.getFax());
        type(By.name("email"), contactData.getEmail());
        type(By.name("email2"), contactData.getEmail2());
        type(By.name("email3"), contactData.getEmail3());
        type(By.name("homepage"), contactData.getHomepage());
        clickAndSelect(By.name("bday"), contactData.getBday());
        clickAndSelect(By.name("bmonth"), contactData.getBmonth());
        type(By.name("byear"), contactData.getByear());
        clickAndSelect(By.name("aday"), contactData.getAday());
        clickAndSelect(By.name("amonth"), contactData.getAmonth());
        type(By.name("ayear"), contactData.getAyear());
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getPhone2());
        type(By.name("notes"), contactData.getNotes());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());

        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }



    public void initContactModification() {
        click(By.xpath("//img[@alt='Edit']"));
    }


    public void submitContactModification() {
        click(By.name( "update"));
    }

    public void initContactDeletion() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void closeAlert() {
        wd.switchTo().alert().accept();
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }


    public boolean isThereAContact() {
        return isElementPresent (By.name("selected[]"));
    }

    public void createContact() {
        fillContactForm(new ContactData("FirstName", "MiddleName", "LastName", "nickname", "lorem ipsum link", "lorem ipsum", "lorem ipsum address", "22222", "33333", "444444", "11@qwerty.com", "13@qwerty.com", "13@qwerty.com", "qwerty.com", "15", "December", "1993", "16", "November", "2013", "address 2", "house 2", "notes", "name 1"), true);
        submitCreation();
    }
}

