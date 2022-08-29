package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_get_title {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver pp = new ChromeDriver();
	pp.get("https:/www.google.com/");
	//get title
	String exptT ="Google";
		String actT = pp.getTitle();
		if(actT.equals(exptT)) {
			System.out.println("test case is pass, expT and are matching");
		}
		else {
			System.out.println("test case is fail,expT and matching ");
		}
		pp.close();
}
}
