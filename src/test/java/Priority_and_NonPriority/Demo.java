package Priority_and_NonPriority;

import org.testng.annotations.Test;

public class Demo {
	
	@Test(priority = 1)
	public void a()
	{
		System.out.println("Test A");
	}
	
	@Test(priority = -1)
	public void b()
	{
		System.out.println("Test B");
	}
	
	@Test(priority = 2)
	public void c()
	{
		System.out.println("Test C");
	}
	
	@Test
	public void d()
	{
		System.out.println("Test D");
	}
	
	@Test
	public void e()
	{
		System.out.println("Test E");
	}

}
