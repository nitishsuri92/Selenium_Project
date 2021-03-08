package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/en/account-login");
		//driver.manage().window().maximize();
		
		driver.findElement(By.id("login-email")).sendKeys("fagfuigeuif@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("sdbbsbfbfn");
		
		//Thread.sleep(2000);
		
//		driver.findElement(By.className("gl-cta gl-cta--primary")).click();
//		driver.findElement(By.xpath("//button[@data-auto-id='login-form-login']")).click();
		driver.findElement(By.xpath("//button[@data-auto-id='login-form-login']")).click();
		
		
		Thread.sleep(2000);
		
		String expectedErr = "Incorrect email/password – please check and retry";
		
	String actualErr = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		//String actualErr = driver.findElement(By.xpath("//div[@class='errorMessage___2sHhm gl-form-hint gl-form-hint--error']")).getText();
		
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
