package Customize_List_box;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Actions_class.actions;

public class F {
public static void main(String[] args) throws Exception {
	//lic static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// upcasting 
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 //click on the creaat account button
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 
		 //select the monthDD
		 Thread.sleep(2000);
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
             
		 //creat object of action class
		 
		 Actions act = new Actions(driver);
		 Thread.sleep(2000);
		 act.click(month).perform();
		 
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 
		 //seect month
		WebElement date = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
		act.click(date).perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		WebElement year = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
		
		act.click(year).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		
		 
		 
		 
		 
		 


}
}
