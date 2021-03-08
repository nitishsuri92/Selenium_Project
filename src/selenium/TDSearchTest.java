package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.td.com/ca/en/personal-banking/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> popUp = driver.findElements(By.xpath("//span[@class='td-icon td-icon-close icon-small']"));
		System.out.println(popUp.size());
		
		if(popUp.size()>0)
		{
			popUp.get(0).click();
		}
		
//		driver.findElement(By.linkText("Search")).click();
		driver.findElement(By.linkText("Search")).sendKeys(Keys.ENTER);;
		
		
//			driver.findElement(By.xpath("//input[@class='td-search-input ng-pristine ng-valid ng-empty ng-touched']")).sendKeys("credit card");
//			driver.findElement(By.xpath("//input[@class='td-search-input ng-pristine ng-valid ng-empty ng-touched']")).click();

		driver.findElement(By.name("query")).sendKeys("credit card");
		driver.findElement(By.name("query")).sendKeys(Keys.ENTER);;
			//search kari credit card type and enter press 
	}

}
