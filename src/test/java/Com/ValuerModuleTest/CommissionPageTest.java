package Com.ValuerModuleTest;

import org.testng.annotations.Test;

import com.ValuerModule.CommissionPage;
import com.ValuerModule.Valuer_Login;

import Com.BaseModule.LaunchBrowserValuer;

public class CommissionPageTest extends LaunchBrowserValuer {

	public static CommissionPage CP;

//	 Verify that the text "Commission Earned" is displayed for products awaiting approval.
	@Test(priority = 45)
	public void VerifyCommissionEarnedDsipaly() throws InterruptedException {
//		Valuer_Login loginPage = new Valuer_Login(driver);
//		loginPage.ValuerLoginWithMobileNumber(driver);
		CP = new CommissionPage(driver);
		CP.commissionmosidemenu();
		System.out.println("Commission Earned Text is displayed: " + CP.isCommissionEarnedTextDisplayed());

	}
	
	
	

//	 Verify that the previous and next buttons are displayed for navigating between pages of products.
	@Test(priority = 46)
	public void Verifypreviousandnextbuttons() throws InterruptedException {
		CP = new CommissionPage(driver);
		System.out.println("Previous And Next is displayed: " + CP.isPreviousAndNextDisplayed());

	}

//	 Verify that all expected text elements are displayed on the pending products page.
	@Test(priority = 47)
	public void AllTextDisplay() throws InterruptedException {
		CP = new CommissionPage(driver);
		System.out.println("Table Text is displayed: " + CP.isTableTextDisplayed());

	}

//	 Verify that products are displayed in the pending products module.
	@Test(priority = 48)
	public void NoProductDisplay() throws InterruptedException {

		CP = new CommissionPage(driver);
		System.out.println("No Product is displayed: " + CP.isNoDataFoundDisplayed());

	}

}
