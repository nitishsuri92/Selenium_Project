package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("/Users/savanpatel/Documents/Testing Class 2021/Projects/testing/prop.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		WebDriver driver = null;
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/chromedriver");
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.facebook.com/"); // to open the URL
		
		driver.findElement(By.id("email")).sendKeys("anythingbutemailaddress"); // first find the email box and then type the email
		driver.findElement(By.id("pass")).sendKeys("fakepassword"); // same as email
		driver.findElement(By.name("login")).click();
	}
}