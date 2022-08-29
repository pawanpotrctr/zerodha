package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
   driver.get("https://demo.actitime.com/login.do");
   Thread.sleep(1000);
   driver.manage().window().maximize();
   Thread.sleep(1000);
   driver.findElement(By.id("username")).sendKeys("admin");
   Thread.sleep(1000);
   driver.findElement(By.name("pwd")).sendKeys("manager");
   Thread.sleep(2000);
   driver.findElement(By.id("longinButton")).click();
   
   
}
}
	
