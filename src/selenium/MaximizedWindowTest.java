package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizedWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver" );
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.scotiabank.com/ca/en/personal.html");
		
		driver.manage().window().maximize();

	}

}
