package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;


public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Canada");
		Thread.sleep(2000);
		
		//List<WebElement> allLists = driver.findElements(By.xpath(""));
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		
		System.out.println(allOptions.size());
		
//		for(int i = 0; i<allOptions.size(); i++)
//			System.out.println(allOptions.get(i).getText());
		
		for(WebElement a:allOptions)
			System.out.println(a.getText());
	}

}
