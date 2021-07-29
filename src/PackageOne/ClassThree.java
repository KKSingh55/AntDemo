package PackageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassThree {
	
@Test
	
	public void methodThree()
	{
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		driver.close();
	}

}
