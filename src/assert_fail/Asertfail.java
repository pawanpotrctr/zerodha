package assert_fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

 class Asertfail {
@Test
public void tc2() {
	Reporter.log("test case pass");
	Assert.fail();//verification
	System.out.println("i m after fail");//verification 2 
}
@Test
public void tc3() {
	 Reporter.log("test case pass");
}

}
