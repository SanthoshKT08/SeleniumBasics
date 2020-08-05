package Listeners_class;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestNG_Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("Starting :" + result.getName());
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is success :"+ result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed :"+ result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped :" +result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	
	}

	@Override
	public void onStart(ITestContext context) {

		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName());

	}



}
