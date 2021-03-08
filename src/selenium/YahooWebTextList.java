package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooWebTextList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> allLists = driver.findElements(By.xpath("//li[@class='trending-list']/ul/li"));
		System.out.println(allLists.size());
		
		for(int i=0; i<allLists.size();i++)
			System.out.println(allLists.get(i).getText());
	}

}
