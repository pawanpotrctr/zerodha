package seleni_class_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_contains {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	
	//enter the un
	 driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
	 
	 //enter the passward
	 driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
	 
	 //login
	 driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
	 
	
}
}
