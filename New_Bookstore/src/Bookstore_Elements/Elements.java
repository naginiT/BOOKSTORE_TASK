package Bookstore_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Bookstore_Utilities.Utilities;

public class Elements extends Browser{
	static By myaccount        = By.cssSelector("#topbar >  div > div > div.col-md-8.col-sm-8.col-xs-6.header-right > ul:nth-child(2) > li:nth-child(1) > a > span");
	static By agriculture      = By.cssSelector("#bs-megamenu > ul > li:nth-child(2) > a > span.menu-title");
    static By subagriculture   = By.cssSelector("#bs-megamenu > ul > li:nth-child(2) > div > div > div > div > div > ul > li:nth-child(1) > a > span");
    static By AgriculturalProducts   = By.cssSelector("#bs-megamenu > ul > li:nth-child(2) > div > div > div > div > div > ul > li:nth-child(1) > div > div > div > div > div > ul > li:nth-child(1) > a");
	static By Food             = By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[2]/div/div/div/div/div/ul/li[2]/a/span");
	static By Beverage         = By.xpath("//*[@id=\"bs-megamenu\"]/ul/li[2]/div/div/div/div/div/ul/li[3]/a/span");
	static By FoodServices     = By.cssSelector("#bs-megamenu > ul > li:nth-child(2) > div > div > div > div > div > ul > li:nth-child(4) > a > span");
	static By TobaccoIndustry  = By.cssSelector("#bs-megamenu > ul > li:nth-child(2) > div > div > div > div > div > ul > li:nth-child(5) > a > span");


	

	
	  
static WebElement element;
	
	public Elements(WebDriver driver)
	{
		super();
	}
	
	
	
    public static WebElement account() {
    	WebElement element;
	element = driver.findElement(myaccount);
	return element;
    }
    
    public static WebElement Agriculture() {
    	element = driver.findElement(agriculture);
    	//Utilities.hoveringoveragriculture(,);
	return element;
    }
    
    public static WebElement SubAgriculture() {
    	element = driver.findElement(subagriculture);
    	return element;
        }
    
    public static WebElement Agriculturalproducts() {
    	element = driver.findElement(AgriculturalProducts);
    	return element;
        }

    public static WebElement food() {
    	element = driver.findElement(Food);
    	return element;
        }
    
    public static WebElement beverage() {
    	element = driver.findElement(Beverage);
    	return element;
        }
    
    public static WebElement Foodservices() {
    	element = driver.findElement(FoodServices);
    	return element;
        }
    
    public static WebElement Tobaccoindustry() {
    	element = driver.findElement(TobaccoIndustry);
    	return element;

        }
}
    