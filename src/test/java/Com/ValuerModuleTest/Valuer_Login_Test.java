package Com.ValuerModuleTest;

import org.testng.annotations.Test;

import com.ValuerModule.Valuer_Login;

import Com.BaseModule.LaunchBrowserValuer;

public class Valuer_Login_Test extends LaunchBrowserValuer {

	@Test
	public void VerifyLoginWithValidateData() throws InterruptedException {

		Valuer_Login valuerlogin = new Valuer_Login(driver);
		valuerlogin.valuerMobileNumber(driver);

	}
 
}
