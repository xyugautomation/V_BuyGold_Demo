package Com.TrusteeModuleTest;

import org.testng.annotations.Test;

import com.TrusteeModule.Trustee_Login;

import Com.BaseModule.LaunchBrowserValuer_Trustee;



public class Trustee_Login_Test extends LaunchBrowserValuer_Trustee {
	@Test
	public void VerifyLoginWithValidateData() throws InterruptedException {

		Trustee_Login Trusteelogin = new Trustee_Login(driver);
		Trusteelogin.TrusteeMobileNumber(driver);

	}

}
