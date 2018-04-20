package task1;

import Actions.AddressActions;
import Actions.ChangePasswordActions;
import Actions.EditActions;
import Actions.LoginActions;
import Actions.WishlistActions;
import Objects.BrowserCode;
public class mainclass {
	
public static void main(String[] args) throws Exception {
	

      Thread.sleep(5000);
      BrowserCode.Browser();
      LoginActions.adminLogin();
    
            
      Thread.sleep(5000);
      BrowserCode.Browser();
      AddressActions.edit("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\Book1.xlsx", "Sheet3");
     
      Thread.sleep(5000); 
      BrowserCode.Browser();
      EditActions.edit("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\Book1.xlsx","Sheet1");
     

      
      Thread.sleep(5000);
      BrowserCode.Browser();
      ChangePasswordActions.password("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\Book1.xlsx", "Sheet2");
 
      Thread.sleep(5000);
      BrowserCode.Browser();
      WishlistActions.wish();
     
}

}
