package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FacebookWebList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> allLinks =  driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size();i++)
		{
			System.out.println(allLinks.get(i).getText());
			
			if(allLinks.get(i).getText().equals("Places"))
			{
				allLinks.get(i).click();
				break;
			}

//			if(i==6)
//			{
//				break;
//			}
				
		}
			// System.out.println("over");
	}

}
