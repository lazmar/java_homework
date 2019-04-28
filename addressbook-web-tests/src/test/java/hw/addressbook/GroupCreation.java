package hw.addressbook;


import org.testng.annotations.*;


public class GroupCreation extends TestBase{


    @Test
    public void testGroupCreation() {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("name 1", "header 1", "footer 1"));
        app.submitGroupCreation();
        app.returnToGroupPage();

    }

}
