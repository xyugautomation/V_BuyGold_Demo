package Com.LoginPageTest;
import org.testng.annotations.Test;

import com.LoginModulePage.LoginPage;

import Com.BaseModule.launchbrowser;
public class LoginPageNegative extends launchbrowser {
	@Test
	public void Invalidata() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);

		LP.invalidatedata(driver);

	}
}
