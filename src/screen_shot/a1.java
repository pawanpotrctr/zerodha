package screen_shot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class a1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	 Thread.sleep(3000);
	    driver.manage().window().maximize();
	    //i want to take scrnshot of particular element(inspect element store in ref variable)
	  WebElement title = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	    
	  Thread.sleep(3000);
	  File dest = title.getScreenshotAs(OutputType.FILE);
	   
	  File pp = new File("C:\\\\Users\\\\DELL\\\\Desktop\\\\Software Testing\\\\screenshot\\\\lohin.jpg");
	  Files.copy(dest, pp);
	  
}
}
