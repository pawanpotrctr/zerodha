package single_selactable_DD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class para {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver pp = new ChromeDriver();
		
		pp.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(3000);
		pp.findElement(By.xpath("//input[@name='username']")).click();
		Thread.sleep(2000);
		pp.findElement(By.xpath("//input[@name='username']")).sendKeys("username");
		Thread.sleep(2000);
		pp.findElement(By.xpath("//input[@name='password']")).click();
		Thread.sleep(2000);
		pp.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		Thread.sleep(2000);
		pp.findElement(By.xpath("//input[@class='button']")).click();
}
}