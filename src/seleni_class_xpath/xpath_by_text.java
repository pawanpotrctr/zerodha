package seleni_class_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver pp = new ChromeDriver();
		
		
		pp.get("https://demo.actitime.com/login.do");
		
		pp.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		pp.findElement(By.xpath("//input[@name='pwd']")).sendKeys("admin");
		
		pp.findElement(By.xpath("//div[text()='Login ']")).click();	
	}

}
