package not_equal;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class notequal1 {
@Test
public void tc1() {
	Reporter.log("test case running");
	String expR="pawan";
	String actR="bhojraj";
	Assert.assertEquals(expR, actR);
	
}
}
