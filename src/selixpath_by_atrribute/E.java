package selixpath_by_atrribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E {
	
	
	public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.Amazon.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//drop button for signup
	driver.findElement(By.xpath("//a[@id='icp-nav-flyout']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='action-inner']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("9359011857");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pavan5599");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='password']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("pavan5599");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='ap_password']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("pavan5599");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	//important msms
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("pavan5599");
	Thread.sleep(12000);
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath(("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']").
	
	
	
	
	
//	driver.findElement(By.xpath("//a[@id=&#39;nav-link-accountList&#39;]")).click();
//	Thread.sleep(3000);
//	//Click on signin button
//	driver.findElement(By.xpath("//span[text()=&#39;Sign in&#39;]")).click();
//	Thread.sleep(3000);
//	//send email/mobile number
//	driver.findElement(By.xpath("//input[@id=&#39;ap_email&#39;]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@class=&#39;a-input-text a-span12 auth-autofocus auth-required-field&#39;]")).sendKeys("8888520726");
//	Thread.sleep(3000);
//	//click on continue
//	driver.findElement(By.xpath("//input[@id=&#39;continue&#39;]")).click();
//	Thread.sleep(3000);
//	
	}
}
