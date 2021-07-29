package PackageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassFour {
	
@Test
	
	public void methodFour()
	{
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.co.in/");
		driver.close();
	}

}
