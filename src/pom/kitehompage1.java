package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehompage1 {
//public class kitehompage1 {
	//declearation 
	@FindBy(xpath ="")private WebElement UserID;
	//initilization
	
	public kitehompage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		//utilization
		public void verifyuserID() {
			String expID="DPG458";
			String actID = UserID.getText();
			if(actID.equals(expID)) {
				System.out.println("TC is pass");
			}
			else {
				System.out.println("TC is fail");
			}
}
}
