package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.gecko.driver" , "Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver/");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		// Following method is not valid for checking whether an element is present of not;  it may throw an error if element is not found
//		if(driver.findElement(By.linkText("About")).isDisplayed()) {
//			System.out.println("Element Present");
//		}else {
//			System.out.println("Element Not Present");
//		}
		
		List<WebElement> element = driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element Not Present");
		}
	}

}
