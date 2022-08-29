package dynamic_element_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 50000",Keys.ENTER);
		Thread.sleep(3000);
		//navigate to dynamic element (make sure thet class element)
		String text = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[2]")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		String text1 = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[4]")).getText();
		System.out.println(text1);
		Thread.sleep(3000);
		String desc = driver.findElement(By.xpath("(//div[@class='col col-7-12']/descendant::span)[4]")).getText();
		System.out.println(desc);
		
	
	
	
	}

}
