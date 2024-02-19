package FilterModuleTest;


import org.testng.annotations.Test;

import Base.launchbrowser;
import FilterModule.filterPage;
import LoginModule.LoginPage;

public class FilterPageTest extends launchbrowser {
	@Test
	public void Filter() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.loginpagewebelement(driver);
		filterPage FP = new filterPage(driver);
		FP.Filterss();

	}

}
