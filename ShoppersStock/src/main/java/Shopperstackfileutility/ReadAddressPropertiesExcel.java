package Shopperstackfileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class ReadAddressPropertiesExcel    {
	
	public FileInputStream fis = null;
	public Workbook wb;
	
	public Object[][] readAddressProperties (String excelname , String sheetname)
	{
		try {
			fis =new FileInputStream("./src/test/resources/"+excelname+".xlsx");
		}catch(FileNotFoundException e) {
		Reporter.log("path of file is wrong" , true);
		
	}
		try {
			wb=WorkbookFactory.create(fis);
			
		}
		catch(IOException e) {
			Reporter.log("workbook is not created" , true);
			
		}
		
	Sheet sheet = wb.getSheet(sheetname);
	int rowcount = sheet.getColumnOutlineLevel(0);
	int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
//	String Object[][]= getRow(()
	return null;
	
			

	}
	

}
