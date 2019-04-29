package hw.addressbook.tests;

import hw.addressbook.appmanager.HelperBase;
import hw.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupModification extends TestBase {
    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("name 1", "header 1", "footer 1"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();

    }
}
