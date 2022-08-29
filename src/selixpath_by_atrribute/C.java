package selixpath_by_atrribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver pp = new ChromeDriver();
	
	pp.get("https://www.flipkart.com/");
	
	pp.manage().window().maximize();
	pp.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	pp.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("helicopter");
	Thread.sleep(2000);
	pp.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	pp.findElement(By.xpath("//a[@title='Shri sai Remote Control Helicopter Indoor and Outdoor for Kids I Pack of 1 I Multicolour']")).click();
 
    pp.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
    String expT="text/javascript";
    Thread.sleep(4000);
    String actT=pp.getCurrentUrl();
    if(actT.equals(expT)) {
    	System.out.println("home is open and test case is pass");
    }
}
}
