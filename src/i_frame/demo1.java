package i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String[] args) throws Exception {

	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
    Thread.sleep(4000);
   //switch to frame no 2
    driver.switchTo().frame("iframeResult");
    //enter first name
    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("pawan");
    //enter last name
    driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("pote");
    //click on submit button
    driver.findElement(By.xpath("//input[@value='Submit']")).click();

}
}
