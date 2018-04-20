package Actions;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.AddressInspectElements;
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
public class AddressActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;
	public static void edit(String path, String value) throws Exception{
	
		AddressInspectElements.login().click();
		Thread.sleep(5000);
		
		AddressInspectElements.email().sendKeys("gk030994@gmail.com");
		Thread.sleep(5000);
		AddressInspectElements.pass().sendKeys("1234");
		Thread.sleep(5000);
		AddressInspectElements.clickonlogin().click();
		Thread.sleep(5000);
		AddressInspectElements.address().click();
		AddressInspectElements.back1().click(); //clicking on back button
		AddressInspectElements.address().click();
		Thread.sleep(5000);
		AddressInspectElements.delete().click();
		Thread.sleep(5000);
		AddressInspectElements.edit().click();
	    Thread.sleep(5000);    
		AddressInspectElements.back().click(); //clicking on back button
        Thread.sleep(5000);
		AddressInspectElements.edit().click();
		Thread.sleep(5000);
		     
		     
		     
		     
		    File f1=new File(path);
		 	FileInputStream fis=new FileInputStream(f1);
		    workbook =new XSSFWorkbook(fis);
		 	sheet = workbook.getSheet(value); ////////////
		 	
		 	
		 	
		 	
		 	
		 	System.out.println("sheet.getLastRowNum()"+sheet.getLastRowNum());
			for(int j=1; j<=1; j++) {
				 AddressInspectElements.firstname().clear();
				 AddressInspectElements.lastname().clear();
				 AddressInspectElements.company().clear();
				 AddressInspectElements.address1().clear();
				 AddressInspectElements.address2().clear();
				 AddressInspectElements.city().clear();
				 AddressInspectElements.postcode().clear();		 
				 AddressInspectElements.cont().click();
				 
				 cell =sheet.getRow(j).getCell(1);
				 AddressInspectElements.firstname().sendKeys(cell.getStringCellValue());
				 cell =sheet.getRow(j).getCell(2);
				 AddressInspectElements.lastname().sendKeys(cell.getStringCellValue());
				 cell =sheet.getRow(j).getCell(3);
				 AddressInspectElements.company().sendKeys(cell.getStringCellValue());
				 cell =sheet.getRow(j).getCell(4);
				 AddressInspectElements.address1().sendKeys(cell.getStringCellValue());
				 cell =sheet.getRow(j).getCell(5);
				 AddressInspectElements.address2().sendKeys(cell.getStringCellValue());
				 cell =sheet.getRow(j).getCell(6);
				 AddressInspectElements.city().sendKeys(cell.getStringCellValue());
				 cell =sheet.getRow(j).getCell(7);
			                if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
			   	                            long k =(long)cell.getNumericCellValue();
				                            String g=String.valueOf(k);
				                            System.out.println(g);
						    	            Thread.sleep(5000);
						    	            AddressInspectElements.postcode().sendKeys(g);
						   			   }
						       else {
						    	   AddressInspectElements.postcode().sendKeys(cell.getStringCellValue());
						         }
							 cell =sheet.getRow(j).getCell(8);
							 Thread.sleep(5000);
							 AddressInspectElements.country().selectByIndex(106);
							 //cell =sheet.getRow(j).getCell(9);
							 Thread.sleep(5000);
							 AddressInspectElements.region().selectByIndex(2);

							 AddressInspectElements.defaultaddressno().click();
							 Thread.sleep(5000);

							 AddressInspectElements.cont().click();		//clicking on continue button
	}
			Thread.sleep(5000);
			AddressInspectElements.newaddress().click();
			Thread.sleep(5000);
			 AddressInspectElements.cont().click();
			 for(int j=1; j<=1; j++) {
			 cell =sheet.getRow(j).getCell(1);
			 AddressInspectElements.firstname().sendKeys(cell.getStringCellValue());
				 cell =sheet.getRow(j).getCell(2);
				 AddressInspectElements.lastname().sendKeys(cell.getStringCellValue());
					 cell =sheet.getRow(j).getCell(3);
					 AddressInspectElements.company().sendKeys(cell.getStringCellValue());
					 cell =sheet.getRow(j).getCell(4);
					 AddressInspectElements.address1().sendKeys(cell.getStringCellValue());
					 cell =sheet.getRow(j).getCell(5);
					 AddressInspectElements.address2().sendKeys(cell.getStringCellValue());
					 cell =sheet.getRow(j).getCell(6);
					 AddressInspectElements.city().sendKeys(cell.getStringCellValue());
						cell =sheet.getRow(j).getCell(7);
						 if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
					    	long k =(long)cell.getNumericCellValue();
					    		String g=String.valueOf(k);
					    	            System.out.println(g);
					    	            Thread.sleep(5000);
					    	            AddressInspectElements.postcode().sendKeys(g);
					    	            
					   			   }
					       else {
					    	   AddressInspectElements.postcode().sendKeys(cell.getStringCellValue());
					         }
						 Thread.sleep(5000);
						 AddressInspectElements.country().selectByIndex(106);
						 //cell =sheet.getRow(j).getCell(9);
						 Thread.sleep(5000);
						 AddressInspectElements.region().selectByIndex(2);
						 AddressInspectElements.defaultaddressno().click();
						 AddressInspectElements.cont().click();		//clicking on continue button
			AddressInspectElements.delete().click();
			BrowserCode.screenshot1("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\screenshot\\address.png"); 
			
}
}
}