package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
public static void main(String[] args) throws Throwable{
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver pp=new ChromeDriver();
	pp.navigate().to("https://www.goggle.com/");
	Thread.sleep(3000);
	pp.navigate().to("https.//www.amazon.com.com/");
	Thread.sleep(3000);
	//backward
	pp.navigate().back();
	Thread.sleep(3000);
	//forward()
	pp.navigate().forward();
	Thread.sleep(3000);
	//refresh
	pp.navigate().refresh();
	//close()>>it is used to close current browser
	//pp.close();
	pp.quit();
	
	
}
}
