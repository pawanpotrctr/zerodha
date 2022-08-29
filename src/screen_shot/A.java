package screen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class A {
	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// upcasting 
	 WebDriver driver=new ChromeDriver();
	 
	 
	    driver.get("https://www.google.com/");
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    //i want to take scrnshot of particular element(inspect element store in ref variable)
	    WebElement gTitle = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	    Thread.sleep(3000);
	    File src = gTitle.getScreenshotAs(OutputType.FILE);
	    //store at destination
	    File dest=new File("C:\\Users\\DELL\\Desktop\\Software Testing\\screenshot\\A.jpg");
	    //source to destination
	    
	    Files.copy(src, dest);
	    }
}


	


