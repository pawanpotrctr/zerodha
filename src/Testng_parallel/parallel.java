package Testng_parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel {
@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		
	}
}
