package xpath_by_text;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver pp = new ChromeDriver();
	pp.manage().window().maximize();
	Thread.sleep(3000);
}
}
