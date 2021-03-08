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
		// https://www.nike.com/ca/
		// Hover on Men and print 'Shoes' size and list, try all if possible
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement men = driver.findElement(By.linkText("Men"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();
		 
//		Prints entire Men's List
//		List<WebElement> list = driver.findElements(By.xpath("//div[@class='pre-menu-column pt4-sm ta-sm-l va-sm-t ncss-col-sm-2']/a"));
//		System.out.println("Size -> "+list.size());
//		System.out.println("-----Printing Entire Menu for Mens-----");
//		list.forEach((temp) -> {
//			if(!temp.getText().equals("")) {
//			System.out.println("-------"+temp.getText()+"-------");
//			}
//		});
		
//		Prints only list of Shoes
		List<WebElement> listShoes = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
		System.out.println("List Shoes Size -> "+listShoes.size());
		System.out.println("-----Printing Only Shoes Menu for Mens-----");
		
		listShoes.forEach( (n) -> System.out.println("-------"+n.getText()+"-------")) ;
	}

}
