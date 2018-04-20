package Executions;

import Actions.AddressActions;
import Objects.BrowserCode;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Modify your address book entries Tab
 * Verifying Back Button
 * Verifying Edit Button
 * Verifying Delete Button
 * Verifying Continue Button
 * Verifying NewAddress Button
*
*/
public class AddressExecutions extends AddressActions {
	
	public static void addressEx() throws Exception {
		Thread.sleep(5000);
		BrowserCode.Browser();
		AddressExecutions obj=new AddressExecutions();
		obj.edit("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\Book1.xlsx", "Sheet3");
	
	}
}
