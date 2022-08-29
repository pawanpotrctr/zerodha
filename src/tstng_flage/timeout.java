package tstng_flage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
	@Test(timeOut=8000)
public void tc(){
	Reporter.log("hii", true);
	
}
}
