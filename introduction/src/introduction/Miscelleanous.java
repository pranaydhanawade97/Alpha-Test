package introduction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\chromedriver");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");	
		driver.findElement(By.xpath("id('email')")).sendKeys("pranay");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ahbdj");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
}
	
