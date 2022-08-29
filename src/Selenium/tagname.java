package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver pp = new ChromeDriver();
	pp.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	pp.findElement(By.cssSelector("input[type='text]")).sendKeys("admin");
	Thread.sleep(2000);
	pp.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
	Thread.sleep(2000);
	pp.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	String expT="actiTIME-EnterTime-Track";
	Thread.sleep(2000);
	String actT=pp.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Home page is opne, TC is pass");
	}
	else {
		System.out.println("Home page is not open, TC is fail");
	}
}
}
