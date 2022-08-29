package keys;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Exception_handling.E;

public class demo2 {
public static void main(String[] args) throws Throwable {
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
   driver.findElement(By.xpath("//div[@class='_3OO5Xc']")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("one plus nord");
   Thread.sleep(3000);
   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
   //by default selenium controlon main windows we have to swirch it from main window to main child
 Set<String> oneoption = driver.getWindowHandles();
   //use arrys list for store all the windows
   ArrayList<String> al = new ArrayList<String>( oneoption);
   String cw = al.get(0);
   System.out.println(cw);
   //print main session ID
     String ap = al.get(0);
     System.out.println(ap);
     //switch to main window
     Thread.sleep(3000);
     driver.switchTo().window(al.get(0));
     //for confirmation
     String title = driver.getTitle();
     System.out.println(title);
      
     
     
   

}
}
