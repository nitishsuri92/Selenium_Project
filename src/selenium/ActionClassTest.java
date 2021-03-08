package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty( "webdriver.gecko.driver" , "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> electronicsHoverList = driver.findElements(By.xpath("(//div[@class='hl-cat-nav__sub-cat-col']/ul)[5]/li"));
		System.out.println(electronicsHoverList.size());
		
		electronicsHoverList.forEach((n) -> {
				System.out.println(n.getText());
		});
	}

}
