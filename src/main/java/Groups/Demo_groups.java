package Groups;

import org.testng.annotations.Test;

public class Demo_groups {
	
	@Test(groups = {"smoke","sanity"})
	public void test1()
	{
		System.out.println("I am in test 1");
	}
	
	@Test(groups = {"smoke","sanity"})
	public void test2()
	{
		System.out.println("I am in test 2");
	}
	
	@Test(groups = {"regression","smoke"})
	public void test3()
	{
		System.out.println("I am in test 3");
	}
	
	@Test(groups = {"windows.test4"})
	public void test4()
	{
		System.out.println("I am in test 4");
	}
	@Test(groups = {"windows.test5"})
	public void test5()
	{
		System.out.println("I am in test 5");
	}

}
