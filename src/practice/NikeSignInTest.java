package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NikeSignInTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='nav-btn p0-sm body-4 u-bold ml2-sm mr2-sm']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("wrongemail@email.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("wrongpassword");
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		
		Thread.sleep(1500);
		
		String expectedErrMsg = "Your email or password was entered incorrectly.";
		String actualErrMsg = driver.findElement(By.xpath("//div[@class='nike-unite-error-message errorMessage nike-unite-component']/ul/li")).getText();
		
		if(actualErrMsg.equals(expectedErrMsg)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
