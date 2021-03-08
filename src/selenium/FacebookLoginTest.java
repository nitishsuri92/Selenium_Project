package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver =  new FirefoxDriver(); 

		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("anythingbutemailaddress"); // Can not be used when there is a space in the className
//		driver.findElement(By.id("email")).sendKeys("anythingbutemailaddress"); // Working
//		driver.findElement(By.name("email")).sendKeys("anythingbutemailaddress"); // Working
//		driver.findElement(By.tagName("ipnut")).sendKeys("anythingbutemailaddress"); // not unique, not first
		
		driver.findElement(By.name("pass")).sendKeys("sdfdfsdf");
		
		driver.findElement(By.name("login")).click();
		
	}

}

