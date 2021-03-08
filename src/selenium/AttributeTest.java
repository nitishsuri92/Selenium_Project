package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver" );
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");

		String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(s);
		
		driver.findElement(By.id("gh-ac")).sendKeys("iPhone");
		
		String p = driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(p);
	}

}
