package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); // to open the URL
		
		driver.findElement(By.id("email")).sendKeys("anythingbutemailaddress"); // first find the email box and then type the email
		driver.findElement(By.id("pass")).sendKeys("fakepassword"); // same as email
		driver.findElement(By.name("login")).click();
		
	}

}
