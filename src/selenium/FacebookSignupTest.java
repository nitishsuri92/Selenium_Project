package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Blah blah");
		driver.findElement(By.name("lastname")).sendKeys("Blah 2");
		driver.findElement(By.name("reg_email__")).sendKeys("Password 2");
		driver.findElement(By.id("password_step_input")).sendKeys("Blah 2");
		
		WebElement m = driver.findElement(By.id("month"));
		Select month = new Select(m);
		month.selectByValue("4");
		
		WebElement d = driver.findElement(By.id("day"));
		Select day = new Select(d);
		day.selectByValue("20");
		
		WebElement y = driver.findElement(By.id("year"));
		Select year = new Select(y);
		year.selectByValue("2020");
		
		driver.findElement(By.name("websubmit")).click();
		
	}

}
