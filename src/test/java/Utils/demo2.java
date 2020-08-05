package Utils;

public class demo2 {
	
	public static void main(String[] args) {
		
		Excel2 obj2 =new Excel2("./Excel/Data.xlsx", "Sheet1");
		
		obj2.getdStringata(1, 1);

		obj2.getNumericdata(2, 2);
		
		obj2.getcolcount();
		obj2.getrowcount();
		
		
	}

}
