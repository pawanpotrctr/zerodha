package Customize_List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// upcasting 
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 //click on the creaat account button
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		 //select month
		 Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//creat object of select class
		Actions act = new Actions(driver);
		
		//perfrom action of month
		act.click(month).perform();
		
		//move to up side
		act.sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(1000);
		 act.sendKeys(Keys.ARROW_UP).perform();
		 
		 //select date
		 WebElement date = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
		 //perfrom action of date
		 act.click(date).perform();
		 //move to up side
		 act.sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(1000);
		 act.sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		 
	}

}
