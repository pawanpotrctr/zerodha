package pomframework_with_ddf_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteKogin1PageT {
	//step 1 declearation
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@type='password']") private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginbtn;
	
	//step 2 initilization
     public  KiteKogin1PageT (WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     //uilization
     public void enterUN(String username) {
    UN.sendKeys(username);
     }
     public void enterPWD(String password) {
    	 PWD.sendKeys(password);
     }
     public void clickloginbtn() {
    	 loginbtn.click();
     }

}
