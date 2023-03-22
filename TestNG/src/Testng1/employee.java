package Testng1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class employee {
	
	@Parameters({"URL"})
	@Test
	public void team1(String one)
	{
		System.out.println("sunday not working ");
		System.out.println("one");
	}
	
	@Test(groups= {"tag"})
	public void team2()
	{
		System.out.println("Saturday not working ");
	}
	
	@Test
	public void team3()
	{
		System.out.println(" 2nd Saturday not working ");
	}
	
	@Test(groups= {"tag"})
	public void team4()
	{
		System.out.println(" 4 th Saturday not working ");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println(" after suite excuted here");
	}
	
	

}
