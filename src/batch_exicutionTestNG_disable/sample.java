package batch_exicutionTestNG_disable;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample {
@Test
	public void TC1() {
		Reporter.log("running tc 1", true);
	}
@Test
public void TC2() {
	Reporter.log("running TC2",true);
}
@Test
public void TC3() {
	Reporter.log("runnig TC3",true);
}
	
	
}
