package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://www.w3schools.com/html/html_tables.asp
		
		//Hint: Find number of rows , first row is header
		//Hint: Find number of columns
		//Hint: Print entire table
		
		System.setProperty("webdriver.gecko.driver", "/Users/savanpatel/Documents/Testing Class 2021/Projects/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement table = driver.findElement(By.id("customers"));
		
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		int columnCount = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();
		
		System.out.println("Number of Rows: "+rowCount);
		System.out.println("Number of Columns: "+columnCount);
		
		for(int i = 2; i <= rowCount ; i++) {
			for (int j = 1; j <= columnCount ; j++) {
				WebElement cell = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(cell.getText()+" | ");
			}
			System.out.println("");
		}
	}

}
