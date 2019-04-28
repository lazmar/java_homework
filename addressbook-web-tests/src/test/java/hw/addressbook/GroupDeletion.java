package hw.addressbook;


import org.testng.annotations.*;


public class GroupDeletion extends TestBase {


  @Test
  public void testGroupDeletion()  {
      app.gotoGroupPage();
      app.selectGroup();
      app.deleteSelectedGroups();
      app.returnToGroupPage();

  }


}
