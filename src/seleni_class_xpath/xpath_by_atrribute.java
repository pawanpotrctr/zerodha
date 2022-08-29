package seleni_class_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_atrribute {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver pp = new ChromeDriver();
	// Enter the url
	pp.get("https://demo.actitime.com/login.do");
	
	Thread.sleep(2000);
	
	//enter un
	pp.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	
	// enter the PWD
	pp.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
	//click log in button
	pp.findElement(By.xpath("//div[text()='Login ']")).click();
	

}
}
