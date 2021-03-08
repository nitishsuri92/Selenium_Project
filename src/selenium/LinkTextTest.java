package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("About")).click();
		
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		
		String expectedUrl="https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		String actualUrl = driver.getCurrentUrl(); 
		
		
		
		if(expectedTitle.equals(actualTitle) && expectedUrl.equals(actualUrl)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test failed");
		}
	}
}