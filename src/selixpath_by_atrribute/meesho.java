package selixpath_by_atrribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meesho {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver pp = new ChromeDriver();
	
	pp.get("https://www.meesho.com/");
	
	pp.manage().window().maximize();
	Thread.sleep(3000);
	
	pp.findElement(By.xpath("//div[@class='TextSearch__S_SearchInput-n7qqmw-0 gWLJgD']")).click();
	Thread.sleep(3000);
	//pp.findElement(By.xpath("//div[@class='TextSearch__S_SearchInput-n7qqmw-0 gWLJgD']")).sendKeys("condom");
	pp.findElement(By.xpath("(//span)[8]")).click();
	Thread.sleep(3000);
   pp.findElement(By.xpath("(//img)[3]")).click();
   Thread.sleep(3000);
   pp.findElement(By.xpath("(//span)[66]")).click();
   Thread.sleep(3000);
   pp.findElement(By.xpath("//button[@class='BaseButton-sc-1e0kf5s-0 dptmxj ProductCard__GhostButtonBigStyled-camkhj-2 hJLKiu ProductCard__GhostButtonBigStyled-camkhj-2 hJLKiu']")).click();
   Thread.sleep(3000);
   pp.findElement(By.xpath("//div[@class='Input__InputContainer-sc-1goybxj-0 hwSOdA']")).click();
   Thread.sleep(3000);
   pp.findElement(By.xpath("(//input)[2]")).sendKeys("9359011857");
   Thread.sleep(3000);
   pp.findElement(By.xpath("//div[@class='BaseButton__ButtonWrapper-sc-1e0kf5s-1 hmXLwN']")).click();
}
}
