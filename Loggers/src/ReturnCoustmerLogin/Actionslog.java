package ReturnCoustmerLogin;
import ReturnCoustmerLogin.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Actionslog {
	
	
	/*public static void Execute() throws Exception
	 {
		*/
	/*try {
		
	
			Objects.uid1().sendKeys("chaitanya@gmail.com");
			Log.info("element located succsesfully");
			System.out.println("Element Located succsesfully");
	}
	catch(Exception e)
	//Log.error("element not located succsesfully");
	{
		
	}
			
		try {
			
		
		
		Objects.password().sendKeys("hyderabad");
		Log.info("element located succsesfully");
		System.out.println("element not located succsesfully");
		}
		catch(Exception e)
		{
		//	Log.error("element not located succsesfully");
		}
		
		Objects.click().click();
	 }*/
//}


    
	/*WebDriver driver;*/
    static XSSFWorkbook work;
	static XSSFSheet sheet;
	static XSSFCell cell;
	 static int i;
	public static void exeec11() throws Exception
	{
	File f= new File("D:\\sarmila\\Bookstore11.xlsx");
	FileInputStream fis = new FileInputStream(f);
	work=new XSSFWorkbook(fis);
	sheet = work.getSheet("sheet1");
	for(int i=1; i<=sheet.getLastRowNum();i++)
	{	
		Browser.Openbrowser();
		try {
		cell=sheet.getRow(i).getCell(0);
		if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		{
			
		
		 int cv =(int)cell.getNumericCellValue();
 		String cn=String.valueOf(cv);
		
 		
		Objects.uid11().sendKeys(cn);
		}
		cell=sheet.getRow(i).getCell(0);
		    if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING)
		  {
			Objects.uid11().sendKeys(cell.getStringCellValue());
		   }
		    cell=sheet.getRow(i).getCell(0);  
		if(cell.getCellType()==XSSFCell.CELL_TYPE_BLANK)
		{
			Objects.uid11().sendKeys(null);
		}
		System.out.println("elements located succsesfully");
		//Log.info("elements located succsesfully");
	}
	catch(Exception e){
		System.out.println("unable to locate elements");
		//Log.error("unable to locate elements");
	}
		try {
		cell=sheet.getRow(i).getCell(1);
		//String data= (String)work.getSheetAt(0).getRow(i).getCell(2).getStringCellValue();
		
		
		if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
		{
			int cc =(int)cell.getNumericCellValue();
 		String cs=String.valueOf(cc);
 		Objects.password().sendKeys(cs);
		}
		cell=sheet.getRow(i).getCell(1);
		if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING)
		
		{
			Objects.password().sendKeys(cell.getStringCellValue());	
		}
		cell=sheet.getRow(i).getCell(1);
		if(cell.getCellType()==XSSFCell.CELL_TYPE_BLANK)
		{
			Objects.password().sendKeys();
		}
		System.out.println("elements located succsesfully");
		//Log.info("elements located succsesfully");
		}
		catch(Exception e) {
			System.out.println("unable to locate elements");
			//Log.error("unable to locate elements");
			
		}
		Objects.login22().click();

		}
		
		
		
		
	String s="pass";
		sheet.getRow(i).createCell(5).setCellValue(s);
		FileOutputStream fos=new FileOutputStream(f);
		work.write(fos);
		fos.close();
		}
	

		/*cell=sheet.getRow(i).getCell(0);
		Objects.uid11().sendKeys(cell.getStringCellValue());
		Thread.sleep(3000);
		cell=sheet.getRow(i).getCell(1);
		Objects.password().sendKeys(cell.getStringCellValue());
		Thread.sleep(5000);
		Objects.login22().click();
		String s="pass";
		sheet.getRow(i).createCell(5).setCellValue(s);
		FileOutputStream fos=new FileOutputStream(f);
		work.write(fos);
		fos.close();*/
		
	
	}

	
	

		



