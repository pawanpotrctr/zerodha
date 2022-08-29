package Child_browser_popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver pp = new ChromeDriver();
	
	pp.get("https://www.flipkart.com");
	Thread.sleep(3000);
	pp.manage().window().maximize();
	pp.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(3000);
	pp.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile i phone");
	Thread.sleep(3000);
	pp.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	//click on the 1st mobile of childe window
	Thread.sleep(3000);
	pp.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	//by default sellenium control should be on main window so we have to switch it from main to window  child
	Set<String> allws = pp.getWindowHandles();
	for(  String single:allws) {
		pp.switchTo().window(single);
	}
	//get the text of child for our confirmation
	String Expct="APPLE iPhone 11 ( 128 GB Storage, 0 GB RAM ) Online at Best Price On Flipkart.com";
	String acpt = pp.findElement(By.xpath("//div[@class='_1BweB8']")).getText();
	System.out.println(acpt);
	//verify the child window or not
	Thread.sleep(3000);
    if(acpt.equals(Expct)) {
    	System.out.println("child window is handles and TC is pass");
    }
    else {
    	System.out.println("ts is fail");
    }

}
}
