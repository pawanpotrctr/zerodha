package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) {//set property
		System.setProperty("Webdriver.chrome.driver","C://Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//1>>get ()enter the 
		driver.get("https://www.amazon.com");
		
		
	}

}
