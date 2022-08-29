package Test_NG_3class;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2 {
	@Test
public void TC4() {
	Reporter.log("running tc 4",true);
}
	@Test
	public void TC5() {
		Reporter.log("running tc5",true);
	}
	@Test
	public void TC6() {
		Reporter.log("runnig tc 6",true);
	}
}
