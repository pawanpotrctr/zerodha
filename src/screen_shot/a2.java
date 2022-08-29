package screen_shot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class a2 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	 Thread.sleep(3000);
	    driver.manage().window().maximize();
	    //i want to take scrnshot of particular element(inspect element store in ref variable)
	    WebElement Title = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
         File pp = Title.getScreenshotAs(OutputType.FILE);
        
          File po = new File("C:\\Users\\DELL\\Desktop\\Software Testing\\screenshot\\pawan.jpg");
          Files.copy(pp, po);

}
}
