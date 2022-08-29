package Child_browser_popup;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Actions_class.actions;

public class demo3 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
        WebElement pp = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[1]"));
	    actions act = new actions(driver);
	   
	    
		
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		//search icon
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("remi note 9");
		Thread.sleep(3000);
		//search icon
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		
		
		
	}

}
