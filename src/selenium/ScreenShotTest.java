package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		
		File scrFile = driver.getScreenshotAs(OutputType.FILE); //This is for firefox, chrome and other class driver
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(Output.FILE);// This line is for WebDriver
		FileUtils.copyFile(scrFile, new File("C:/testing/screenshot.png"));
		
	}

}
