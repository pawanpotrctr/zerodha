package i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
public static void main(String[] args) throws Throwable {
	 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	 
	 WebDriver pp= new ChromeDriver();
	 pp.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	 Thread.sleep(3000);
	 pp.manage().window().maximize();
	 
	 pp.switchTo().frame("packageListFrame");
	 //take 1st element of 1st frame
	 
	 String text = pp.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
	 
	 System.out.println(text);
	 
	 //switch to second frame
	 pp.switchTo().frame("packageFrame");
	 //take 1st element of 2nd frame
	//take 1st element on 2nd frame
	 String text1 = pp.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
	 System.out.println(text1);
	 Thread.sleep(3000);


	 //switch to 3rd frame
	 pp.switchTo().defaultContent();//switch control of sel from frame 2 to main webpage
	 pp.switchTo().frame("classFrame");
	 //take any element on 3rd frame
	 String text2 = pp.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
	 System.out.println(text2);
	 }
	 	 
}



