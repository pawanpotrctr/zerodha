package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
// upcasting 
 WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
//maximum the browser
Thread.sleep(3000);//it is java wait
driver.manage().window().maximize();
//minimize the browser
Thread.sleep(3000);
driver.manage().window().minimize();
Thread.sleep(3000);
driver.close();
}
}
