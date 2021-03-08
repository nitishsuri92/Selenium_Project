package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.scotiabank.com/ca/en/personal.html");
		
		driver.manage().window().maximize();
	}

}
