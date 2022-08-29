package multi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mutlidd {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver pp = new ChromeDriver();
	pp.get("C:\\\\Users\\\\DELL\\\\Downloads\\\\Ashoka.HTML");
	pp.manage().window().maximize();
	Thread.sleep(3000);
	WebElement Dropdown = pp.findElement(By.xpath("//select[@id='Raigad']"));
	
	//select method
	Select s = new Select(Dropdown);
	//s.deselectAll();
	//check whether multi dd or not
	if(s.isMultiple()) {
		System.out.println("dd is multi selectable");
	}
	else {
		System.out.println("DD is not multiselecatbale");
	}
	//get the all option
	List<WebElement> allelements = s.getOptions();
	System.out.println(allelements.size());
	
	//get all elements text
	for(int i=0; i<=allelements.size()-1; i++) {
		WebElement oneelements = allelements.get(i);
		String text = oneelements.getText();
		System.out.println(text);
		
		
	}
			}
}
