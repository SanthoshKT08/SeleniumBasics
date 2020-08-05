package Listerners_ExtentReport;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginFB()
	{
		System.out.println("Login to FaceBook");
		Assert.assertEquals("Santhosh", "Santhosh");
	}
	
	@Test
	public void loginGmail()
	{
		System.out.println("Login to Gmail");
		Assert.assertEquals("Santhosh", "KTS");
	}
	

}
