package Testng1;

import org.testng.annotations.Test;

public class alpha {
	
	@Test
	public void c1()
	{
		System.out.println("1st");
		
	}
	
	@Test(timeOut=10000)
	public void c2()
	{
		System.out.println("2st");
		
	}
	
	@Test
	public void c3()
	{
		System.out.println("3rd");
		
	}
	
	
	@Test
	public void c4()
	{
		System.out.println("4th");
		
	}
	
	
	@Test
	public void c5()
	{
		System.out.println("5th");
		
	}
	
	
	@Test(dependsOnMethods= {"c1","c5"})
	public void abc()
	{
		System.out.println("abc");
		
	}

}
