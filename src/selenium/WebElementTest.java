package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
        
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("jksuidfj");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("febbbsbnm");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

}
