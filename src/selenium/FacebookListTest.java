package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver" );
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));

		System.out.println("Size -> "+allLinks.size());
		
		String expectedTxt = "Places";
		
		for (WebElement tempLink : allLinks ) {
			System.out.println(tempLink.getText());
			if ( tempLink.getText().equals(expectedTxt)) {
				tempLink.click();
				break;
			}
		}
	}
}
