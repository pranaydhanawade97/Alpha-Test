package Testng1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {
	
	@Parameters({"URL"})
	@Test
	public void check2(String neww) 
	{
		System.out.println("bye");
		System.out.println(neww);
	}
	
	@Test
	public void check3() {
		System.out.println("TestNG");
	}
	
	@Test
	public void last() {
		System.out.println("After test executed here");
	}

}
