package Executions;

import org.testng.annotations.Test;
import Actions.ChangePasswordActions;
import Objects.BrowserCode;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Change your password Tab
 * Verifying Back Button
 * Verifying Continue Button
*
*/
public class ChangePasswordExecutions extends ChangePasswordActions {
	@Test
	public void Signin() throws Exception
	{
	Thread.sleep(5000);
	BrowserCode.Browser();
	ChangePasswordExecutions obj = new ChangePasswordExecutions();
	obj.password("D:\\gopikuncham\\BookStore\\External Files\\Book1.xlsx", "Sheet2");
	
	}
}
