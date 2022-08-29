package Child_browser_popup;

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
	//click on cancle button
	pp.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//search mobile
	pp.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
	//click on search button
	pp.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	//click on 1st mobile so that new child window will opens
	
	Thread.sleep(3000);
	pp.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	//by default sellenium control should be on main window so we have to switch it from main to window  child
	Set<String> allws = pp.getWindowHandles();
	for(String single:allws) {
		pp.switchTo().window(single);//now our selenium control goes from main window to the child
		
	}
	//get the text of child for our confirmation
	String expT="SAMSUNG Galaxy F22 ( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com";
    String actT=pp.findElement(By.xpath("//span[@class='B_NuCl']")).getText();
    System.out.println(actT);
    //verify the child window handle or not 
    Thread.sleep(3000);
    if(actT.equals(expT)) {
    	System.out.println("child window is handles and TC is pass");
    }
    else {
    	System.out.println("ts is fail");
    }

}
}
