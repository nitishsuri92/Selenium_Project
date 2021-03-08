package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FooterWebList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

       FirefoxDriver driver = new FirefoxDriver();

       driver.get("https://www.google.com/");



// This is very basic type
//WebElement footer = driver.findElement(By.id("fsl"));
//List<WebElement> allLinks = footer.findElements(By.tagName("a"));
//		System.out.println(allLinks.size());
		
//This is with xpath

List<WebElement> allLinks = driver.findElements(By.xpath("//span[@id='fsl']/a"));
System.out.println(allLinks.size());


		for(WebElement a: allLinks)
			System.out.println(a.getText()+"         "+a.isSelected());
	
		System.out.println("--------------------");
		
	System.out.println(allLinks.get(1).getText());
	}
	
	
	

}
