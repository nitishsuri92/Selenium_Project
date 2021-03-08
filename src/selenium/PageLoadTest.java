package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PageLoadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create New Account")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("dharmil");
		driver.findElement(By.name("reg_email__")).sendKeys("7676677687");
		driver.findElement(By.id("password_step_input")).sendKeys("rhdjbsjb");
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByIndex(4);
		
		
		WebElement date = driver.findElement(By.id("day"));
		Select d = new Select(date);
		d.selectByValue("20");
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("2000");;
		
		driver.findElement(By.name("websubmit")).click();
		
	}

}
