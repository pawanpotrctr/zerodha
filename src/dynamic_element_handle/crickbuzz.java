package dynamic_element_handle;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class crickbuzz {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("//https://www.todaylivescore.com/");
	 driver.manage().window().maximize();
	 //print live score 
	 String text = driver.findElement(By.xpath("(//div[@class='matchheader cb-ovr-flo'])[1]")).getText();
	 System.out.println("there is no match avillable: "+text);
	 
	 String text1 = driver.findElement(By.xpath("(//span[@class='ui-team-matches-name'])[1]")).getText();
	 System.out.println(text1);
	 
	 String text2 = driver.findElement(By.xpath("(//div[@class='ui-team2-scores'])[1]")).getText();
	 System.out.println(text2);
	 

     String text3 = driver.findElement(By.xpath("(//span[@class='cbz-ui-home cbz-ui-home-yellow cbz-common-match'])[1]")).getText();
System.out.println(text3);
}
}
