package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.nike.com/ca/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement men = driver.findElement(By.linkText("Men"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();
		
		List<WebElement>  allOptions = driver.findElements(By.xpath("//div[@id='DesktopMenu-0-1-0']/div/div[2]/a"));
		
		System.out.println(allOptions.size());
		
		for(WebElement a: allOptions)
		{
			System.out.println(a.getText());
		}
		
			//hover men then shoes 
	}

}
