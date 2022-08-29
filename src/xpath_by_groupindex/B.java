package xpath_by_groupindex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver pp = new ChromeDriver();
	
	pp.get("https://www.flipkart.com/");
   pp.manage().window().maximize();
   Thread.sleep(2000);
   pp.findElement(By.xpath("(//button)[2]")).click();
   Thread.sleep(2000);
   pp.findElement(By.xpath("(//div)[13]")).click();
   Thread.sleep(2000);
   pp.findElement(By.xpath("(//input)[7]")).click();
   Thread.sleep(2000);
   pp.findElement(By.xpath("(//input)[7]")).sendKeys("9359011857");
   Thread.sleep(2000);
   pp.findElement(By.xpath("(//input)[8]")).click();
   Thread.sleep(2000);
   pp.findElement(By.xpath("(//input)[8]")).sendKeys("pavanpote5599");
   Thread.sleep(2000);
   pp.findElement(By.xpath("(//button)[3]")).click();
   Thread.sleep(3000);
   pp.findElement(By.xpath("(//input)[1]")).click();
   Thread.sleep(2000);
   pp.findElement(By.xpath("(//input)[1]")).sendKeys("Dell xps 9520");
   Thread.sleep(2000);
   pp.findElement(By.xpath("(//button)[1]")).click();
   Thread.sleep(5000);
   pp.findElement(By.xpath("(//img)[5]")).click();
   Thread.sleep(10000);
   pp.findElement(By.xpath("(//button)[2]")).click();
   
   
   
//  Thread.sleep(2000);
  //pp.findElement(By.xpath("(//button)[2]")).click();
  // pp.findElement(By.xpath("(//input)[7]")).sendKeys("9359011857");

}
}
