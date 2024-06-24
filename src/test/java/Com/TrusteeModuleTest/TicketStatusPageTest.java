package Com.TrusteeModuleTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.TrusteeModule.Trustee_Login;
import com.ValuerModule.TicketStatusPage;
import Com.BaseModule.LaunchBrowserValuer_Trustee;

public class TicketStatusPageTest extends LaunchBrowserValuer_Trustee {

	public static Trustee_Login trusteepage;
	public TicketStatusPage TPage;

	@Test(priority = 39)
	public void testNoDataFoundVisibility() throws InterruptedException {
//		trusteepage = new Trustee_Login(driver);
//
//		trusteepage.TrusteeMobileNumber(driver);
		TPage = new TicketStatusPage(driver);
		TPage.ticketstatusbuttonside();
		boolean isNoDataFoundDisplayed = TPage.isNoDataFoundDisplayed();
		System.out.println("No Data Found is displayed: " + isNoDataFoundDisplayed);
		Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found should be displayed");
	}

	@Test(priority = 40)
	public void testTableTextVisibility() throws InterruptedException {
		boolean isTableTextDisplayed = TPage.isTableTextDisplayed();
		System.out.println("Table Text is displayed: " + isTableTextDisplayed);
		Assert.assertTrue(isTableTextDisplayed, "Table Text should be displayed");
	}

	@Test(priority = 41)
	public void testRaisedTicketsTextVisibility() throws InterruptedException {
		boolean isRaisedTicketsTextDisplayed = TPage.isRaisedTicketsTextDisplayed();
		System.out.println("Raised Tickets Text is displayed: " + isRaisedTicketsTextDisplayed);
		Assert.assertTrue(isRaisedTicketsTextDisplayed, "Raised Tickets Text should be displayed");
	}

	@Test(priority = 42)
	public void testPreviousAndNextVisibility() throws InterruptedException {
		boolean isPreviousAndNextDisplayed = TPage.isPreviousAndNextDisplayed();
		System.out.println("Previous And Next is displayed: " + isPreviousAndNextDisplayed);
		Assert.assertTrue(isPreviousAndNextDisplayed, "Previous And Next should be displayed");
	}

	@Test(priority = 43)
	public void testSearchButtonVisibility() throws InterruptedException {
		boolean isSearchButtonDisplayed = TPage.isSearchButtonDisplayed();
		System.out.println("Search Button is displayed: " + isSearchButtonDisplayed);
		Assert.assertTrue(isSearchButtonDisplayed, "Search Button should be displayed");
	}

}
