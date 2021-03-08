package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.td.com/ca/en/personal-banking/");
     	
	List<WebElement> footer = driver.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));
	
	System.out.println(footer.size());
	
	for(WebElement a: footer)
	{
		System.out.println(a.getText());
	}
		

	}

}
