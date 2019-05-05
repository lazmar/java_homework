package hw.addressbook.tests;

import hw.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupDeletion extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if ( ! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup (new GroupData("name 1", "header 1", "footer 1"));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();

  }

}
