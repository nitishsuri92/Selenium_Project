package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		// Some browsers don't support direct input for search box, so this step is to avoid script from failing
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).click();
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Canada");
		Thread.sleep(2000);
		
		List<WebElement> suggestionList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(suggestionList.size());
		
		//Following is for normal foreach loop
		System.out.println("Following is for normal foreach loop");
		for(WebElement temp : suggestionList) {
			System.out.println(temp.getText());
		}
		
		//Following forEach loop is used with Lambda expression
		System.out.println("Following forEach loop is used with Lambda expression");
		suggestionList.forEach((temp) -> { System.out.println(temp.getText()); });
	}
}
