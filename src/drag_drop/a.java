package drag_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class a {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// upcasting 
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		 Thread.sleep(3000);
		 
		 //inspect the first element and store in eelement 1
		 WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		 Thread.sleep(3000);
		 
		 //inspect the second element and store in element2
		WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(ele1, ele2).perform();
	}

}
