package Base;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
	public WebDriver driver;
		ExtentHtmlReporter htmlreport;
		ExtentReports report;
		 
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
