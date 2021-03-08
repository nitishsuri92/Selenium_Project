package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		
		System.out.println(sortable.size());
		
		if(sortable.size()>0)
		{
			System.out.println("sortable present");
		}
		else
		{
			System.out.println("do not present");
		}
		
    List<WebElement> Draggable = driver.findElements(By.id("draggable"));
		
		System.out.println(Draggable.size());
		
		if(Draggable.size()>0)
		{
			System.out.println("Draggable present");
		}
		else
		{
			System.out.println("do not present");
		}
		
		
		driver.switchTo().frame(0); //index
		
		//driver.switchTo().frame("demo-frame"); // this option work with name and id , in this case we cannot use it.
		
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //
		
		System.out.println("--------------After Switching To Frame----------------------\n");
		//System.out.println("\n");
		
 sortable = driver.findElements(By.linkText("Sortable"));
		
		System.out.println(sortable.size());
		
		if(sortable.size()>0)
		{
			System.out.println("sortable present");
		}
		else
		{
			System.out.println("do not present");
		}
		
		
 Draggable = driver.findElements(By.id("draggable"));
		
		System.out.println(Draggable.size());
		
		if(Draggable.size()>0)
		{
			System.out.println("Draggable present");
		}
		else
		{
			System.out.println("do not present");
		}
		
		
		System.out.println("--------------After Switching To Default----------------------\n");
//		System.out.println("\n");
		driver.switchTo().defaultContent();
		
sortable = driver.findElements(By.linkText("Sortable"));
		
		System.out.println(sortable.size());
		
		if(sortable.size()>0)
		{
			System.out.println("sortable present");
		}
		else
		{
			System.out.println("do not present");
		}
		
		
 Draggable = driver.findElements(By.id("draggable"));
		
		System.out.println(Draggable.size());
		
		if(Draggable.size()>0)
		{
			System.out.println("Draggable present");
		}
		else
		{
			System.out.println("do not present");
		}
		//driver.switchTo().parentFrame();
		
	}

}
