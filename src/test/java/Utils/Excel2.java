package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.CORBA.Object;

public class Excel2 {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	//creating constructor
	public Excel2(String Excelpath, String sheetname)
	{
		try {
			workbook = new XSSFWorkbook(Excelpath);
			 sheet = workbook.getSheet(sheetname);
			
			
		} catch (IOException e) 
		{
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static String getdStringata(int rowcount, int colcount)
	{
		String gi = sheet.getRow(rowcount).getCell(colcount).getStringCellValue();
		//System.out.println(gi);
		return gi;
		
		
	}
	
	public static double getNumericdata(int row, int col)
	{
		 double ni = sheet.getRow(row).getCell(col).getNumericCellValue();
		//System.out.println(ni);
		return ni;
	}
	
	public static int getrowcount()
	{
		int rowcount = sheet.getPhysicalNumberOfRows();
		//System.out.println(rowcount);
		return rowcount;
	}
	
	public static int getcolcount()
	{
		int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println(colcount);
		return colcount;
	}
	
	
	
	
	

}
