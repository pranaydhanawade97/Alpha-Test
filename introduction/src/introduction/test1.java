package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("www.w3schools.com");

	}

}

