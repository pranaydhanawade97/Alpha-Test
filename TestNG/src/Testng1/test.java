package Testng1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test {
	
	@Test(invocationCount=8)
	public void check1()
	{
		System.out.println("p1");
	}
	
	@Test
	@BeforeClass
	public void check2()
	{
		System.out.println("p2");
	}
	
	@Test
	public void check3()
	{
		System.out.println("p3");
	}
	

}
