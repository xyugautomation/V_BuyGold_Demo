package Com.ValuerModuleTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ValuerModule.Valuer_Login;

import Com.BaseModule.LaunchBrowserValuer;

public class Valuer_Login_PageTest extends LaunchBrowserValuer {

	public static Valuer_Login VLoginPage;

//Verify that the text "Login with your phone number" is displayed on the login page.

	@Test(priority = 1)
	public void VerifyLoginWithYourPhoneNumberDisplay() throws InterruptedException {

		VLoginPage = new Valuer_Login(driver);

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

		VLoginPage = new Valuer_Login(driver);
		VLoginPage.EmptyMobileNumber();

	}

//	Verify that a user cannot log in with invalid credentials.
	@Test(priority = 3)
	public void VerifyLoginWithInvalidCredentials() throws InterruptedException {
		VLoginPage = new Valuer_Login(driver);
		VLoginPage.testInvalidLogin();

	}

//	Verify that a log is display.
	@Test(priority = 4)
	public void testLogoDisplay() throws InterruptedException {
		Valuer_Login VLoginPage = new Valuer_Login(driver);
		boolean isLogoDisplayed = VLoginPage.isLogoDisplayed();
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
		Valuer_Login VLoginPage = new Valuer_Login(driver);
		boolean isButtonClickable = VLoginPage.isButtonClickable();
		if (isButtonClickable) {
			System.out.println("Button is clickable.");
		} else {
			System.out.println("Button is not clickable.");
		}
		Assert.assertTrue(isButtonClickable, "Button is not clickable.");
	}

//	Verify that a user can log in successfully with valid credentials.
	@Test(priority = 6)
	public void VerifyLoginWithValidateData() throws InterruptedException {

		Valuer_Login valuerlogin = new Valuer_Login(driver);
		valuerlogin.valuerMobileNumber(driver);

	}

}
