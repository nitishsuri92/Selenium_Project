package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		
//		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement aboutUs = driver.findElement(By.linkText("About Us"));
		System.out.println(aboutUs.getLocation()); // to fetch element location in (y,x) coordinate on a webpage
		
//		Option 1
//		scroll using x and y coordinate
//		jse.executeScript("window.scrollBy(0, 6000)");
//		aboutUs.click();
		
//		Option 2
//		scroll until the element is in the view is true
//		jse.executeScript("arguments[0].scrollIntoView(true)", aboutUs);
//		aboutUs.click();
		
//		Option 3
		jse.executeScript("arguments[0].click()", aboutUs);
	}
}
