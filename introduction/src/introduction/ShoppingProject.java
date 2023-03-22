package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.nike.com/in/w/mens-shoes-nik1zy7ok");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("hf_title_signin_membership")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("pranaydhanawade89.pd@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pranay12345@");
		//driver.findElement(By.id("0bad1468-728e-4141-86b8-41b5475babd8")).click();
		
		driver.findElement(By.linkText("Join Us.")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("pranaydhanawade89.pd@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Pranay12345@");
		
		
		driver.findElement(By.cssSelector("//input[@data-componentname='firstName']")).sendKeys("pranay");
		
		driver.findElement(By.xpath("//input[@data-componentname='dateOfBirth']")).click();
		
		
		
	
		
		
	}

}
