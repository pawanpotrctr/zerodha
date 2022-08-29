package soft_asert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_asert_class {
@Test
public void tc1() {
	Reporter.log("test case pass");
	String expR="hi";
	String actR="hello";
	SoftAssert st = new SoftAssert();
	st.assertEquals(expR, actR);
	System.out.println("i am after verification");
	//mandatory
	st.assertAll();
	
}
@Test
public void tc2() {
	Reporter.log("hi hello");
	
}
}
