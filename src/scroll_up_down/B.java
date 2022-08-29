package scroll_up_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
   driver.manage().window().maximize();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9359011857");
   Thread.sleep(3000);
   driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("pavanpote5599");
   Thread.sleep(3000);
   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
   Thread.sleep(3000);
   JavascriptExecutor jse = (JavascriptExecutor)driver;
   jse.executeScript("window.scrollBy(0,2000)");
   Thread.sleep(2000);
   jse.executeScript("window.scrollBy(0,-1000)");
   
}
}
