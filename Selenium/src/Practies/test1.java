package Practies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver");
		WebDriver d=new ChromeDriver();
		
		
		d.get("www.w3schools.com");

	}

}
