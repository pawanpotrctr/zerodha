package Findselements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipile {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chorme.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver pp = new ChromeDriver(); 
	
	pp.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	 pp.findElement(By.xpath("//button[text()='✕']")).click();
	 List<WebElement> ele = pp.findElements(By.xpath("//div"));
	for(WebElement i:ele) {
		String str=i.getText();
		System.out.println(str);
		
		
	}
}
}
