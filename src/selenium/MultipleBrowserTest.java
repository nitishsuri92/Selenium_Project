package selenium;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

FileInputStream fi = new FileInputStream("C:\\testing\\prop.properties");
		
		Properties prop = new Properties();
		prop.load(fi);
		
		String browser = prop.getProperty("browser");
		

		WebDriver driver;
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
		}
		else
		{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("vkbfeh");
		driver.findElement(By.name("pass")).sendKeys("vkbfeh");
	    driver.findElement(By.name("login")).click();
		
		}

}
