package hw.addressbook.tests;

import hw.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreation extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().createGroup(new GroupData("name 1", "header 1", "footer 1"));

    }

}
