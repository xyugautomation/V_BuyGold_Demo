package Com.AdminModule;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.AdminModule.DashboardPage;
import com.AdminModule.LoginPage;
import Com.BaseModule.LaunchBrowserAdmin;

public class AdminDashBoardPageTest extends LaunchBrowserAdmin

{

	private DashboardPage adminDashBoard;
	private LoginPage loginPage;

	@Test(priority = 1)
	public void testDashboardText() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.LoginMethod();
		adminDashBoard = new DashboardPage(driver);
		try {
			Assert.assertEquals(adminDashBoard.getDashboardText(), "Dashboard");
			System.out.println("Dashboard Text: PASSED");
		} catch (AssertionError e) {
			System.out.println("Dashboard Text: FAILED - Expected 'Dashboard' but found '"
					+ adminDashBoard.getDashboardText() + "'");
			throw e;
		}
	}

	@Test(priority = 2)
	public void testValuerListText() throws InterruptedException {
		try {
			Assert.assertEquals(adminDashBoard.getValuerListText(), "Valuer List");
			System.out.println("Valuer List Text: PASSED");
		} catch (AssertionError e) {
			System.out.println("Valuer List Text: FAILED - Expected 'Valuer List' but found '"
					+ adminDashBoard.getValuerListText() + "'");
			throw e;
		}
	}

	@Test(priority = 3)
	public void testTrusteeListText() throws InterruptedException {
		try {
			Assert.assertEquals(adminDashBoard.getTrusteeListText(), "Trustee List");
			System.out.println("Trustee List Text: PASSED");
		} catch (AssertionError e) {
			System.out.println("Trustee List Text: FAILED - Expected 'Trustee List' but found '"
					+ adminDashBoard.getTrusteeListText() + "'");
			throw e;
		}
	}

	@Test(priority = 4)
	public void testMoneyHoldingText() throws InterruptedException {
		try {
			Assert.assertEquals(adminDashBoard.getMoneyHoldingText(), "Money Holding");
			System.out.println("Money Holding Text: PASSED");
		} catch (AssertionError e) {
			System.out.println("Money Holding Text: FAILED - Expected 'Money Holding' but found '"
					+ adminDashBoard.getMoneyHoldingText() + "'");
			throw e;
		}
	}

	@Test(priority = 5)
	public void testTicketsListText() throws InterruptedException {

		try {
			Assert.assertEquals(adminDashBoard.getTicketsListText(), "Tickets List");
			System.out.println("Tickets List Text: PASSED");
		} catch (AssertionError e) {
			System.out.println("Tickets List Text: FAILED - Expected 'Tickets List' but found '"
					+ adminDashBoard.getTicketsListText() + "'");
			throw e;
		}
	}

	@Test(priority = 6)
	public void testCommissionText() throws InterruptedException {
		try {
			Assert.assertEquals(adminDashBoard.getCommissionText(), "Commission");
			System.out.println("Commission Text: PASSED");
		} catch (AssertionError e) {
			System.out.println("Commission Text: FAILED - Expected 'Commission' but found '"
					+ adminDashBoard.getCommissionText() + "'");
			throw e;
		}
	}

	@Test(priority = 7)
	public void testTotalValuerListText() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.LoginMethod();
		adminDashBoard = new DashboardPage(driver);
		try {
			Assert.assertEquals(adminDashBoard.getTotalValuerListText(), "Dashboard");
			System.out.println("Dashboard Text: PASSED");
		} catch (AssertionError e) {
			System.out.println("Dashboard Text: FAILED - Expected 'Dashboard' but found '"
					+ adminDashBoard.getTotalValuerListText() + "'");
			throw e;
		}
	}

	@Test(priority = 8)
	public void testTotalTrusteeListText() throws InterruptedException {
		try {
			Assert.assertEquals(adminDashBoard.getTotalTrusteeListText(), "Valuer List");
			System.out.println("Valuer List Text: PASSED");
		} catch (AssertionError e) {
			System.out.println("Valuer List Text: FAILED - Expected 'Valuer List' but found '"
					+ adminDashBoard.getTotalTrusteeListText() + "'");
			throw e;
		}
	}

	@Test(priority = 9)
	public void testTotaldminCommissionText() throws InterruptedException {
		try {
			Assert.assertEquals(adminDashBoard.getTotaldminCommissionText(), "Trustee List");
			System.out.println("Trustee List Text: PASSED");
		} catch (AssertionError e) {
			System.out.println("Trustee List Text: FAILED - Expected 'Trustee List' but found '"
					+ adminDashBoard.getTotaldminCommissionText() + "'");
			throw e;
		}
	}

	@Test(priority = 10)
	public void testTotalNumberOfTicketsText() throws InterruptedException {
		try {
			Assert.assertEquals(adminDashBoard.getTotalNumberOfTicketsText(), "Money Holding");
			System.out.println("Money Holding Text: PASSED");
		} catch (AssertionError e) {
			System.out.println("Money Holding Text: FAILED - Expected 'Money Holding' but found '"
					+ adminDashBoard.getTotalNumberOfTicketsText() + "'");
			throw e;
		}
	}

	@Test(priority = 11)
	public void testMoneHoldingText() throws InterruptedException {

		try {
			Assert.assertEquals(adminDashBoard.getMoneHoldingText(), "Tickets List");
			System.out.println("Tickets List Text: PASSED");
		} catch (AssertionError e) {
			System.out.println("Tickets List Text: FAILED - Expected 'Tickets List' but found '"
					+ adminDashBoard.getMoneHoldingText() + "'");
			throw e;
		}
	}

	@Test(priority = 12)
	public void testVluersUnpaidCommsionText() throws InterruptedException {
		try {
			Assert.assertEquals(adminDashBoard.getVluersUnpaidCommsionText(), "Commission");
			System.out.println("Commission Text: PASSED");
		} catch (AssertionError e) {
			System.out.println("Commission Text: FAILED - Expected 'Commission' but found '"
					+ adminDashBoard.getVluersUnpaidCommsionText() + "'");
			throw e;
		}
	}

//	@Test(priority = 13)
//	public void testDashboardClickable() {
//		boolean clickable = adminDashBoard.isDashboardClickable();
//		Assert.assertTrue(clickable);
//		System.out.println("Dashboard Clickable: " + clickable);
//	}
//
//	@Test(priority = 14)
//	public void testValuerListClickable() {
//		boolean clickable = adminDashBoard.isValuerListClickable();
//		Assert.assertTrue(clickable);
//		System.out.println("Valuer List Clickable: " + clickable);
//	}
//
//	@Test(priority = 15)
//	public void testTrusteeListClickable() {
//		boolean clickable = adminDashBoard.isTrusteeListClickable();
//		Assert.assertTrue(clickable);
//		System.out.println("Trustee List Clickable: " + clickable);
//	}
//
//	@Test(priority = 16)
//	public void testMoneyHoldingClickable() {
//		boolean clickable = adminDashBoard.isMoneyHoldingClickable();
//		Assert.assertTrue(clickable);
//		System.out.println("Money Holding Clickable: " + clickable);
//	}
//
//	@Test(priority = 17)
//	public void testTicketsListClickable() {
//		boolean clickable = adminDashBoard.isTicketsListClickable();
//		Assert.assertTrue(clickable);
//		System.out.println("Tickets List Clickable: " + clickable);
//	}
//
//	@Test(priority = 18)
//	public void testCommissionClickable() {
//		boolean clickable = adminDashBoard.isCommissionClickable();
//		Assert.assertTrue(clickable);
//		System.out.println("Commission Clickable: " + clickable);
//	}

}