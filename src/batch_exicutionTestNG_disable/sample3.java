package batch_exicutionTestNG_disable;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample3 {
	@Test
	public void TC7() {
		Reporter.log("running tc7", true);
	}
		@Test
		public void TC8() {
			Reporter.log("running TC 8",true);
		}
		@Test
		public void TC9() {
			Reporter.log("running TC 9", true);
		}

}
