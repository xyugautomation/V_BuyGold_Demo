package Com.TrusteeModuleTest;

import org.testng.annotations.Test;

import com.TrusteeModule.BuyerStatus_DeliveredProducts;

import com.TrusteeModule.Trustee_Login;

import Com.BaseModule.LaunchBrowserValuer_Trustee;

public class BuyerStatus_DeliveredProductsPageTest extends LaunchBrowserValuer_Trustee {
	public static BuyerStatus_DeliveredProducts CP;
	public static Trustee_Login trusteepage;

//	 Verify that the text "Commission Earned" is displayed for products awaiting approval.
	@Test(priority = 30)
	public void VerifyCommissionEarnedDsipaly() throws InterruptedException {
//		trusteepage = new Trustee_Login(driver);
//		trusteepage.TrusteeMobileNumber(driver);
		CP = new BuyerStatus_DeliveredProducts(driver);
		CP.BuyerStatusClick();
		System.out.println("Waiting For Buyer To Collect The Gold  Text is displayed: " + CP.isCommissionEarnedTextDisplayed());

	}

//	 Verify that the previous and next buttons are displayed for navigating between pages of products.
	@Test(priority = 31)
	public void Verifypreviousandnextbuttons() throws InterruptedException {
		CP = new BuyerStatus_DeliveredProducts(driver);
		System.out.println("Previous And Next is displayed: " + CP.isPreviousAndNextDisplayed());

	}

//	 Verify that all expected text elements are displayed on the pending products page.
	@Test(priority = 32)
	public void AllTextDisplay() throws InterruptedException {
		CP = new BuyerStatus_DeliveredProducts(driver);
		System.out.println("Table Text is displayed: " + CP.isTableTextDisplayed());

	}

//	 Verify that products are displayed in the pending products module.
	@Test(priority = 33)
	public void NoProductDisplay() throws InterruptedException {

		CP = new BuyerStatus_DeliveredProducts(driver);
		System.out.println("No Product is displayed: " + CP.isNoDataFoundDisplayed());

	}

}
