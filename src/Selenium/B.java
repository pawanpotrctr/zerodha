package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver kk = new ChromeDriver();
	kk.get("https://www.google.com/");
	kk.manage().window().maximize();
	kk.manage().window().minimize();
	kk.close();
}
}
