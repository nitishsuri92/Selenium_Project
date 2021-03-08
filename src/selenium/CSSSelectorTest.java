package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver" );
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		// Refer to this link for detailed explanation
		// https://saucelabs.com/resources/articles/selenium-tips-css-selectors
		driver.findElement(By.cssSelector("#email")).sendKeys("Wrongemail");
		driver.findElement(By.cssSelector("#pass")).sendKeys("wronfpassword");
		driver.findElement(By.cssSelector("._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"));
	}

}
