package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-email")).sendKeys("alpha@beta.com");
		driver.findElement(By.id("login-password")).sendKeys("wrongpasswordonly");
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		
		Thread.sleep(2000);
		
		String expectedMsg = " ";
	} 
}
