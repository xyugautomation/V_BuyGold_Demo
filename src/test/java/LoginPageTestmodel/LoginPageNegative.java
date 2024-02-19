package LoginPageTestmodel;
import org.testng.annotations.Test;

import Base.launchbrowser;
import LoginModule.LoginPage;
public class LoginPageNegative extends launchbrowser {
	@Test(priority = 1)
	public void Invalidata() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);

		LP.invalidatedata();

	}
}
