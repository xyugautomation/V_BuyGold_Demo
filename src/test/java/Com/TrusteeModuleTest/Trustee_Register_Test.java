package Com.TrusteeModuleTest;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.TrusteeModule.TrusteeRegister;

import Com.BaseModule.launchbrowser;

public class Trustee_Register_Test extends launchbrowser {

	public static TrusteeRegister trusteepage;

	@Test(enabled = false)
	public void verifyTrusteeRegister() throws InterruptedException, AWTException {

		trusteepage = new TrusteeRegister(driver);

		trusteepage.TrusteeSelect();

		TrusteeRegister.PersonalInformation(driver);

		TrusteeRegister.Experience(driver);

		trusteepage.BankDetails(driver);

	}

	@Test(priority = 2)
	public void verifyValuerRegisterInvalidateData() throws InterruptedException, AWTException {

		trusteepage = new TrusteeRegister(driver);

		trusteepage.TrusteeSelect();

		trusteepage.personalinformationinvalid(driver);

		trusteepage.PersonalInformation(driver);

		// trusteepage.ExperienceinvalidateData(driver);

		// valuerpage.ulopadpersonalindentiydocument(driver);

	}

}
