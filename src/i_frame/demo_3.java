package i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_3 {
public static void main(String[] args) throws Throwable {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver pp = new ChromeDriver();
     // Thread.sleep(2000);
      pp.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
      Thread.sleep(4000);
      pp.switchTo().frame("iframeResult");
      Thread.sleep(2000);
      pp.findElement(By.xpath("//input[@id='fname']")).sendKeys("pawan");
      Thread.sleep(2000);
      pp.findElement(By.xpath("//input[@id='lname']")).sendKeys("pote");
      Thread.sleep(2000);
      pp.findElement(By.xpath("//input[@type='submit']")).click();

}
}
