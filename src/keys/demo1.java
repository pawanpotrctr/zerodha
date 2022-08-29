package keys;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver pp = new ChromeDriver();
	
	pp.get("https://www.flipkart.com");
	
	pp.manage().window().maximize();
	
	Thread.sleep(3000);
	
	pp.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(3000);
	pp.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
	Thread.sleep(3000);
	pp.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9359011857");
	Thread.sleep(3000);
    pp.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("pavanpote5599");
    Thread.sleep(3000);
    pp.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
    Thread.sleep(3000);
    pp.findElement(By.xpath("//input[@name='q']")).click();
    Thread.sleep(3000);
    pp.findElement(By.xpath("//input[@name='q']")).sendKeys("i phone");
    Thread.sleep(3000);
    pp.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    //by default selenium controlon main windows we have to swirch it from main window to main child
    Thread.sleep(3000);
     Set<String> allws = pp.getWindowHandles();
    //use arrys list for store all the windows
    ArrayList<String> al = new ArrayList<String>(allws);
    String cw= al.get(1);
    System.out.println(cw);
    //print main session ID 
     String manwin = al.get(0);
     System.out.println(manwin);
     //switch to main window
     Thread.sleep(3000);
     pp.switchTo().window(al.get(0));
     //for confirmation
    String title = pp.getTitle();
    System.out.println(title);
     
     
    
    
    
    
    
    
    
    
}
}
