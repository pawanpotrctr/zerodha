package pomframework_with_ddf_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePageT {
//decleration
	@FindBy(xpath="//span[@class='user-id']" ) private WebElement userid;
	
	//initlization
	public KiteHomePageT (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public String verifyuserid() {
		
		String  actID=userid.getText();
		return actID;
	
	}
}
