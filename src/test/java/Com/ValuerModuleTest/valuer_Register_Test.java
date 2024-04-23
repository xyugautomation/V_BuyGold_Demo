package Com.ValuerModuleTest;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ValuerModule.ValuerRegister;

import Com.BaseModule.launchbrowser;

public class valuer_Register_Test extends launchbrowser {

	public static ValuerRegister valuerpage;

	@Test(priority = 1)
	public void VerifyValuerRegister() throws InterruptedException, AWTException {

		valuerpage = new ValuerRegister(driver);

		valuerpage.ValuerSelect();

		valuerpage.PersonalInformation(driver);

		valuerpage.Experience(driver);

		valuerpage.BankDetails(driver);

		valuerpage.ulopadpersonalindentiydocument(driver);

		valuerpage.OnBoardingDashBoard(driver);

		valuerpage.valuerMobileNumber(driver);

	}

	@Test(priority = 2)
	public void verifyValuerRegisterInvalidateData() throws InterruptedException, AWTException {

		valuerpage = new ValuerRegister(driver);

		valuerpage.ValuerSelect();

		valuerpage.personalinformationinvalid(driver);

		valuerpage.PersonalInformation(driver);

		valuerpage.ExperienceinvalidateData(driver);

		// valuerpage.ulopadpersonalindentiydocument(driver);

	}

}
