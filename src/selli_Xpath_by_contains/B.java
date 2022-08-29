package selli_Xpath_by_contains;

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
	 pp.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("O mahi");
	 
	 Thread.sleep(2000);
	 pp.findElement(By.xpath("//button[contains(@id,'search-icon-legacy')]")).click();
	 Thread.sleep(4000);
	 pp.findElement(By.xpath("//a[contains(@id,'video-title-link')]")).click();
}
}
