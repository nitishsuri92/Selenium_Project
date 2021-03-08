package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver" );
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//li[@class='trending-list']/ul/li"));
		
		System.out.println("Size -> "+allLinks.size());
		
		for (WebElement tempLink : allLinks ) {
			System.out.println(tempLink.getText());
		}
	}
}
