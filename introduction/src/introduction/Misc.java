package introduction;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misc {

	public static void main(String[] args) throws IOException {
				
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       // driver.manage().deleteCookieNamed("abc");
        
        //click on any link
        
        //login page -verify login url
        
       
        driver.get("https://www.w3schools.com/");
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("C:\\Users\\Pranay\\Pictures\\ScreenShot.png"));
		

	}

	
}
