package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();		
		//FirefoxDriver driver = new FirefoxDriver();
		
		
		//InterfaceName objName = new FirefoxDriver();
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("emai,pass,login"));
	}

}
