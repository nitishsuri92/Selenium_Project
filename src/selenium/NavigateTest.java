package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		
		FirefoxDriver driver = new FirefoxDriver();
		
//		 Enters url into browser
//		driver.get("https://www.google.com/");
		
//		navigate is get are same, get is a final method while navigate has additional methods such as back(),forward(),to(),refresh()
		driver.navigate().to("https://www.google.com/");
		
		/*
		 * driver.navigate().to();
		 * driver.navigate().back();
		 * driver.navigate().forward();
		 * driver.navigate().refresh();
		 * */
	}
}