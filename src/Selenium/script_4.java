package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script_4 {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver pp = new ChromeDriver();
	pp.get("https://www.amazon.com/");
	//use css selector (choice the mobile)
	Thread.sleep(2000);
	pp.findElement(By.cssSelector("input[type='text']"));
	//click on the search button
	Thread.sleep(2000);
	pp.findElement(By.cssSelector("input[type='submit']"));
	Thread.sleep(2000);
	pp.quit();
}
}
