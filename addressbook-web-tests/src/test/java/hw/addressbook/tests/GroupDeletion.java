package hw.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletion extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.gotoGroupPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    app.returnToGroupPage();

  }

}