package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) {
		Excel_utlis obj =new Excel_utlis("./Excel/Data.xlsx", "Sheet1");
		obj.getrowcount();
		 obj.getrowdata(1, 1);
		
		
	
		

	}

}
