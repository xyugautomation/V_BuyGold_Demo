package Com.HomePageTest;

import org.testng.annotations.Test;

import com.HomePage.homePage;

import Com.BaseModule.launchbrowser;

public class HomePageTest extends launchbrowser {
	public static launchbrowser setup;
	public static homePage HPage;

	// validate display on the web page ( SellNowButton , Reset
	// ,Notification_button, login_sign_button )
	@Test(priority = 1)
	public void validateWebElementPresentinthepage() {

		// Pass the WebDriver instance to homePage constructor
		homePage HPage = new homePage(driver);
		HPage.yourTestMethod();

	}

	// validate check navbar name is display or not
	@Test(priority = 2)
	public void ValidateNavBarDisplay() {

		homePage HPage = new homePage(driver);

		HPage.navBar();

	}
//
////	@Test(priority = 3)
////	public void validatewebelementisclickableornot() {
////		homePage HPage = new homePage(driver);
////	}
//
//	@Test(priority = 4)
//	public void validateNavBarclickableornot() {
//		homePage HPage = new homePage(driver);
//		
//		HPage.navBarClickable();		
//		
//	}

	@Test(priority = 3)
	public void validateSellNowButtonDetails() {

		homePage HPage = new homePage(driver);
		HPage.sellbuttondetails();

	}

	@Test(priority = 4)
	public void validateReset_buttonDeatils() {

		homePage HPage = new homePage(driver);
		HPage.Reset_buttonDeatils();

	}

	@Test(priority = 5)
	public void validateNotification_buttonDeatils() {

		homePage HPage = new homePage(driver);
		HPage.Notification_buttonDeatils();

	}

}
