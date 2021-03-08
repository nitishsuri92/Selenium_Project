package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
	
		//getAttributeValue
		
		List<WebElement> list = driver.findElements(By.xpath("//td[@class='table5']/input"));
		//OR
//		List<WebElement> list2 = driver.findElements(By.name("group1"));
		System.out.println("Size -> "+list.size());
		
		list.forEach( (n)-> System.out.println(n.getAttribute("value")+"--------"+n.isSelected()));

		list.get(2).click();
		
		list.forEach( (n)-> {
			if(n.isSelected()) {
				System.out.println(n.getAttribute("value")+"--------"+n.isSelected());	
			}
		});
	}

}
