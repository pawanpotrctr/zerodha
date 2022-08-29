package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {
public actions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// upcasting 
	 WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	//inspect for target element 
  WebElement gamil = driver.findElement(By.xpath("//a[text()='Gmail']"));

 //creat object o f axtion class
   Actions act = new Actions(driver);
   
   //>>right click (contextclick())
  // act.moveToElement(gamil).contextClick().perform();
   
   //>>left click/click()
  // act.moveToElement(gamil).click().perform();
   
   //>>Double click()
  // act.moveToElement(gamil).doubleClick().perform();
   
   //how to perfrom 3 action in single statement
   act.moveToElement(gamil).contextClick().doubleClick(gamil).build().perform();
}
}
