package introduction;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		WebDriver Driver=new EdgeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List <WebElement> optionsmenu =Driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		
		for(WebElement option :optionsmenu)
		{
			if (option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		
		
		

	}

}
