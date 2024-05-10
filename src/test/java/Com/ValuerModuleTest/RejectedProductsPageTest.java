package Com.ValuerModuleTest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ValuerModule.RejectedProductsPage;
import com.ValuerModule.Valuer_Login;

import Com.BaseModule.LaunchBrowserValuer;

public class RejectedProductsPageTest extends LaunchBrowserValuer {
	public static RejectedProductsPage RPage;

	@Test(priority = 29)
	public void testTableTextVisibility() throws InterruptedException {
//		Valuer_Login loginPage = new Valuer_Login(driver);
//		loginPage.ValuerLoginWithMobileNumber(driver);

		RPage = new RejectedProductsPage(driver);
		RPage.sidemenuRejectProduct();
		boolean isTableTextDisplayed = RPage.isTableTextDisplayed();
		System.out.println("Table Text is displayed: " + isTableTextDisplayed);
		Assert.assertTrue(isTableTextDisplayed, "Table Text should be displayed");
	}

	@Test(priority = 30)
	public void testNoProductFoundVisibility() throws InterruptedException {
		RPage = new RejectedProductsPage(driver);
		boolean isNoProductFoundDisplayed = RPage.isNoProductFoundDisplayed();
		System.out.println("No Product Found is displayed: " + isNoProductFoundDisplayed);
		Assert.assertTrue(isNoProductFoundDisplayed, "No Product Found should be displayed");
	}
//		 Verify that the previous and next buttons are displayed.

	@Test(priority = 31)
	public void testPreviousAndNextVisibility() throws InterruptedException {
		RPage = new RejectedProductsPage(driver);
		boolean isPreviousAndNextDisplayed = RPage.isPreviousAndNextDisplayed();
		System.out.println("Previous And Next is displayed: " + isPreviousAndNextDisplayed);
		Assert.assertTrue(isPreviousAndNextDisplayed, "Previous And Next should be displayed");
	}

//		 Verify that the text "Till Now Rejected Products" is displayed for products awaiting approval.
	@Test(priority = 32)
	public void testTillNowRejectedProductsTextVisibility() throws InterruptedException {
		RPage = new RejectedProductsPage(driver);
		boolean isTillNowRejectedProductsTextDisplayed = RPage.isTillNowRejectedProductsTextDisplayed();
		System.out.println("Till Now Rejected Products Text is displayed: " + isTillNowRejectedProductsTextDisplayed);
		Assert.assertTrue(isTillNowRejectedProductsTextDisplayed,
				"Till Now Rejected Products Text should be displayed");
	}

	// Verify that the "search button" is displayed for Rejected products.
	@Test(priority = 33)
	public void testSerchButtonVisibility() throws InterruptedException {
		RPage = new RejectedProductsPage(driver);
		boolean isSearchButton = RPage.isSearchButtonDisplayed();
		System.out.println("Search Button is displayed: " + isSearchButton);
		Assert.assertTrue(isSearchButton, "Search Button should be displayed");
	}

//		 Verify that the search button works correctly and filters products based on the search query
	@Test(priority = 34)
	public void testsearchButtonEnterData() throws InterruptedException {

		RPage = new RejectedProductsPage(driver);
		WebElement isSearchButton = RPage.searchbuttonenterData();
		System.out.println("Enter Data: " + isSearchButton);

	}

}
