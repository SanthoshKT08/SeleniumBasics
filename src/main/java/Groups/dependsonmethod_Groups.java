package Groups;

import org.testng.annotations.Test;

public class dependsonmethod_Groups {
	
	@Test(dependsOnMethods = {"test2"})
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test(dependsOnGroups = {"sanity1"})
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	@Test(groups = "sanity1")
	public void test3()
	{
		System.out.println("Test 3");
	}

}
