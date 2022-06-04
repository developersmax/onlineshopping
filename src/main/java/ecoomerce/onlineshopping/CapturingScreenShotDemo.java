package ecoomerce.onlineshopping;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingScreenShotDemo {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		Date curretDate = new Date();
		System.out.println(curretDate);
		String screenshotfilename = curretDate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotfilename);
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\2021_Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
			
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+ screenshotfilename + ".png"));
		 
		driver.close();

	}

}
