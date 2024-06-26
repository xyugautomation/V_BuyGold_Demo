package Com.TrusteeModuleTest;

import org.testng.annotations.Test;

import com.TrusteeModule.Trustee_Login;
import com.ValuerModule.CommissionPage;

import Com.BaseModule.LaunchBrowserValuer_Trustee;

public class CommissionPageTest extends LaunchBrowserValuer_Trustee {
	public static CommissionPage CP;
	public static Trustee_Login trusteepage;

//	 Verify that the text "Commission Earned" is displayed for products awaiting approval.
	@Test(priority = 44)
	public void VerifyCommissionEarnedDsipaly() throws InterruptedException {
//		trusteepage = new Trustee_Login(driver);
//		trusteepage.TrusteeMobileNumber(driver);
		CP = new CommissionPage(driver);
		CP.commissionmosidemenu();
		System.out.println("Commission Earned Text is displayed: " + CP.isCommissionEarnedTextDisplayed());

	}

//	 Verify that the previous and next buttons are displayed for navigating between pages of products.
	@Test(priority = 45)
	public void Verifypreviousandnextbuttons() throws InterruptedException {
		CP = new CommissionPage(driver);
		System.out.println("Previous And Next is displayed: " + CP.isPreviousAndNextDisplayed());

	}

//	 Verify that all expected text elements are displayed on the pending products page.
	@Test(priority = 46)
	public void AllTextDisplay() throws InterruptedException {
		CP = new CommissionPage(driver);
		System.out.println("Table Text is displayed: " + CP.isTableTextDisplayed());

	}

//	 Verify that products are displayed in the pending products module.
	@Test(priority = 47)
	public void NoProductDisplay() throws InterruptedException {

		CP = new CommissionPage(driver);
		System.out.println("No Product is displayed: " + CP.isNoDataFoundDisplayed());

	}
}
