package Executions;

import Actions.LoginActions;
import Actions.WishlistActions;
import Objects.BrowserCode;

public class Mainexecution {
	public static void main(String[] args) throws Exception {
		
		Thread.sleep(5000);
		BrowserCode.Browser();
		LoginActions.adminLogin();
		
		Thread.sleep(5000);
		BrowserCode.Browser();
		AddressExecutions obj=new AddressExecutions();
		obj.edit("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\Book1.xlsx", "Sheet3");
		
		Thread.sleep(5000);
		BrowserCode.Browser();
		EditExecutions obj1 = new EditExecutions();
		obj1.edit("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\Book1.xlsx","Sheet1");
		
		Thread.sleep(5000);
		BrowserCode.Browser();
		ChangePasswordExecutions obj2 = new ChangePasswordExecutions();
		obj2.password("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\Book1.xlsx", "Sheet2");
		
		Thread.sleep(5000);
		BrowserCode.Browser();
		WishlistActions.wish();
	}
}
