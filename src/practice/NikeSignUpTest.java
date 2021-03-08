package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NikeSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='nav-btn p0-sm body-4 u-bold ml2-sm mr2-sm']")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.linkText("Join Us.")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("wrong@email.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("wrongpassword");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Blah");
		driver.findElement(By.xpath("//input[@type='lastname']")).sendKeys("Blah blah");
		
	}
}
