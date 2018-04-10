package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Email Text Box
 * Verifying Password Text Box
 * Verifying Login Button
*
*/
public class LoginInspectElements extends BrowserCode{
	static WebElement element;
	static By login=By.xpath("//*[@id=\"topbar\"]/div/div/div[1]/ul[1]/li[2]/a/span");
	static By email=By.name("email");
	static By pass=By.name("password");
	static By clickonlogin=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
	/*public LoginInspectElements(WebDriver driver)
	{
		super();
	}

	*/
	public static WebElement login()
	{
	element= driver.findElement(login);
	return element;
	}
	public static WebElement  email()
	{
	element=driver.findElement(email);
	return element;
	}
	public static WebElement pass()
	{
	element=driver.findElement(pass);
	return element;
	}
	public static WebElement clickonlogin()
	{
	element=driver.findElement(clickonlogin);
	return element;
	}
	

}