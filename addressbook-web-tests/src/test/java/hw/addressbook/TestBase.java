package hw.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();

    }

    protected void submitCreation() {
      app.wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]")).click();
    }

    protected void fillContactForm(ContactData contactData) {
      app.wd.findElement(By.name("firstname")).click();
      app.wd.findElement(By.name("firstname")).clear();
      app.wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
      app.wd.findElement(By.name("middlename")).click();
      app.wd.findElement(By.name("middlename")).clear();
      app.wd.findElement(By.name("middlename")).sendKeys(contactData.getMiddlename());
      app.wd.findElement(By.name("lastname")).click();
      app.wd.findElement(By.name("lastname")).clear();
      app.wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
      app.wd.findElement(By.name("nickname")).click();
      app.wd.findElement(By.name("nickname")).click();
      app.wd.findElement(By.name("nickname")).clear();
      app.wd.findElement(By.name("nickname")).sendKeys(contactData.getNickname());
      app.wd.findElement(By.name("title")).click();
      app.wd.findElement(By.name("title")).clear();
      app.wd.findElement(By.name("title")).sendKeys(contactData.getTitle());
      app.wd.findElement(By.name("company")).click();
      app.wd.findElement(By.name("company")).clear();
      app.wd.findElement(By.name("company")).sendKeys(contactData.getCompany());
      app.wd.findElement(By.name("address")).click();
      app.wd.findElement(By.name("address")).clear();
      app.wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
      app.wd.findElement(By.name("home")).click();
      app.wd.findElement(By.name("home")).clear();
      app.wd.findElement(By.name("home")).sendKeys("111111");
      app.wd.findElement(By.name("mobile")).click();
      app.wd.findElement(By.name("mobile")).clear();
      app.wd.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
      app.wd.findElement(By.name("work")).click();
      app.wd.findElement(By.name("work")).clear();
      app.wd.findElement(By.name("work")).sendKeys(contactData.getWork());
      app.wd.findElement(By.name("fax")).click();
      app.wd.findElement(By.name("fax")).clear();
      app.wd.findElement(By.name("fax")).sendKeys(contactData.getFax());
      app.wd.findElement(By.name("email")).click();
      app.wd.findElement(By.name("email")).clear();
      app.wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
      app.wd.findElement(By.name("email2")).click();
      app.wd.findElement(By.name("email2")).clear();
      app.wd.findElement(By.name("email2")).sendKeys(contactData.getEmail2());
      app.wd.findElement(By.name("email3")).click();
      app.wd.findElement(By.name("email2")).click();
      app.wd.findElement(By.name("email3")).click();
      app.wd.findElement(By.name("email3")).click();
      app.wd.findElement(By.name("email3")).clear();
      app.wd.findElement(By.name("email3")).sendKeys(contactData.getEmail3());
      app.wd.findElement(By.name("homepage")).click();
      app.wd.findElement(By.name("homepage")).clear();
      app.wd.findElement(By.name("homepage")).sendKeys(contactData.getHomepage());
      app.wd.findElement(By.name("bday")).click();
      new Select(app.wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getBday());
      app.wd.findElement(By.name("bday")).click();
      app.wd.findElement(By.name("bmonth")).click();
      new Select(app.wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getBmonth());
      app.wd.findElement(By.name("bmonth")).click();
      app.wd.findElement(By.name("byear")).click();
      app.wd.findElement(By.name("byear")).clear();
      app.wd.findElement(By.name("byear")).sendKeys(contactData.getByear());
      app.wd.findElement(By.name("aday")).click();
      new Select(app.wd.findElement(By.name("aday"))).selectByVisibleText(contactData.getAday());
      app.wd.findElement(By.name("aday")).click();
      app.wd.findElement(By.name("amonth")).click();
      new Select(app.wd.findElement(By.name("amonth"))).selectByVisibleText(contactData.getAmonth());
      app.wd.findElement(By.name("amonth")).click();
      app.wd.findElement(By.name("ayear")).click();
      app.wd.findElement(By.name("ayear")).clear();
      app.wd.findElement(By.name("ayear")).sendKeys(contactData.getAyear());
      app.wd.findElement(By.name("address2")).click();
      app.wd.findElement(By.name("address2")).clear();
      app.wd.findElement(By.name("address2")).sendKeys(contactData.getAddress2());
      app.wd.findElement(By.name("phone2")).click();
      app.wd.findElement(By.name("phone2")).clear();
      app.wd.findElement(By.name("phone2")).sendKeys(contactData.getPhone2());
      app.wd.findElement(By.name("notes")).click();
      app.wd.findElement(By.name("notes")).clear();
      app.wd.findElement(By.name("notes")).sendKeys(contactData.getNotes());
    }

    protected void gotoNewContact() {
      app.wd.findElement(By.linkText("add new")).click();
    }
}
