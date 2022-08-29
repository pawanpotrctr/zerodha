package Child_browser_popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
    driver.manage().window().maximize();
	//click on cancle button
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//search mobile
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
	//click on search button
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	//click on 1st mobile so that new child window will opens
	
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	//by default sellenium control should be on main window so we have to switch it from main to window  child
	Set<String> mobile = driver.getWindowHandles();
	
	for( String onemobile:mobile) {
		System.out.println(onemobile);
		driver.switchTo().window(onemobile);
	}
	
	//get text of chlid for our confirmation
  String ExpT= "REDMI Note 10S ( 64 GB Storage, 6 GB RAM ) Online at Best Price On Flipkart.com";
  String AcpT= driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
  
  if(AcpT.equals(ExpT)) {
	  System.out.println("Test case pass");
	  
  }
  else {
	  System.out.println("Test case fail");
  }
	
	
	
	
	


}
}
