package testNg_assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class equal_1 {
    @Test
    public void TC () {
    	Reporter.log("test case is running" , true);
    	String expR ="pp";
    	String actR ="pp";
    	Assert.assertEquals(expR, actR);
    	
    }

}
