package Executions;

import org.testng.annotations.Test;

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
	@Test
	public void addressEx() throws Exception {
		Thread.sleep(5000);
		BrowserCode.Browser();
		
		AddressExecutions obj=new AddressExecutions();
		obj.edit("D:\\gopikuncham\\BookStore\\External Files\\Book1.xlsx", "Sheet3");
}
}
