package pomframework_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.KiteLoginTest;

public class kitelogintest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
	    //WebDriver driver=new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	    //maximize
	    driver.manage().window().maximize();
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //1st pom class
	    KiteKogin1Page login1=new KiteKogin1Page(driver);
	    login1.enterUN();
	    login1.enterPWD();
	    login1.clickLOGINBTN();
	    
	    //2nd pom class
	    KiteLogin2Page login2=new KiteLogin2Page(driver);
	    login2.enterPIN();
	    login2.clickcntBtn();
	    
	    //3rd class
	    KiteHomePage hm=new KiteHomePage(driver);
	    hm.verifyuserID();
	    driver.close();
	}
	}


