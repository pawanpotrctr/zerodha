package Customize_List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//click on create account buton
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("keshav",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("madhov",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7857473",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("mahakeshav796",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='birthday_age']")).sendKeys("89",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
		//select month DD
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		 //creat object of ACTONS class
		 Actions act = new Actions(driver);
		 
		 //click on month
		 Thread.sleep(3000);
		 act.click(month).perform();
		 
		 //move to upside
      act.sendKeys(Keys.ARROW_UP).perform();
      act.sendKeys(Keys.ARROW_UP).perform();
      act.sendKeys(Keys.ARROW_UP).perform();
      Thread.sleep(3000);
		
		
		
	}

}
