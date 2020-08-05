package Groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters_demo {
	
	WebDriver driver;
	@BeforeTest
	public void start()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	@Test
	@Parameters({"URL","Search"})
	public void test(String url, String search)
	{
		driver.get(url);
	    driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(search);
	}
	
	@AfterTest
	public void end()
	{
	
	}

}
