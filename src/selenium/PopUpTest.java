package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> popUp = driver.findElements(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		System.out.println(popUp.size());
		
		if(popUp.size()>0)
		{
			popUp.get(0).click();
		}
		
		
		driver.findElement(By.name("q")).sendKeys("laptop");
		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		
//		wait.until(ExpectedConditions.alertIsPresent());
	}

}
