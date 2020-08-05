package Listerners_ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {
	
	public static ExtentHtmlReporter htmlreport;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver;
	@BeforeTest
	public void StartREPORT()
	{
		htmlreport = new ExtentHtmlReporter("ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreport);
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Username", "Santhosh KT");
		htmlreport.loadXMLConfig("./Extent-Config.xml");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get("https://google.com/");
		test=extent.createTest("Test", "testcases is pass");
		htmlreport.config().setAutoCreateRelativePathMedia(true);
		Reporter.log("helloo");
		
		
		//test.log(Status.PASS, "True");
	}

	@Test
	public void test1()
	{
		test=extent.createTest("Test 1", "Testcase is fail");
		Assert.fail();
		//test.log(Status.FAIL, "Assert Fail");
	}
	
	@Test
	public void test2()
	{
		test=extent.createTest("Test 3", "Testcase is skip");
		//test.log(Status.SKIP, "Assert Fail");
		htmlreport.config().setAutoCreateRelativePathMedia(true);
		throw new SkipException("skipped");
		
	}
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getThrowable());
		}
		else if (result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, result.getThrowable());
		}
	
	}

	@AfterTest
	public void end_report()
	{
		extent.flush();
	}
}
