package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver" );
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=fpctx&.intl=ca&.lang=en-CA&.done=https://ca.yahoo.com&activity=uh-signin&pspid=2142623533");
		
		WebElement email = driver.findElement(By.id("login-username"));
		email.sendKeys("wrongemailaddress");
		
		WebElement nextBtn = driver.findElement(By.id("login-signin"));
		nextBtn.click();
		
		String expectedErr = "Sorry, we don't recognize this email";
		String actualErr = driver.findElement(By.id("username-error")).getText();
		
		if(actualErr.equals(expectedErr)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
	}

}
