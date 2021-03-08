package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Enter Credit card in search and press enter
		
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.className("search")).click();
		driver.findElement(By.xpath("//input[contains(@class,'td-search-input')]")).sendKeys("Credit card");
		driver.findElement(By.xpath("//input[contains(@class,'td-search-input')]")).sendKeys(Keys.ENTER);
//		driver.quit();
	}
}
