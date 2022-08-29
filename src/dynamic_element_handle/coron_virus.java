package dynamic_element_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class coron_virus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.worldometers.info/coronavirus/country/uk");
	driver.manage().window().maximize();
	
	//print corona virus casses
	String text = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[1]")).getText();
    System.out.println("corona virus casses :"+text);
    
    String text1 = driver.findElement(By.xpath("(//div[@id='maincounter-wrap']//span)[2]")).getText();
	System.out.println("Deaths :"+text1);
	
	String text2 = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
	System.out.println("Recovered :"+ text2);
}
}
