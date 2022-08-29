package selli_Xpath_by_contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver pp = new ChromeDriver();
		
		pp.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		pp.manage().window().maximize();
		Thread.sleep(2000);
		pp.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		Thread.sleep(2000);
		pp.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		Thread.sleep(2000);
		pp.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
		pp.close();
	}

}
