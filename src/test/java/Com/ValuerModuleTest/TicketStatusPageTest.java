package Com.ValuerModuleTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ValuerModule.TicketStatusPage;
import com.ValuerModule.Valuer_Login;

import Com.BaseModule.LaunchBrowserValuer;

public class TicketStatusPageTest extends LaunchBrowserValuer {

//	 Verify that the text "Raised Tickets" is displayed for products awaiting approval.
//	 Verify that products are displayed in the pending products module.
//	 Verify that the text "Raised Tickets" is displayed for products awaiting approval.
//	  Verify that the back button returns to the previous page/module.
//	 Verify that the previous and next buttons are displayed for navigating between pages of products.
//	 Verify that all expected text elements are displayed on the pending products page.
//	 Verify that the search button is displayed on the pending products page.
//	 Verify that the search button works correctly and filters products based on the search query
//	

	public TicketStatusPage TPage;
	public Valuer_Login loginPage;

	@Test(priority = 40)
	public void testNoDataFoundVisibility() throws InterruptedException {
//		loginPage = new Valuer_Login(driver);
//		loginPage.ValuerLoginWithMobileNumber(driver);
		TPage = new TicketStatusPage(driver);
		TPage.ticketstatusbuttonside();
		boolean isNoDataFoundDisplayed = TPage.isNoDataFoundDisplayed();
		System.out.println("No Data Found is displayed: " + isNoDataFoundDisplayed);
		Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found should be displayed");
	}

	@Test(priority = 41)
	public void testTableTextVisibility() throws InterruptedException {
		boolean isTableTextDisplayed = TPage.isTableTextDisplayed();
		System.out.println("Table Text is displayed: " + isTableTextDisplayed);
		Assert.assertTrue(isTableTextDisplayed, "Table Text should be displayed");
	}

	@Test(priority = 42)
	public void testRaisedTicketsTextVisibility() throws InterruptedException {
		boolean isRaisedTicketsTextDisplayed = TPage.isRaisedTicketsTextDisplayed();
		System.out.println("Raised Tickets Text is displayed: " + isRaisedTicketsTextDisplayed);
		Assert.assertTrue(isRaisedTicketsTextDisplayed, "Raised Tickets Text should be displayed");
	}

	@Test(priority = 43)
	public void testPreviousAndNextVisibility() throws InterruptedException {
		boolean isPreviousAndNextDisplayed = TPage.isPreviousAndNextDisplayed();
		System.out.println("Previous And Next is displayed: " + isPreviousAndNextDisplayed);
		Assert.assertTrue(isPreviousAndNextDisplayed, "Previous And Next should be displayed");
	}

	@Test(priority = 44)
	public void testSearchButtonVisibility() throws InterruptedException {
		boolean isSearchButtonDisplayed = TPage.isSearchButtonDisplayed();
		System.out.println("Search Button is displayed: " + isSearchButtonDisplayed);
		Assert.assertTrue(isSearchButtonDisplayed, "Search Button should be displayed");
	}

}
