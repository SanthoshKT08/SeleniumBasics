package Implicit_and_Explicit_wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait_1 {
	
	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.toppscholars.com/login");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9159977099");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='SignInBtn']")).click();
		
		WebDriverWait wait =new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='SignInBtn']")));
		
	}

}
