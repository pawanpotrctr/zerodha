package multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fire {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com/");
	}

}
