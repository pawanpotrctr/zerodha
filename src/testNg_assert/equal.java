package testNg_assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class equal {
	@Test
	public void TC1() {
		Reporter.log("TC1 is running",true);
		String expR="pawan";
		String actR="pawan";
		Assert.assertEquals(expR,actR);
	}
}
