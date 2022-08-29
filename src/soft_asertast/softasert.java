package soft_asertast;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softasert {
@Test
public void tc1() {
	Reporter.log("test case pass");
	String expR="hii";
	String actR="hello";
	SoftAssert ast = new SoftAssert();
	ast.assertEquals(expR, actR);
	System.out.println("i am after verification");
	ast.assertAll();
	
}
@Test
public void tc3() {
	Reporter.log("hii helo");
}
}
