package tstng_flage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flags {
	@Test(invocationCount=5)
public void TC() {
	Reporter.log("running tc", true);
}
}
