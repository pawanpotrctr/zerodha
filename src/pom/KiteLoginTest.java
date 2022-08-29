package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class kitelogintest {
	public class KiteLoginTest {//ULC
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://kite.zerodha.com/");
		    //maximize
		    driver.manage().window().maximize();
		    //implicitly wait
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    //1st pom class
		    KiteLoginTest login1= new  KiteLoginTest(driver);
		    login1.enterUN();
		    login1.enterUN();
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

	private void clickLOGINBTN() {
			// TODO Auto-generated method stub
			
		}

	private void enterUN() {
		// TODO Auto-generated method stub
		
	}
		}
}
