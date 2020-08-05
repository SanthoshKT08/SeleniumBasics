package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport_basic {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("extent_report_basic.html");
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlreport);
		
		ExtentTest test = report.createTest("my test case", "sample test");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		test.log(Status.INFO, "Testcases is starting");
		
		driver.get("https://www.google.com/");
		test.pass("its opend google");
		
		driver.manage().window().maximize();
		test.pass("maximize successfully");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("extent report"+Keys.ENTER);
		test.fail("validation success");
		Thread.sleep(3000);
		
		driver.close();
		test.pass("Browser closed");
		test.info("test completed");
	     // write everything in log file
		report.flush();
		
		
		
		
		
		
	}

}
