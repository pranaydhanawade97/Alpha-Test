package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionkeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("a[id=nav-link-accountList]"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Iphone").doubleClick().perform();
		
		//driver.findElement(By.cssSelector("[id='nav-search-submit-button']")).click();
		
		a.moveToElement(move).contextClick().build().perform();
		
		
		
	}

}
