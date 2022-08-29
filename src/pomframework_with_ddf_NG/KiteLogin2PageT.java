package pomframework_with_ddf_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2PageT {
	//decleartion
  @FindBy(xpath ="//input[@id='pin']") private WebElement PIN;
  @FindBy (xpath="//button[@class='button-orange wide']") private WebElement cntbtn;
  
  //initialization
  public   KiteLogin2PageT (WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  
  //uitilization
  public void enterPIN (String pinvalue) {
	  PIN.sendKeys(pinvalue);
  }
  public void clickcntbtn() {
	  cntbtn.click();
  }
}
