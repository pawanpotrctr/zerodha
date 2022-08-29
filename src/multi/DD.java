package multi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD {
public static void main(String[] args) {
	System.setProperty("webdriver.crhome.driver","C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	
	WebDriver pp = new ChromeDriver();
	
	WebElement dropdown = pp.findElement(By.xpath("//select[@id='Raigad']"));
	//select method
	Select s= new Select(dropdown);
	
	//chech the multi dd or not
	if(s.isMultiple()) {
		System.out.println("DD is multi DD");
	}
		else {
			System.out.println("DD is n ot multi dd");
		}
	//get all option
      List<WebElement> allelement = s.getOptions();	
      System.out.println( allelement.size());
      
      //get text
      for(int i=0; i<=allelement.size()-1; i++) {
    	  WebElement text = allelement.get(i);
    	  String digit = text.getText();
      System.out.println(digit);

}
	
}
}
