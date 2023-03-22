package Testng1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public void check() {
		// TODO Auto-generated method stub
		
		System.out.println("hello");

	}
	
	@BeforeSuite
	public void suitecheck()
	{
		System.out.println("before suite executed here ");
	}

}
