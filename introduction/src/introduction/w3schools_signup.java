package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3schools_signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='loginactioncontainer']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Sign up']")).click();  
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pranay@gmail.com");
		driver.findElement(By.xpath("//input[@name='new-password']")).sendKeys("Pranay86551@");
		driver.findElement(By.xpath("//div[@class='-inner-wrapper']")).click();
		
		driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();
		
	
	}

}
