package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		//give me the count of links on the page 
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(Driver.findElements(By.tagName("a")).size());
	
		//give me the count of links on footer page 
		
		WebElement FooterDriver=Driver.findElement(By.id("gf-BIG"));
		
		System.out.println(FooterDriver.findElements(By.tagName("a")).size());
		
		//3-give me count of links column from footer
		
		WebElement ColumnDriver=FooterDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(ColumnDriver.findElements(By.tagName("a")).size());
		
		//4-click on each link on column and check if the page is opening 
		
		for(int i=1; i<ColumnDriver.findElements(By.tagName("a")).size(); i++) 
		{
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000L);
			
		}
		
		//open all tabs and get title 
		
		Set<String> abc=Driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			Driver.switchTo().window(it.next());
			System.out.println(Driver.getTitle());
			
		}
		
		
		
	}

}
