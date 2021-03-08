package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.mississauga.ca/");
		
		driver.findElement(By.xpath("(//li[@class='dropdown nav-link'])[3]")).click();
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		
		System.out.println(allOptions.size());
		
		for(WebElement a:allOptions)
		{
			System.out.println(a.getText());
		}
	}

}
