package pomframework_with_ddf_NG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zerodha {
public static void main(String[] args) throws Exception {
	FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\Software Testing\\zirodha.xlsx");
	Sheet pp = WorkbookFactory.create(fis).getSheet("zirodha");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com");
	
	//global wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	 String UN = pp.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
	//enter pwd
	String pwd = pp.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	//log in button
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	//enter pin
	String pin = pp.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
	//click on continue buttin
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	 String expID = pp.getRow(0).getCell(3).getStringCellValue();
	    String actID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	    if(actID.equals(expID)) {
	    	System.out.println("TC pass");
	    }
	    else {
	    	System.out.println("TC fail");
	    }
	    
	
}
}
