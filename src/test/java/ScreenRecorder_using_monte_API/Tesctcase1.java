package ScreenRecorder_using_monte_API;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tesctcase1 {
	
	@Test
	public void Login_01() throws Exception
	{
		ScreenRecorderUtil.startRecord("Login_01");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.toppscholars.com/login");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9159977099");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='SignInBtn']")).click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Toppscholars - India's leading Learning App", title);
		ScreenRecorderUtil.stopRecord();
//		WebDriverWait wait =new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='SignInBtn']")));
		
		
	}

}
