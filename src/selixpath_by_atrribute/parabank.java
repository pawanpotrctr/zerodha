package selixpath_by_atrribute;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class parabank {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver pp = new ChromeDriver();
	pp.get("https://parabank.parasoft.com/parabank/index.htm");
	pp.manage().window().maximize();
	Thread.sleep(2000);
	pp.findElement(By.xpath("//input[@name='username']")).click();
	Thread.sleep(2000);
	pp.findElement(By.xpath("//input[@name='username']")).sendKeys("username");
	Thread.sleep(2000);
	pp.findElement(By.xpath("//input[@name='password']")).click();
	Thread.sleep(2000);
	pp.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
	Thread.sleep(2000);
	pp.findElement(By.xpath("//input[@class='button']")).click();
	Thread.sleep(2000);
	pp.findElement(By.xpath("(//a)[5]")).click();
	Thread.sleep(2000);
	WebElement dropdown = pp.findElement(By.xpath("//select[@id='gtranslate_selector']"));
	Thread.sleep(10000);
	
	pp.findElement(By.xpath("//a[@id='hs-eu-confirmation-button']")).click();
	Thread.sleep(5000);
	pp.findElement(By.xpath("//select[@id='gtranslate_selector']")).click();
	//create object of class
	Select s = new Select(dropdown);
		
	//select by visible
	
	
	
	
}
}
