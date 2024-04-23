package Com.TrusteeModuleTest;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.TrusteeModule.TrusteeRegister;

import Com.BaseModule.LaunchBrowserValuer_Trustee;

public class Trustee_Register_Test extends LaunchBrowserValuer_Trustee {

	public static TrusteeRegister trusteepage;

	@Test
	public void verifyTrusteeRegister() throws InterruptedException, AWTException {

		trusteepage = new TrusteeRegister(driver);

		trusteepage.TrusteeSelect();

		trusteepage.PersonalInformation(driver);

		trusteepage.Experience(driver);

		trusteepage.BankDetails(driver);

	}

}
