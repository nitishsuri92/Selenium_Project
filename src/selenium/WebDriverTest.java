package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver" );
		
		//ClassName objName = new ClassName();
//		FirefoxDriver driver = new FirefoxDriver();
		//IntarfaceName objName = new ClassName(); -> Class can also be created using Interface
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/"); // to open the URL
		
		driver.findElement(By.id("email")).sendKeys("anythingbutemailaddress"); // first find the email box and then type the email
		driver.findElement(By.id("pass")).sendKeys("fakepassword"); // same as email
		driver.findElement(By.name("login")).click();
		
	}

}
