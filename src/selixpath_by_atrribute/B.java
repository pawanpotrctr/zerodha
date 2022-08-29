package selixpath_by_atrribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver pp = new ChromeDriver();
	 pp.get("https://www.youtube.com/");
	 pp.manage().window().maximize();
	 Thread.sleep(2000);
	 pp.findElement(By.xpath("//input[@id='search']")).sendKeys("miya bhai");
	 Thread.sleep(2000);
	 
	 pp.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	 Thread.sleep(2000);
	 
	  pp.findElement(By.xpath("//a[@title='MIYA BHAI HYDERABADI  | OFFICIAL VIDEO | RUHAAN ARSHAD |']")).click();
	  Thread.sleep(8000);
	  pp.findElement(By.xpath("//span[@class='ytp-ad-skip-button-container']")).click();
	  
	  //test case
	//  String expT=""
	  
	  
	 
}
}
