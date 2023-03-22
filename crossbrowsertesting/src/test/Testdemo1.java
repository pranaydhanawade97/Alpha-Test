package test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class Testdemo1{
@Test
public void test1()
{
	
	WebDriver driver=new RemoteWebDriver(new URL("https://www.github.com/browserstack/testng-browserstack"),);
	
	driver.get("www.w3schools.com");
	
	driver.getTitle();
	
	

}
}
