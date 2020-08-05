package Base;

import org.testng.annotations.Test;

public class TestNG_failedTestcases {
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2");
		//int a=1/0;
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test3");
	}

}
