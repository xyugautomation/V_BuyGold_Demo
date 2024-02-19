package LoginPageTestmodel;


import org.testng.annotations.Test;

import Base.launchbrowser;
import LoginModule.LoginPage;

public class LoginPageTest extends launchbrowser {

	@Test(priority = 1)
	public void validatalogout() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.loginpagewebelement(driver);

		LP.logout(driver);

	}
}
