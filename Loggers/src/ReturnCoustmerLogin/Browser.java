package ReturnCoustmerLogin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	
			 static WebDriver driver;
			
			public static WebDriver Openbrowser() 
			{
				
				
				System.setProperty("webdriver.chrome.driver","D:\\sarmila\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("http://cubicitsolution.co.in/bookstore/index.php?route=account/login");
				driver.manage().window().maximize();
				return driver;
				
				
			}

			


		}


