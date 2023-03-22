package Testng1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class carinfo {
	
	@Test
	public void carlogin()
	{
		System.out.println("with valid credition login will be successfull");
		
	}
	
	@Test
	public void carlogin1()
	{
		System.out.println("with invalid credition login will be unsuccessfull");
		
	}
	
	@Test
	public void carlogin3()
	{
		System.out.println("More info contact us ");
		
	}
	
	@BeforeTest
	public void car() 
	{
		System.out.println("before test executed here");
	}
	@Test
	public void Homepage()
	{
		System.out.println("Car details");
		
	}
	
	@Test
	public void Homepage2()
	{
		System.out.println("click for more details");
		
	}
	
	@AfterTest
	public void Homepage3()
	{
		System.out.println(" After Class executed here ");
		
	}
	
	
	
	

}
