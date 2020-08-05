package Listeners_class;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Demo_listeners2 {
	
	
	@Test
	public void test4()
	{
		System.out.println("Test 4");
	}
	
	@Test
	public void test5()
	{
		Assert.fail();
		System.out.println("Test 5");
	}
	
	@Test
	public void test6()
	{
		System.out.println("Test 6");
		throw new SkipException("This test is skipped");
	}

}
