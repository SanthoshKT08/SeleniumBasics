package Config;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2 {

	public WebDriver driver;
	ExtentHtmlReporter htmlreport;
	ExtentReports report;
    pro2 obj = new pro2();
    
  


	public static Logger logger = LogManager.getLogger(BaseClass.class);


	@BeforeSuite
	public void extentStart()
	{
		htmlreport = new ExtentHtmlReporter("ExtentReport_4.html");	
		report = new ExtentReports();
		report.attachReporter(htmlreport);
	}


	@BeforeTest
	public void setUP()
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(obj.get_url());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(obj.search()+Keys.ENTER);
	}
	
	@Test
	public void test()
	{
		
		System.out.println("success");
		Reporter.log("awsed");
	}


	@AfterTest
	public void endapp() 
	{
		driver.close();
	}

	@AfterSuite
	public void flush()
	{
		report.flush();
	}




}
