package Parallel_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	WebDriver driver;
	
    @Parameters("browsers")
	@BeforeTest
	public void setup(String browsernames)
	{
    	System.out.println("BowserName" + browsernames);
		if(browsernames.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browsernames.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browsernames.equalsIgnoreCase("ie")) 
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
	}
    
    @Test
    public void test()
    {
    	driver.get("https://www.google.com/");
    }
	
	@AfterTest
	public void end()
	{
		driver.close();
	}

}
