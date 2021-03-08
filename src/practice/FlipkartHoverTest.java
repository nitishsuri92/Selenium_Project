package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHoverTest {

	public static void main(String[] args) throws InterruptedException {
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
		
		
		//driver.findElement(By.name("q")).sendKeys("laptop");
		WebElement electronics = driver.findElement(By.className("_2I9KP_"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		
	//	List<WebElement> allOptions =  driver.findElements(By.className("_1fwVde"));
//		List<WebElement> allOptions =  driver.findElements(By.xpath("//div[@class='_1fwVde']"));
		List<WebElement> allOptions =  driver.findElements(By.xpath("//a[@class='_3QN6WI _1MMnri _32YDvl']"));
		System.out.println(allOptions.size());
		
		
		
		for(WebElement a:allOptions)
		{
			System.out.println(a.getText());
		}
		
		//electronics/mobiles
		
		Thread.sleep(2000);
		System.out.println("---------------------After Hover Electronics---------------------");
		
		//Please check, here all the names coming under electronics section means84 not just under mobile section
		
		//List<WebElement> allMobiles = driver.findElements(By.linkText("Mobiles"));
//		List<WebElement> allMobiles = driver.findElements(By.className("_3QN6WI"));
		List<WebElement> allMobiles = driver.findElements(By.xpath("//div[@class='_1QrT3s']/div[1]/a"));
		
		System.out.println(allMobiles.size());
		
		for(WebElement a: allMobiles)
		{
			System.out.println(a.getText());
		}
		
		
	}
	

}
