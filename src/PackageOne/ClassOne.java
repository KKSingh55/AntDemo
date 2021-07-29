package PackageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassOne {
	
	@Test
	
	public void methodOne()
	{
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.close();
	
	}
}
