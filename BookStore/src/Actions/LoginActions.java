package Actions;
import Objects.LoginInspectElements;

/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Email Text Box
 * Verifying Password Text Box
 * Verifying Login Button
*
*/
public class LoginActions {
	
	
public static void adminLogin() throws Exception{
	
	LoginInspectElements.login().click();
	Thread.sleep(5000);
	
		 LoginInspectElements.email().sendKeys("gk030994@gmail.com");
	Thread.sleep(5000);
		 LoginInspectElements.pass().sendKeys("1234");
		 Thread.sleep(5000);
	     LoginInspectElements.clickonlogin().click();
	     	
}

}

