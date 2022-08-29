package batch_exicutionTestNG_disable;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2 {
	@Test
public void TC4() {
	Reporter.log("running tc4", true);
}
	@Test
	public void TC5() {
		Reporter.log("running TC 5",true);
	}
	@Test
	public void TC6() {
		Reporter.log("running TC 6", true);
	}
	
}
