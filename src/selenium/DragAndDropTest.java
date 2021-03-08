package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']/p"));
		System.out.println(draggable.getText());
		
		WebElement droppable  = driver.findElement(By.xpath("//div[@id='droppable']/p"));
		System.out.println(droppable.getText());
		
		System.out.println("Before Drag"+draggable.getLocation());
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
		
		wait.until(ExpectedConditions.textToBePresentInElement(droppable, "Dropped!"));
		
		System.out.println("After Drag"+draggable.getLocation());
		
		if (droppable.getText().equals("Dropped!")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

} 
