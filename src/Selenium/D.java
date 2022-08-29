package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver pp = new ChromeDriver();
	pp.get("https://www.google.com");
	pp.manage().window().maximize();
	pp.manage().window().minimize();
	pp.close();
			
	
	}

}
