package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.id("gh-cat-td")).click();
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		
		System.out.println(allOptions.size());
		
//		for(int i=0; i<allOptions.size();i++)
//			System.out.println(allOptions.get(i).getText());
		
//		for(WebElement a: allOptions)
//			System.out.println(a.getText());
		
		for(WebElement a: allOptions)
		{
			if(a.isSelected())
			{
				System.out.println(a.getText()+"****************"+ a.isSelected());
			}
		}
		
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		s.selectByValue("2984");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Books");
		Thread.sleep(2000);
		
		System.out.println("---------------------------");
		
		for(WebElement a: allOptions)
		{
			if(a.isSelected())
			{
				System.out.println(a.getText()+"*******"+a.isSelected());
			}
		}
		
		
	}

}
