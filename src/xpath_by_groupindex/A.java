package xpath_by_groupindex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver pp = new ChromeDriver();
		pp.get("https://demo.actitime.com/login.do"); 
       pp.manage().window().maximize();
       Thread.sleep(2000);
	   pp.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
	   Thread.sleep(2000);
	   pp.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
	   
	   pp.findElement(By.xpath("(//div)[13]")).click();
	}

}
