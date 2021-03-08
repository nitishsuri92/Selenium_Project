package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/mens-footwear/pr?sid=osp,cil&otracker=nmenu_sub_Men_0_Footwear"); // to open the URL
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement men = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[3]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();
		
		List<WebElement> list= driver.findElements(By.xpath("(//div[@class='_1fwVde'])[1]/a"));
		System.out.println("Count= "+list.size());
		
		for(WebElement temp : list) {
			if(temp.getText().equals("Men's Grooming")) {	
				break;
			}
			System.out.println("-----"+temp.getText()+"-----");
		}
	}
}
