package log;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingExceptions {
	
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		try
		{
			driver.get("dsnfdskjgbnkls.com");
		}
		
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception is "+ e.getMessage());
		}
		
		driver.get("https://www.google.com/");
		
		System.out.println("learnt");
		
		
	}

}
