package Executions;

import org.testng.annotations.Test;

import Actions.LoginActions;
import Actions.WishlistActions;
import Objects.BrowserCode;

public class Executions {
	@Test
	public void Executionsex() throws Exception {
		Thread.sleep(5000);
		BrowserCode.Browser();
		LoginActions.adminLogin();
		WishlistActions.wish();
		EditExecutions obj = new EditExecutions();
		obj.edit("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\Book1.xlsx","Sheet2");
		/*ChangePasswordExecutions obj = new ChangePasswordExecutions();
		obj.password("D:\\gopikuncham\\BookStore\\External Files\\Book1.xlsx", "Sheet2");
		AddressExecutions obj=new AddressExecutions();
		obj.edit("D:\\gopikuncham\\BookStore\\External Files\\Book1.xlsx", "Sheet3");*/
	}
}