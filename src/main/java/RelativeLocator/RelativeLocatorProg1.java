package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class RelativeLocatorProg1 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		 System.setProperty("webdriver.chrome.driver", "F:\\Software\\chrome99\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.saucedemo.com/");
		  
		  //WebElement password = driver.findElement(By.id("password"));
		  

	}

}
