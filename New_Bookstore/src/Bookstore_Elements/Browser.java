package Bookstore_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Browser {
public	static WebDriver driver;
	@Test
	  public static WebDriver browser() throws Exception {
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\Bhargav\\Selenium\\chromedriver.exe");
		   driver=new ChromeDriver();
		//   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   driver.get("http://cubicitsolution.co.in/bookstore/"); 
		   return driver; 
}
}
