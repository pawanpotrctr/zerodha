package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {
public static void main(String[] args) {
	System.setProperty("webdiver.chorme.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32");
	WebDriver pp = new ChromeDriver();
	//url getcurrenturl()
   String link = pp.getCurrentUrl();
   System.out.println(link);
   //getittle
   String title = pp.getCurrentUrl();
   System.out.println(title);
}
}
