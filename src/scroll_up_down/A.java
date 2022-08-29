package scroll_up_down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	// upcasting 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.com/");
	    //typecast javascriptexecutor
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,2000);");
	    Thread.sleep(3000);
	    jse.executeScript("window.scrollBy(0,-1000);");
	}
	

}


