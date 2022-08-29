package Customize_List_box;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
	public static void main(String[] args) throws Throwable {
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
		 //creat object of ACTONS class
		 Actions  act = new Actions(driver);
		 
		 
		 //click on month
		 Thread.sleep(3000);
		 act.click(month).perform();
		 
		 //move to upside
       act.sendKeys(Keys.ARROW_UP).perform();
       act.sendKeys(Keys.ARROW_UP).perform();
       act.sendKeys(Keys.ARROW_UP).perform();
       Thread.sleep(3000);
       
       
       //move down
       //act.sendKeys(Keys.ARROW_DOWN).perform();
     //  act.sendKeys(Keys.ARROW_DOWN).perform();
       
       //select topmost elemenys
   //    act.sendKeys(Keys.HOME).perform();
       
       //enter keys
   //    act.sendKeys(Keys.ENTER).perform();
       //Thread.sleep(3000);
       
       //inspect for date
      //WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		
      //actions
     // Actions Act = new Actions(driver);
      
      //down
      //Act.sendKeys(Keys.DOWN).perform();
     // Act.sendKeys(Keys.DOWN).perform();
      
      // enter keys
      //Act.sendKeys(Keys.ENTER).perform();
		 
		
	}

}
