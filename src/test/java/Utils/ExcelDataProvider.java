package Utils;

import org.omg.CORBA.Object;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;

public class ExcelDataProvider extends BaseClass {

	public static void main(String[] args) {
		testdata2();

	}
	
	@Test(dataProvider = "test1")
	public void test(String url , String link)
	{
		System.out.println(url+"  " + link);
		driver.get(link);
	
	}
	
	@DataProvider (name="test1")
	public static String[][] getdata()
	{
		String data[][]=testdata();
		return data;
	}
	
	public static String[][] testdata()
	{
		Excel2 datas = new Excel2("./Excel/Data.xlsx", "Sheet1");
		 int rowcount = datas.getrowcount();
		int colcount = datas.getcolcount();
		
		// creating object for 2D array.
		String data [][] = new String[rowcount][colcount];
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				String cells = datas.getdStringata(i, j);
				System.out.print(cells+"  ");
				data[i-1][j]=cells;
				
			}
			System.out.println();
		}
		return data;
	}
	
	
	public static Object[][] testdata2()
	{
		Excel2 datas = new Excel2("./Excel/Data.xlsx", "Sheet1");
		
		int rowcount = datas.getrowcount();
		int colcount=datas.getcolcount();
		
		Object data2 [][] = new Object[rowcount][colcount];
		
		for(int a=1;a<rowcount;a++)
		{
			for(int b=0;b<colcount;b++)
			{
				String getdatae = datas.getdStringata(a, b);
				System.out.println(getdatae);
				
			}
		}
		return data2;
		
	}
	

}
