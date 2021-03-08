package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		//  /Users/savanpatel/Documents/Testing Class 2021/Projects/testing
		File srcFile = driver.getScreenshotAs(OutputType.FILE); // THis is for FirefoxDriver, ChromeDriver or any class Driver
		//File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)); // This line is for WebDriver
		FileUtils.copyFile(srcFile, new File("/Users/savanpatel/Documents/Testing Class 2021/Projects/testing/screenshot.png"));
	}

}
