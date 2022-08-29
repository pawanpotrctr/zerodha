package True;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testtrue {
@Test
public void tc1() {
	Reporter.log("test case is running");
	boolean actR=true;
	Assert.assertTrue(actR);
}
}
