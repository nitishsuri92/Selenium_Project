package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.scotiabank.com/ca/en/personal.html");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.name("usernameInput")).sendKeys("fevhfh");
		//driver.findElement(By.xpath("//input[@placrholder='Username or card number']")).sendKeys("bgfb");;
		driver.findElement(By.name("password")).sendKeys("sdbfb");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(2000);
		
		String expectedErr  = "Please check your card number / username or password and try again.";
		
		String actualErr = driver.findElement(By.xpath("//div[@class='TextBody__text TextBody__text--2 TextBody__text--black _1u8riMqU2Y4IEgHc3CDV_c']")).getText();
		System.out.println(actualErr);

		if(expectedErr.equals(actualErr))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
	}

}
