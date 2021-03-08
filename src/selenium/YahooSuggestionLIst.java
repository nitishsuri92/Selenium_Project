package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionLIst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com");
		
		driver.findElement(By.id("header-search-input")).click();
		driver.findElement(By.id("header-search-input")).sendKeys("Canada");
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		list.forEach((temp)-> {
			if(!temp.getText().contains("Canada")) {
			 System.out.println("fail");
			}
		});
	}

}
