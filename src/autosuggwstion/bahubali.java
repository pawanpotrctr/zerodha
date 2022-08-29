package autosuggwstion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bahubali {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
driver.get("https://google.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Bahuali");
List<WebElement> maheshamati = driver.findElements(By.xpath("(//div[@class='wM6W7d'])[1]/span"));

//for loop
for(WebElement devsena:maheshamati) {
	String bahlla = devsena.getText();
	
	System.out.println(bahlla);
	//if(bahlla.contains(bahlla))
}

}
}
