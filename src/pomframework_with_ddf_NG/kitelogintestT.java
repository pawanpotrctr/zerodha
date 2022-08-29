package pomframework_with_ddf_NG;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class kitelogintestT {
	//declear all useful member as global sheet sh;
	Sheet sh;
	WebDriver driver;
	KiteKogin1PageT login1;
	KiteLogin2PageT login2;
	KiteHomePageT  home;
	private String password;
	
	@BeforeClass
	public void openbrowser()  throws Throwable{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\Software Testing\\zirodha.xlsx");
		WorkbookFactory.create(fis).getSheet("zirodha");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		//maximise
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//all object of POM class
		login1= new KiteKogin1PageT(driver);
		login2 = new KiteLogin2PageT(driver);
		home = new KiteHomePageT(driver);
	}
	
	@BeforeMethod
	public void logintoapp() {
		//enter un
		String username= sh.getRow(0).getCell(0).getStringCellValue();
		login1.enterUN(username);
		//enterpwd
		sh.getRow(0).getCell(1).getStringCellValue();
		login1.enterPWD(password);
		//click on log in btn
		login1.clickloginbtn();
		
		//enter pin
		String pinvalue = sh.getRow(0).getCell(2).getStringCellValue();
		login2.enterPIN(pinvalue);
		//click on continuebtn
		login2.clickcntbtn();
		}
	@Test
	public void verifuserID() {
		Reporter.log("running verify user id", true);
		String actID = home.verifyuserid();
		String expID = sh.getRow(0).getCell(0).getStringCellValue();
		Assert.assertEquals(actID, expID, "both are different tc is failed");
	}
	@AfterMethod
	public void logoutPP() {
		Reporter.log("logout the application",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the app",true);	
	}
}
