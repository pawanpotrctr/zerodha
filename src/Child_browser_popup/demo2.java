package Child_browser_popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		//search icon
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("remi note 9");
		Thread.sleep(3000);
		//search icon
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		
		//click on 1st mobile show on display
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(3000);
		//by default sellenium control should be on main window so we have to switch it from main to window  child
		Set<String> all = driver.getWindowHandles();
		for( String single:all) {
			driver.switchTo().window(single);
		}
		//get text for our confirmation
		String expP = "REDMI Note 9 ( 128 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com";
		String actP = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		System.out.println(actP);
		//verify the chlild browser handle or not
		if(actP.equals(expP)) {
			System.out.println("tc is pass");	
		}
		else {
			System.out.println("tc is not pass");
		}
		
	}

}
