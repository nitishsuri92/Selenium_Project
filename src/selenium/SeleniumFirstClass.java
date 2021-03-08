package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		// TODO Auto-generated method stub
		//className objName = new ClassName();
		
  FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/") ; //to open URL
	
	driver.findElement(By.id("email")).sendKeys("jddgghcmghdxfd");
	driver.findElement(By.id("pass")).sendKeys("dharmil");
	driver.findElement(By.name("login")).click();
	
	}

}
