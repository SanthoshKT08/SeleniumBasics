package Listeners_class;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class Demo_listeners {
	
	
	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test
	public void test2()
	{
		Assert.fail();
		System.out.println("Test 2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test 3");
		throw new SkipException("This test is skipped");
	}

}
