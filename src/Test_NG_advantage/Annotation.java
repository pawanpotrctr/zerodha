package Test_NG_advantage;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeClass
public void openbrower() {
	Reporter.log("open the browser", true);
}
	@BeforeMethod
	public void loginApp() {	
		Reporter.log("log in the app", true);
	}
	@Test
	public void verifyID() {
		Reporter.log("verify user id", true);
	}
@AfterMethod
	public void logoutapp() {
		Reporter.log("logout from app", true);
	}
@AfterClass
public void cloebrowser() {
	Reporter.log("close the browser", true);
}
}
