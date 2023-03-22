package test;

import org.testng.annotations.Test;

public class test1 {
	
	@Test
	public void check1()
	{
		System.out.println("h1");
	}
	
	@Test
	public void check2()
	{
		System.out.println("h2");
	}
	
	@Test
	public void check3()
	{
		System.out.println("h3");
	}
	@Test
	public void check4()
	{
		System.out.println("h4");
	}
	@Test(dependsOnMethods= {"check3"})
	public void check5()
	{
		System.out.println("h5");
	}
	
}
