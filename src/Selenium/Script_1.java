package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_1 {
public static void main(String[] args)throws Throwable {
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver pp = new ChromeDriver();
	pp.get("https://www.gogle.com/");
	//maxixmum the browser
	Thread.sleep(3000);
	pp.manage().window().maximize();
	Thread.sleep(3000);
	//minimize browser
	pp.manage().window().minimize();
	//note:boss in sel(3 version) there is no minimize (0  but from (4version) onwards it is implemented
	
}
}
//piblic class 
