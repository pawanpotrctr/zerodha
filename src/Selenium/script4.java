package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script4 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver pp = new ChromeDriver();
	Thread.sleep(2000);
	//open the application
	pp.get("https://www.google.com/");
	//css selector
	Thread.sleep(2000);
	pp.findElement(By.cssSelector("input[aria-haspopup='false']")).sendKeys("pawan");
	pp.quit();
}
}
