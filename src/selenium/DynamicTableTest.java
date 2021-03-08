package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	
		System.out.println("------------------Rows---------------");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		System.out.println(rows.size ());
		

		System.out.println("------------------Columns---------------");
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//tr[1]/th"));
		
		System.out.println(columns.size());
		

		System.out.println("------------Create Table----------------");

		for(int  i=2 ; i<=rows.size() ; i++)
		{
			for(int j = 1; j<=columns.size(); j++)
			{
				WebElement table = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")); 
				System.out.print(table.getText()+" | ");
			}
			System.out.println();
		}
		 
	}

}
