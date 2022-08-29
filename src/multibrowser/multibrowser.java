package multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multibrowser {
	@Parameters("browsername")

	@Test
	public void TC(String browsername) {//parametrise method
		WebDriver driver=null; //runtime polymorphism
	
		
		if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver = new ChromeDriver();
	//	driver.get("https://google.com/");
		
	}
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\geckodriver.exe");
		 driver = new FirefoxDriver();
		//	driver.get("https://amazon.com/");
			
		}
		driver.get("https://kite.zerodha.com/");
		}
}
