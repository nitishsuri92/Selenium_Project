package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/en");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement aboutUs = driver.findElement(By.linkText("About Us"));
	
		System.out.println(aboutUs.getLocation());
		
		//scroll using x and y coordinates
//		jse.executeScript("window.scrollBy(0,4000)");
	//	aboutUs.click();
		
		//scroll until the element is in the view is true
		//jse.executeScript("arguments[0].scrollIntoView(true);", aboutUs);
		//aboutUs.click();
	
		//3.
		jse.executeScript("arguments[0].click();", aboutUs);
		
		
	}

}
