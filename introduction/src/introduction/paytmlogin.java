package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paytmlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		


		//driver.findElement(By.cssSelector("input[@type='text']")).sendKeys("pranaydhanawade89.pd@gmail.com");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pranay123");
		//driver.findElement(By.className("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();
		
		
		driver.findElement(By.name("email")).sendKeys("pranay@gmail.com");
		driver.findElement(By.name("current-password")).sendKeys("check");
		driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();		
	}

}
