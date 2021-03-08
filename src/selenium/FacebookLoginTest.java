package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("gfbgbsj");
	      //driver.findElement(By.id("email")).sendKeys("ghjdkjsbfj");
	     driver.findElement(By.name("email")).sendKeys("vhbfhfs");
	 //driver.findElement(By.tagName("input")).sendKeys("vjfvfjh");
		
		driver.findElement(By.name("pass")).sendKeys("gjkfk");
		
		driver.findElement(By.name("login")).click();
	}

}
