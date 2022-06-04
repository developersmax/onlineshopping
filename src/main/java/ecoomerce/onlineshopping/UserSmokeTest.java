package ecoomerce.onlineshopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserSmokeTest {
	WebDriver driver;
	
	@BeforeMethod
	public void luanchBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\2021_Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	@Test(priority=1)
	public void  verifyLuanchapp() {
		driver.get("https://www.google.com/");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Google" );
	}
	
	@Test(priority=2)
	public void verifyLinkElement() {
		driver.get("https://www.google.com/");
		Assert.assertEquals(true, driver.findElement(By.linkText("Gmail")).isDisplayed());
	}
	
	
	@AfterMethod
	public void closeBrowser() {
	driver.close();
	}
}
