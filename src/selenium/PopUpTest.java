package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // It'll wait maximum 20 seconds
		
		System.out.println("Res: "+driver.findElements(By.className("_2MlkI1")).size());
		
		if ( driver.findElements(By.className("_2MlkI1")).size()>0) {
			System.out.println("IF");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		}
		driver.findElement(By.className("_3704LK")).sendKeys("laptop");
	}
}
