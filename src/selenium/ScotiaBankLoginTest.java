package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver" );
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.scotiabank.com/ca/en/personal.html");
		
		driver.findElement(By.xpath("//a[@class='btn btn-signin btn-primary desktop']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("usernameInput-input")).sendKeys("efefefef");
		driver.findElement(By.id("password-input")).sendKeys("password");
		driver.findElement(By.id("signIn")).click();
		
		String expextedMsg = "Please check your card number / username or password and try again.";
		Thread.sleep(1500);
		String actualMsg = driver.findElement(By.xpath("//div[@class='TextBody__text TextBody__text--2 TextBody__text--black _1u8riMqU2Y4IEgHc3CDV_c']")).getText();
		
		if (actualMsg.equals(expextedMsg)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
	}

}
