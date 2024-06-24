package Com.TrusteeModuleTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.TrusteeModule.DashboardPage;
import com.TrusteeModule.Trustee_Login;

import Com.BaseModule.LaunchBrowserValuer_Trustee;

public class DashboardPageTest extends LaunchBrowserValuer_Trustee {

	DashboardPage dashboardPage;
	Trustee_Login trusteepage;

	@Test(priority = 1)
	public void testPageLoad() throws InterruptedException {
		trusteepage = new Trustee_Login(driver);

		trusteepage.TrusteeMobileNumber(driver);

		dashboardPage = new DashboardPage(driver);

		String pageTitle = dashboardPage.getTitle();
		assertTrue(pageTitle.contains("V-buy Gold Trustee"), "Page load test failed.");
		System.out.println("Page Title: " + pageTitle);
	}

	@Test(priority = 2)
	public void testInitialStateOverviewTiles() throws InterruptedException {
		dashboardPage = new DashboardPage(driver);

		assertEquals(dashboardPage.getWaitingForSellerProductApproval(), "Waiting for seller product approval");
		assertEquals(dashboardPage.getApprovedProductsWaitingForSeller(),
				"Approved products, Waiting for seller for deposit the gold");
		assertEquals(dashboardPage.getWaitingForBuyerToCollectProduct(),
				"Waiting for Buyer's to collect product and deposit money by Buyer");
		assertEquals(dashboardPage.getSellerToCollectMoney(), "Seller to collect money");
		assertEquals(dashboardPage.getSuccessfullyDeliveredProducts(), "Successfully delivered products");
		assertEquals(dashboardPage.getMoneyHolding(), "Money holding");
		assertEquals(dashboardPage.getEarnedCommissions(), "Earned Commissions");
		System.out
				.println("Waiting for Seller Product Approval: " + dashboardPage.getWaitingForSellerProductApproval());

		System.out.println(
				"Approved Products Waiting for Seller: " + dashboardPage.getApprovedProductsWaitingForSeller());
		System.out
				.println("Waiting for Buyer to Collect Product: " + dashboardPage.getWaitingForBuyerToCollectProduct());
		System.out.println("Seller to Collect Money: " + dashboardPage.getSellerToCollectMoney());
		System.out.println("Successfully Delivered Products: " + dashboardPage.getSuccessfullyDeliveredProducts());
		System.out.println("Money Holding: " + dashboardPage.getMoneyHolding());
		System.out.println("Earned Commissions: " + dashboardPage.getEarnedCommissions());

	}

	@Test(priority = 3)
	public void testLiveGoldPricesDisplay() throws InterruptedException {

		dashboardPage = new DashboardPage(driver);

		assertTrue(dashboardPage.isLivePrice24kDisplayed(), "24K gold price is not displayed");
		assertTrue(dashboardPage.isLivePrice22kDisplayed(), "22K gold price is not displayed");

		System.out.println("24K Gold Price Displayed: " + dashboardPage.isLivePrice24kDisplayed());
		System.out.println("22K Gold Price Displayed: " + dashboardPage.isLivePrice22kDisplayed());

	}

	@Test(priority = 4)
	public void testTilesClickable() throws InterruptedException {
//			 trusteepage =new Trustee_Login (driver);
//			   
//			    trusteepage.TrusteeMobileNumber(driver);
		dashboardPage = new DashboardPage(driver);

		assertTrue(dashboardPage.isWaitingForSellerProductApprovalClickable(),
				"Waiting for seller product approval tile is not clickable");
		assertTrue(dashboardPage.isApprovedProductsWaitingForSellerClickable(),
				"Approved products, Waiting for seller for deposit the gold tile is not clickable");
		assertTrue(dashboardPage.isWaitingForBuyerToCollectProductClickable(),
				"Waiting for Buyer's to collect product and deposit money by Buyer tile is not clickable");
		assertTrue(dashboardPage.isSellerToCollectMoneyClickable(), "Seller to collect money tile is not clickable");
		assertTrue(dashboardPage.isSuccessfullyDeliveredProductsClickable(),
				"Successfully delivered products tile is not clickable");
		assertTrue(dashboardPage.isMoneyHoldingClickable(), "Money holding tile is not clickable");
		assertTrue(dashboardPage.isEarnedCommissionsClickable(), "Earned Commissions tile is not clickable");

		System.out.println("Waiting for Seller Product Approval Clickable: "
				+ dashboardPage.isWaitingForSellerProductApprovalClickable());
		System.out.println("Approved Products Waiting for Seller Clickable: "
				+ dashboardPage.isApprovedProductsWaitingForSellerClickable());
		System.out.println("Waiting for Buyer to Collect Product Clickable: "
				+ dashboardPage.isWaitingForBuyerToCollectProductClickable());
		System.out.println("Seller to Collect Money Clickable: " + dashboardPage.isSellerToCollectMoneyClickable());
		System.out.println("Successfully Delivered Products Clickable: "
				+ dashboardPage.isSuccessfullyDeliveredProductsClickable());

		System.out.println("Earned Commissions Clickable: " + dashboardPage.isEarnedCommissionsClickable());
	}

	// Test to verify and display whether Dashboard products are clickable on the
	// dashboard
	@Test(priority = 12)

	public void verifyDashboardProductClickable() throws InterruptedException {
		trusteepage = new Trustee_Login(driver);
		//
		trusteepage.TrusteeMobileNumber(driver);

		DashboardPage dashboardPage = new DashboardPage(driver);

		boolean clickable = dashboardPage.isDashboardButtonClickable(driver);
		System.out.println("Dashboard products are clickable: " + clickable);

		dashboardPage.getDashboardButton().click(); // Ensure this method exists to return the button
		System.out.println("Clicked on Dashboard products");
	}

	// Test to verify and display whether Dashboard products are clickable on the
	// dashboard
	@Test(priority = 13)
	public void verifyissideMenuSellerApprovalPendingButtonClickableClickable() throws InterruptedException {
		dashboardPage = new DashboardPage(driver);
		boolean clickable = dashboardPage.issideMenuSellerApprovalPendingButtonClickable(driver);
		System.out.println("Dashboard products are clickable: " + clickable);
		System.out.println("Clicked on Dashboard products");

	}

	// Test to verify and display whether Dashboard products are clickable on the
	// dashboard
	@Test(priority = 14)
	public void issideMenuSellerPendingGoldDepositsButtonClickable() throws InterruptedException {
		dashboardPage = new DashboardPage(driver);
		boolean clickable = dashboardPage.issideMenuSellerPendingGoldDepositsButtonClickable(driver);
		System.out.println("Dashboard products are clickable: " + clickable);
		System.out.println("Clicked on Dashboard products");

	}

	// Test to verify and display whether Dashboard products are clickable on the
	// dashboard
	@Test(priority = 15)
	public void issideMenuSellerPayoutsButtonClickable() throws InterruptedException {
		dashboardPage = new DashboardPage(driver);
		boolean clickable = dashboardPage.issideMenuSellerPayoutsButtonClickable(driver);
		System.out.println("Dashboard products are clickable: " + clickable);
		System.out.println("Clicked on Dashboard products");

	}

	// Test to verify and display whether Dashboard products are clickable on the
	// dashboard
	@Test(priority = 16)
	public void issideMenuBuyerStatusButtonClickable() throws InterruptedException {
		dashboardPage = new DashboardPage(driver);
		boolean clickable = dashboardPage.issideMenuBuyerStatusButtonClickable(driver);
		System.out.println("Dashboard products are clickable: " + clickable);
		System.out.println("Clicked on Dashboard products");

	}

	// Test to verify and display whether Dashboard products are clickable on the
	// dashboard
	@Test(priority = 17)
	public void issideMenuBuyerStatusPendingPickupAndDepositButtonClickable() throws InterruptedException {
		dashboardPage = new DashboardPage(driver);
		boolean clickable = dashboardPage.issideMenuBuyerStatusPendingPickupAndDepositButtonClickable(driver);
		System.out.println("Dashboard products are clickable: " + clickable);
		System.out.println("Clicked on Dashboard products");

	}

	// Test to verify and display whether Dashboard products are clickable on the
	// dashboard
	@Test(priority = 18)
	public void issideMenuBuyerStatusDeleveredProductsClickable() throws InterruptedException {
		dashboardPage = new DashboardPage(driver);
		boolean clickable = dashboardPage.issideMenuBuyerStatusDeleveredProductsClickable(driver);
		System.out.println("Dashboard products are clickable: " + clickable);
		System.out.println("Clicked on Dashboard products");

	}

	// Test to verify and display whether Dashboard products are clickable on the
	// dashboard
	@Test(priority = 19)
	public void issideMenuRaiseTicketButtonClickable1() throws InterruptedException {
		dashboardPage = new DashboardPage(driver);
		boolean clickable = dashboardPage.issideMenuRaiseTicketButtonClickable1(driver);
		System.out.println("Dashboard products are clickable: " + clickable);
		System.out.println("Clicked on Dashboard products");

	}

	// Test to verify and display whether Dashboard products are clickable on the
	// dashboard
	@Test(priority = 20)
	public void issideMenuTicketStatusButtonClickable2() throws InterruptedException {
		dashboardPage = new DashboardPage(driver);
		boolean clickable = dashboardPage.issideMenuTicketStatusButtonClickable2(driver);
		System.out.println("Dashboard products are clickable: " + clickable);
		System.out.println("Clicked on Dashboard products");

	}

}
