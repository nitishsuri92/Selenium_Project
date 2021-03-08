package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://moodle.cestarcollege.com/moodle/");
		
		driver.findElement(By.linkText("Faq")).click();
		
		
		Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator();
		
		String mainwindow = iter.next();
		String childwindow = iter.next();
		System.out.println(mainwindow);
		System.out.println(childwindow);
		
		
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		driver.close();
        Thread.sleep(2000);
		driver.switchTo().window(mainwindow);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
