package Customize_List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E {
	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// upcasting 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com");
	 Thread.sleep(2000);
	 driver.manage().window().maximize();

	//click on the cancle btn
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//search mobile
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		//click on search button
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//click on 1st mobile so that new child window will opens
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
	}
}
	
	
	
