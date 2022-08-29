package selixpath_by_atrribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//enter the UN
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	
	//enter the passaward
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
	//log in button
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	
	
}
}
