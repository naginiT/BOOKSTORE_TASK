package Executions;

import org.testng.annotations.Test;

import Actions.LoginActions;
import Objects.BrowserCode;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Email Text Box
 * Verifying Password Text Box
 * Verifying Login Button
*
*/
public class LoginExecutions {

	@Test
	public void indexEx() throws Exception {
		Thread.sleep(5000);
		BrowserCode.Browser();
		LoginActions.adminLogin();
	}
	
}