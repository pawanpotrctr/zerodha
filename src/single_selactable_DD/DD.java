package single_selactable_DD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");

  WebDriver pp = new ChromeDriver();
  
  pp.get("C:\\Users\\DELL\\Downloads\\Govinda.HTML");
  
   WebElement Dropdown = pp.findElement(By.xpath("//select[@id='govinda']"));

   //creat object
   Select s= new Select(Dropdown);
   
   //use method of select class
  // s.selectByIndex(4);
   
   //select by value
   //s.selectByValue("D");
   
   //select by visible text
   s.selectByVisibleText("dosa");
   







}
}
