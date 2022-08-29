package single_selactable_DD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class metro {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver pp = new ChromeDriver();
	
	pp.get("https://www.mahametro.org/");
	pp.manage().window().maximize();
	Thread.sleep(3000);
	pp.findElement(By.xpath("//li[@class='dropdown open']")).click();
	
	//WebElement Dropdown = pp.findElement(By.xpath("//li[@class='dropdown open']"));
	
	//create  object
	//Select s= new Select(Dropdown);
	
	//by visible name
//	s.selectByVisibleText("About Maha Metro");
	
}
}
