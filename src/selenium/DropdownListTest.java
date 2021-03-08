package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> dropDown = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		
		dropDown.forEach((temp) -> { 
			if(temp.isSelected()) {
				System.out.println(temp.getText()+"---->"+temp.isSelected());
			}
		});
		
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);
		 
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		dropDown.forEach((temp) -> { 
			if(temp.isSelected()) {
				System.out.println(temp.getText()+"---->"+temp.isSelected());
			}
			
		});
		
		s.selectByValue("2984");
		Thread.sleep(2000);
		
		dropDown.forEach((temp) -> { 
			if(temp.isSelected()) {
				System.out.println(temp.getText()+"---->"+temp.isSelected());
			}
			
		});
		
		s.selectByVisibleText("Books");
		Thread.sleep(2000);
		
		dropDown.forEach((temp) -> { 
			if(temp.isSelected()) {
				System.out.println(temp.getText()+"---->"+temp.isSelected());
			}
			
		});
	}

}
