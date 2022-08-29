package autosuggwstion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KGF {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver pp = new ChromeDriver();
	
	pp.get("https://google.com/");
	Thread.sleep(2000);
	pp.manage().window().maximize();
	pp.findElement(By.xpath("//input[@name='q']")).sendKeys("kgf");
	Thread.sleep(3000);
	List<WebElement> allooption = pp.findElements(By.xpath("//div[@class='wM6W7d']/span"));
	
	//use for each loop
	for( WebElement oneoption :allooption) {
		 String text = oneoption.getText();
		 
		 System.out.println(text);
		if(text.contains("kgf 2 naa song")) {oneoption.click();
		break;
			
		}
	}
}
}
