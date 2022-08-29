package selixpath_by_atrribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver pp = new ChromeDriver();
		
		pp.get("https://www.flipkart.com");
		
		pp.manage().window().maximize();
		
		Thread.sleep(3000);
		
		pp.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		pp.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		Thread.sleep(3000);
		pp.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9359011857");
		Thread.sleep(3000);
        pp.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("pavanpote5599");
        Thread.sleep(3000);
        pp.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
        Thread.sleep(3000);
        pp.findElement(By.xpath("//input[@name='q']")).click();
        Thread.sleep(3000);
        pp.findElement(By.xpath("//input[@name='q']")).sendKeys("i phone");
        Thread.sleep(3000);
        pp.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Thread.sleep(9000);
        pp.findElement(By.xpath("//img[@alt='APPLE iPhone 12 (Purple, 64 GB)']")).click();
        Thread.sleep(8000);
        pp.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
	}

}
