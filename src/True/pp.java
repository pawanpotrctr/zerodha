package True;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class pp {
@Test
public void tc3() {
	Reporter.log("test case pass");
	boolean expR=true;
	Assert.assertTrue( expR);
}
}
