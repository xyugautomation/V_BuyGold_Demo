package Com.LoginPageTest;

import org.testng.annotations.Test;

import com.LoginModulePage.LoginPage;

import Com.BaseModule.launchbrowser;

public class LoginPageTest extends launchbrowser {

	@Test(priority = 0)
	public void validatalogout() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.loginpagewebelement(driver);

		LP.logout(driver);

	}

}
