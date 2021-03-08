package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/?guccounter=1&guce_referrer=aHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS91cmw_c2E9dCZyY3Q9aiZxPSZlc3JjPXMmc291cmNlPXdlYiZjZD0mdmVkPTJhaFVLRXdqWXA2dnY0Wkh1QWhYR2wtQUtIWnVOQUs4UUZqQUFlZ1FJQVJBRCZ1cmw9aHR0cHMlM0ElMkYlMkZjYS55YWhvby5jb20lMkYmdXNnPUFPdlZhdzFMaWc5eDRBeXJqMTYxc0U2VWdvX04&guce_referrer_sig=AQAAAD1yZMFBgAdMYW6tQLE9G4qNHE2jJYS2Q0CzkPLZDzlmcbmT6X4cq6ZsG0PBJS_7QnP2gB3bJzFMVIa7weM1bW-VSD7-mSdAqc7J0LU5gSwcTXzJPlDr1FxjiR3SGyvrA_T9LLKtpJCbRpOL5dU2NNzb1v52tCnwdLWpR9QVa7zj");
		
		
		driver.findElement(By.name("p")).sendKeys("canada");
		
		Thread.sleep(2000);
		
		List<WebElement> allNames = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println(allNames.size());
		
		for(WebElement a : allNames)
			System.out.println(a.getText());
		
	}

}
