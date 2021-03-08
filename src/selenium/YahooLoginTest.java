package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://login.yahoo.com/?.src=fpctx&.intl=ca&.lang=en-CA&.done=https://ca.yahoo.com&activity=uh-signin&pspid=2142623533");
	
	driver.findElement(By.id("login-username")).sendKeys("ebdskjb");
	
	driver.findElement(By.id("login-signin")).click();
	
	Thread.sleep(2000);
	
	String expectedErr = "Sorry, we don't recognize this email.";
	
	String actualErr = driver.findElement(By.id("username-error")).getText();
	System.out.println(actualErr);
	
	if(expectedErr.equals(actualErr)) {
	System.out.println("passed");
	}
	else {
	System.out.println("failed");	
	}
	}

}
