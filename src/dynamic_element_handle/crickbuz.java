package dynamic_element_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class crickbuz {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.Cricbuzz.com");
	driver.manage().window().maximize();
Thread.sleep(3000);
   String text = driver.findElement(By.xpath("(//div[@class='cb-ovr-flo'])[3]")).getText();
   System.out.println("India:"+text);
   
   String text1 = driver.findElement(By.xpath("(//div[@class='cb-ovr-flo'])[4]")).getText();
   System.out.println("wi:"+text1);

}

}
