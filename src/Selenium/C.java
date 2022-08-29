package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver pp = new ChromeDriver();
	
	pp.get("https//www:gmail.com");
	Thread.sleep(2000);
	pp.manage().window().maximize();
	Thread.sleep(2000);
	pp.manage().window().minimize();
    Thread.sleep(2000);
	pp.close();
}
}



