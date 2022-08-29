package Test_NG_3class;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample {
@Test
	public void TC1() {
		Reporter.log("runnning 1", true);
	}
	@Test
public void TC2() {
	Reporter.log("running 2",true);
}
	@Test
	public void TC3() {
		Reporter.log("running 3",true);
	}
	
	
	
}
