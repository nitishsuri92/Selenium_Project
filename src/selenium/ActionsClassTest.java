package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		
		Actions builder = new Actions(driver); 
		builder.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Electronics")).click();

		
		List<WebElement> allOptions = driver.findElements(By.xpath("(//nav[@class='hl-cat-nav__sub-cat-col']/ul)[5]//li"));
		System.out.println(allOptions.size());
		
		
		for(WebElement a: allOptions)
		{
			System.out.println(a.getText());
		}
		
	}

}
