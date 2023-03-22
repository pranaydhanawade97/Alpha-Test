package Testng1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class days {
	
	@Parameters({"URL"})
	@Test
	public void first(String ch)
	{
		System.out.println("Sunday");
		System.out.println("ch");
		
		
	}
	
	
	@Parameters({"username"})
	public void second(String username,String password)
	{
		System.out.println("Monday");
		System.out.println(username);
		System.out.println(password);
	}
	
	@BeforeMethod
	public void third()
	{
		System.out.println("check before");
	}
	
	@Test(groups= {"tag"})
	public void fourth()
	{
		System.out.println("Tuesday");
	}

	@Test
	public void fifth()
	{
		System.out.println("Wednesday");
	}
	
	@Test
	public void Six()
	{
		System.out.println("Thursday");
	}
	
	@Test
	public void Seventh()
	{
		System.out.println("Tuesday");
	}
	
	@AfterMethod
	public void Eight()
	{
		System.out.println("Check After");
	}
	@DataProvider
	public Object[][] getdata()
	{
		//3 column 2 row 
		Object[][] data =new Object[3][2];
		
		data[0][0]="username";
		data[0][1]="password";
		
		data[1][0]="username";
		data[1][1]="password";
		
		data[2][0]="username";
		data[2][1]="password";
		return data;
}
}
