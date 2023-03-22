package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		
		d.get("https://the-internet.herokuapp.com/checkboxes");
		d.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		//d.close();

	}

}
