package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
				//Invoking Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("span[class='nav-line-2 ']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8655144220");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'a-input-text a-span12 auth-autofocus auth-required-field')]")).sendKeys("Pranay86551@");
		driver.findElement(By.xpath("//span[@class='a-label a-checkbox-label']")).click();
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		//-> successfully amazon login page  
		
		//driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		
		//driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']")).click();          menu barr displayed 
		
		//driver.findElement(By.partialLinkText("Men's Fashion")).click();    work after on this line
		
		driver.findElement(By.xpath("(//img[@alt='Watches'])[1]")).click();
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[6]")).click();
		
		driver.findElement(By.xpath("(//div[@class='colorsprite aok-float-left'])[1]")).click();
		
		driver.findElement(By.linkText("Fire-Boltt Phoenix Smart Watch with Bluetooth Calling 1.3\",120+ Sports Modes, 240*240 PX High Res with SpO2, Heart Rate Monitoring & IP67 Rating")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
