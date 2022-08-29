package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver pp= new ChromeDriver();
Thread.sleep(2500);
	pp.get("https://www.google.com/");
Thread.sleep(3000);
findElement("india");
Thread.sleep(3000);
	pp.manage().window().maximize();
	Thread.sleep(3000);
	pp.manage().window().minimize();
	Thread.sleep(3000);
	pp.close();
}

private static void findElement(String string) {
	// TODO Auto-generated method stub
	
}
}
