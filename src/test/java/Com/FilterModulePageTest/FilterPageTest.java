package Com.FilterModulePageTest;

import org.testng.annotations.Test;

import com.FilterModulePage.filterPage;
import com.LoginModulePage.LoginPage;

import Com.BaseModule.launchbrowser;

public class FilterPageTest extends launchbrowser {

	@Test(priority = 1)
	public void VerifyFilter() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.loginpagewebelement(driver);
		filterPage FP = new filterPage(driver);
		FP.Filterss(driver);
	}
}
