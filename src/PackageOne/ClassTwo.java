package PackageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassTwo {
	
@Test
	
	public void methodTwo()
	{
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.co.in/");
		driver.close();
	}

}
