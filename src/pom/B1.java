package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B1 {
//declaration
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath ="//button[@class='button-orange wide']")private WebElement LOGINBUTTON;
	
	//step 2 initilazition
	public  B1 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utillization
	public void enterUN(){
		UN.sendKeys("DPG458");
	}	
		public void enterPWD(){
	PWD.sendKeys("Amol@1234");
		}
		public void enterLOGINBUTTON() {
			LOGINBUTTON.click();
		}
		
	}

