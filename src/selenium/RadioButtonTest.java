package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		
		//driver.findElement(By.name("group1")).sendKeys("Cheese");
		//driver.findElement(By.name("group1")).click();
	
	List<WebElement> allRadio = driver.findElements(By.name("group1"));
	System.out.println(allRadio.size());
	Thread.sleep(2000);
	
	for(WebElement a: allRadio)
	{
		if(a.isSelected())
		{
		System.out.println(a.getAttribute("value")+"---------------"+a.isSelected());
	   }
	}
	System.out.println("----------------");
	
	allRadio.get(2).click();
	
	Thread.sleep(2000);
	
	for(WebElement a: allRadio)
	{
		if(a.isSelected())
		{
		System.out.println(a.getAttribute("value")+"---------------"+a.isSelected());
	   }
	}
	
}
}