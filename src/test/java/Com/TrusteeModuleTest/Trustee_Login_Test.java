package Com.TrusteeModuleTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TrusteeModule.Trustee_Login;
import com.ValuerModule.Valuer_Login;
import com.utilityModule.ReportManager;

import Com.BaseModule.LaunchBrowserValuer_Trustee;

public class Trustee_Login_Test extends LaunchBrowserValuer_Trustee {

	public Trustee_Login TLoginPage;

	@Test(priority = 1)
	public void VerifyLoginWithYourPhoneNumberDisplay() throws InterruptedException {

		TLoginPage = new Trustee_Login(driver);

		Valuer_Login VLoginPage = new Valuer_Login(driver);
		boolean isLogoDisplayed = VLoginPage.isPhoneNumberText();
		if (isLogoDisplayed) {
			System.out.println("Login with your phone number is displayed on the page.");
		} else {
			System.out.println("Login with your phone number is not displayed on the page.");
		}
		Assert.assertTrue(isLogoDisplayed, "Login with your phone number is not displayed on the page.");
	}

//	Verify that the system handles empty username/email  fields appropriately.
	@Test(priority = 2)
	public void VerifyEmptyMobileNumberFields() throws InterruptedException {

		TLoginPage = new Trustee_Login(driver);
		TLoginPage.EmptyMobileNumber();

	}

//	Verify that a user cannot log in with invalid credentials.
	@Test(priority = 3)
	public void VerifyLoginWithInvalidCredentials() throws InterruptedException {
		TLoginPage = new Trustee_Login(driver);
		TLoginPage.testInvalidLogin();

	}

//	Verify that a log is display.
	@Test(priority = 4)
	public void testLogoDisplay() throws InterruptedException {
		TLoginPage = new Trustee_Login(driver);
		boolean isLogoDisplayed = TLoginPage.isLogoDisplayed();
		if (isLogoDisplayed) {
			System.out.println("Logo is displayed on the page.");
		} else {
			System.out.println("Logo is not displayed on the page.");
		}
		Assert.assertTrue(isLogoDisplayed, "Logo is not displayed on the page.");
	}

//Verify that the "Continue" button is clickable on the login page.	
	@Test(priority = 5)
	public void testButtonClickability() throws InterruptedException {
		TLoginPage = new Trustee_Login(driver);
		boolean isButtonClickable = TLoginPage.isButtonClickable();
		if (isButtonClickable) {
			System.out.println("Button is clickable.");
		} else {
			System.out.println("Button is not clickable.");
		}
		Assert.assertTrue(isButtonClickable, "Button is not clickable.");
	}

	
	@Test(priority = 6)
	public void VerifyLoginWithValidateData() throws InterruptedException {
		ReportManager.initialize();

		ReportManager.createTest("Login Test").info("Starting login test");
		Trustee_Login Trusteelogin = new Trustee_Login(driver);
		Trusteelogin.TrusteeMobileNumber(driver);

	}

}
