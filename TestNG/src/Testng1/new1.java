package Testng1;

import org.testng.annotations.Test;

public class new1 {
	
	@Test(invocationCount = 5)
	public void check() 
	{
		System.out.println("final");
	}
	
	@Test(priority=2)
	public void check2()
	{
		System.out.println("final2");
	}
	
	@Test(priority=1)
	public void check3()
	{
		System.out.println("final3");
	}

}
