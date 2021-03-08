package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		
		if( sortable.size() > 0) { // TO check if an element is present or not
			System.out.println("Sortable is present");
		} else {
			System.out.println("Sortable is not present");
		}
		
		List<WebElement> draggable = driver.findElements(By.id("draggable"));
		
		if( draggable.size() > 0) { // TO check if an element is present or not
			System.out.println("Draggable is present");
		} else {
			System.out.println("Draggable not present");
		}	
		
		System.out.println("------------After switching to frame-------------");
		
		driver.switchTo().frame(0);
		
//		driver.switchTo().frame("demo-frame"); // this option works with name and id, In this case we can not use it
		
//		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		Thread.sleep(2000);
		
		sortable = driver.findElements(By.linkText("Sortable"));
		
		if( sortable.size() > 0) { // TO check if an element is present or not
			System.out.println("Sortable is present");
		} else {
			System.out.println("Sortable is not present");
		}
		
		draggable = driver.findElements(By.id("draggable"));
		
		if( draggable.size() > 0) { // TO check if an element is present or not
			System.out.println("Draggable is present");
		} else {
			System.out.println("Draggable not present");
		}
		
		System.out.println("------------Switching back to main page-------------");
		
		driver.switchTo().defaultContent(); // defaultContent will always move back to main page
		
		sortable = driver.findElements(By.linkText("Sortable"));
		
		if( sortable.size() > 0) { // TO check if an element is present or not
			System.out.println("Sortable is present");
		} else {
			System.out.println("Sortable is not present");
		}
		
		draggable = driver.findElements(By.id("draggable"));
		
		if( draggable.size() > 0) { // TO check if an element is present or not
			System.out.println("Draggable is present");
		} else {
			System.out.println("Draggable not present");
		}
		
		//driver.switchTo().parentFrame(); // used in nested frame, to move back to outermost-parent frame
	}

}
