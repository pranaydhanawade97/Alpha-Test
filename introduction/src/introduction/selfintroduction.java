package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selfintroduction {

	public static void main(String[] args) {
		
		// chromedriver.exe-> chrome browser
	   	//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//Invoking Browser
		//WebDriver driver=new ChromeDriver();
		
		
		
		//Firefox launch
		//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		//Microsft Edge
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		
		driver.get("https://www.w3schools.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		
	}

}
