package pomframework_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	//Declaration
		@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
		
		
		//initialization
		public KiteHomePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//utilization
		public void verifyuserID() {
			String expID="DPG458";
			String actID = userID.getText();
			if(actID.equals(expID)) {
				System.out.println("TC is pass");
			}
			else {
				System.out.println("TC is fail");
			}
		}

}
