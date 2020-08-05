package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_utlis {

	public static void main(String[] args) {
		getrowcount();
		getrowdata(1, 0);
		
	}
	
	
	public Excel_utlis(String Excelpath, String Sheetname) {
		XSSFWorkbook workbook;
		try {
			workbook = new XSSFWorkbook(Excelpath);
			XSSFSheet sheet = workbook.getSheet(Sheetname);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void getrowcount()
	{
		
		try
		{
			XSSFWorkbook workbook = new XSSFWorkbook("./Excel/Data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println(rowcount);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
	}
		
		public static void getrowdata(int rowNum ,  int colNum)
		{
			
			try
			{
				XSSFWorkbook workbook = new XSSFWorkbook("./Excel/Data.xlsx");
				XSSFSheet sheet = workbook.getSheet("Sheet1");
				//String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
				String celldata2 = sheet.getRow(rowNum).getCell(rowNum).getStringCellValue();
//				String celldata3 = sheet.getRow(rowNum).getCell(rowNum).getStringCellValue();
//				double no = sheet.getRow(rowNum).getCell(rowNum).getNumericCellValue();
//				double nos = sheet.getRow(rowNum).getCell(rowNum).getNumericCellValue();
            //	System.out.println(celldata);
				System.out.println(celldata2);
//				System.out.println(celldata3);
//				System.out.println(no);
//				System.out.println(nos);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e.getCause());
				System.out.println(e.getMessage());
			}
		
	}

}
