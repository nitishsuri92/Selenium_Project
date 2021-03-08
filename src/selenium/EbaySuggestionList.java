package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("iPhone");
//		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		List<WebElement> list= driver.findElements(By.xpath("//div[@id='gAC']/ul/li"));
		System.out.println(list.size());
		
		list.forEach((temp)-> System.out.println(temp.getText()));
		
	}

}
