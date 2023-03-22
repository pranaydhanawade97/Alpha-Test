package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//Invoking Browser
		WebDriver d=new ChromeDriver();
		
		d.get("https://itera-qa.azurewebsites.net/home/automation");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//input[@id='name']")).sendKeys("Pranay");    //relative xpath 
		
		d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/input[1]")).sendKeys("8655144220");    //absolute xpath
		
		d.findElement(By.id("email")).sendKeys("pranaydhanawade89.pd@gmail.com");   // ID Locator
		
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456"); //relative xpath 
		
		d.findElement(By.tagName("textarea")).sendKeys("new York");    //tagname loctaor
		
		//d.findElement(By.linkText("Submit")).click();    //linktext locator
		
		d.findElement(By.id("male")).click();
		
		
		WebElement checkbox=d.findElement(By.linkText("Which days of the "));
		checkbox.click();
		
		
		
		
		
		

	}

}
