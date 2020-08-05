package Base;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import POM.Google_page;

public class Testcase extends BaseClass{
	@Test
	public void run()
	{
		ExtentTest Test = report.createTest("Google 1","Multiple Scenario in google");
		Google_page obj =new Google_page(driver);
		Test.log(Status.INFO, "OPened google");
		obj.Search_something_in_google();
		logger.info("Search functionality is working");
		Test.pass("Search successfully");
		driver.navigate().back();
		obj.click_policy();
		logger.info("go to policy page");
		Test.pass("Redirected to policy page");
		driver.navigate().back();
		obj.click_term();
		logger.info("go to terms and condition page");
		Test.pass("Redirected to Terms page");
		driver.navigate().back();
		obj.Click_images_link();
		Test.pass("Redirected to image page");
		driver.navigate().back();
		obj.Click_images_link();
		Test.pass("Redirected to image link page");
        System.out.println("Test case 1");
	}
	
}
