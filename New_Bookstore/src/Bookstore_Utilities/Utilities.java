package Bookstore_Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Bookstore_Elements.Elements;

public class Utilities {
	static Actions action;

	  @Test
	  public static void hoveringoveragriculture(WebElement Agricultureelement,WebElement SubAgricultureelement,WebElement AgriculturalProductselement) {
			 try {
			 action.moveToElement(Elements.Agriculture()).build().perform();
			 action.moveToElement(Elements.SubAgriculture()).build().perform();
			  System.out.println("Element located successfully and hovered over SubAgriculture");
			  String text = Elements.Agriculturalproducts().getText();
			  if(text.equalsIgnoreCase("AGRICULTURAL PRODUCTS")) {
				  System.out.println("located subelement AGRICULTURAL PRODUCTS");
			  }
			  else {
					 System.out.println("Unable to locate the subelement in Agriculture menu");

				  
			  }
		         }
			 catch(Exception e)
			 {
						 System.out.println("Unable to locate the element"+e);
			 }
			 
	}
}
