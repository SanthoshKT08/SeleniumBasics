package Execel_data_provider;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utiles {
	
	
	   XSSFWorkbook workbook;
	   XSSFSheet sheet;
	
	
	public Utiles(String Filepath, String sheetname)
	{
		try {
			workbook = new XSSFWorkbook(Filepath);
			sheet=workbook.getSheet(sheetname);
		} 
		
		catch (IOException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		
	}

}
