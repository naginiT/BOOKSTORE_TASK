package Actions;


import org.openqa.selenium.Keys;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Objects.BrowserCode;
import Objects.EditInspectElements;
/* author Gopi Kuncham 
 * Verifying Login Tab
 * Verifying Email Text Box
 * Verifying Password Text Box
 * Verifying Login Button
 * Verifying Edit Tab
 * Verifying Continue Button
*
*/
public class EditActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;
	public static void edit(String path, String value) throws Exception{
	
		EditInspectElements.login().click();
		Thread.sleep(5000);
		
			 EditInspectElements.email().sendKeys("gk030994@gmail.com");
		Thread.sleep(5000);
			 EditInspectElements.pass().sendKeys("1234");
			 Thread.sleep(5000);
		     EditInspectElements.clickonlogin().click();
		     Thread.sleep(5000);
		     EditInspectElements.edit().click();
		     EditInspectElements.back().click(); //clicking on back button
		     EditInspectElements.edit().click();
		     
		     File f1=new File(path);
		 	FileInputStream fis=new FileInputStream(f1);
		 	workbook =new XSSFWorkbook(fis);
		 	sheet = workbook.getSheet(value);
		 	System.out.println("sheet.getLastRowNum()"+sheet.getLastRowNum());
			for(int j=1; j<=sheet.getLastRowNum(); j++) {
			EditInspectElements.firstname().clear();
			cell =sheet.getRow(j).getCell(1);
			EditInspectElements.firstname().sendKeys(cell.getStringCellValue());
			EditInspectElements.lastname().clear();
			cell =sheet.getRow(j).getCell(2);
			EditInspectElements.lastname().sendKeys(cell.getStringCellValue());
			EditInspectElements.emailid().clear();
			cell =sheet.getRow(j).getCell(3);
			EditInspectElements.emailid().sendKeys(cell.getStringCellValue());
			EditInspectElements.mobile().clear();
			cell =sheet.getRow(j).getCell(4);
					 if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
						    	long k =(long)cell.getNumericCellValue();
						    		String g=String.valueOf(k);
						    	            System.out.println(g);
						    	            Thread.sleep(5000);
						    	            EditInspectElements.mobile().sendKeys(g);
						   			   }
						       else {
							                EditInspectElements.mobile().sendKeys(cell.getStringCellValue());
						         }
								EditInspectElements.fax().clear();
				 cell =sheet.getRow(j).getCell(5);
				 if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
				    	long k =(long)cell.getNumericCellValue();
				    		String g=String.valueOf(k);
				    	            System.out.println(g);
				    	            Thread.sleep(5000);
				    	            EditInspectElements.fax().sendKeys(g);
				    	           
				   			   }
				       else {
					                EditInspectElements.fax().sendKeys(cell.getStringCellValue());
				         }
	}
			 EditInspectElements.cont().click(); //clicking on continue button
				BrowserCode.screenshot1("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\screenshot\\edit.png"); 	 
}
}

