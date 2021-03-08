package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver" );
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
//		driver.findElement(By.tagName("a")); // We always perform action on WebElement
		
		WebElement footer = driver.findElement(By.id("fbar"));
		List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		printLinkText(allLinks);
		
//		for (WebElement tempLink : allLinks ) {
//			System.out.println(tempLink.getText());
//		}
		
		WebElement leftFooter = driver.findElement(By.id("fsl"));
		List<WebElement> leftLinks = leftFooter.findElements(By.tagName("a"));
		System.out.println(leftLinks.size());
		
		printLinkText(leftLinks);
		
//		for (WebElement tempLink : leftLinks ) {
//			System.out.println(tempLink.getText());
//		}
//		
		//Same result as above but using xpath
		List<WebElement> allxPathLinks = driver.findElements(By.xpath("//span[@id='fsr']/a"));
		printLinkText(allxPathLinks);
		
//		for (WebElement tempLink : allxPathLinks ) {
//			System.out.println(tempLink.getText());
//		}
	}
	
	public static void printLinkText(List<WebElement> allxPathLinks) {
		for (WebElement tempLink : allxPathLinks ) {
			System.out.println(tempLink.getText());
		}
	}
}