package Testng1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class URL {
	
	@Parameters({"URL"})
	@Test
	public void website(String urlname) 
	{
		System.out.println("URL");
		System.out.println(urlname);
	}
	

	
}
