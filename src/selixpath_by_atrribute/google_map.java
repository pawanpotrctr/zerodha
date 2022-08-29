package selixpath_by_atrribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_map {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver pp = new ChromeDriver();
	
	pp.get("https://www.google.com/maps/");
	pp.manage().window().maximize();
	
	Thread.sleep(3000);
	
	pp.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys("wardha");

	Thread.sleep(3000);
	pp.findElement(By.xpath("(//div)[88]")).click();
	
	
}
}
