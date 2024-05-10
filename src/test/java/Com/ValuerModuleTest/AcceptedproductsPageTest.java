package Com.ValuerModuleTest;

import java.util.List;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.ValuerModule.AcceptedProductsPage;
import com.ValuerModule.Valuer_Login;
import com.utilityModule.ExtentReportExample;

import Com.BaseModule.LaunchBrowserValuer;

public class AcceptedproductsPageTest extends LaunchBrowserValuer {

	AcceptedProductsPage acceptedproductspage;
	Valuer_Login loginPage;

//	 Verify that the text "Till Now Accepted Products" is displayed for products awaiting approval.
//	 Verify that products are displayed in the pending products module.

//	  Verify that the back button returns to the previous page/module.

//	 Verify that all expected text elements are displayed on the pending products page.

//	 Verify that the search button works correctly and filters products based on the search query

//	 Verify that the text "Till Now Accepted Products" is displayed for products awaiting approval.
	@Test(priority = 24)
	public void VerifyTillNowAcceptedProdustsTextDisplay() throws InterruptedException {

//		loginPage = new Valuer_Login(driver);
//		loginPage.ValuerLoginWithMobileNumber(driver);
		acceptedproductspage = new AcceptedProductsPage(driver);
		acceptedproductspage.TillNowText();

	}

//	 Verify that products are displayed in the AcceptedProduct module.
	@Test(priority = 25)
	public void Verifyproductsaredisplayedinthepending() {

		acceptedproductspage = new AcceptedProductsPage(driver);

		acceptedproductspage.NoFoundButton();

	}

//	 Verify that the previous and next buttons are displayed for navigating between pages of products.
	@Test(priority = 26)
	public void Verifypreviousandnextbuttonsaredisplayed() throws InterruptedException {

		acceptedproductspage = new AcceptedProductsPage(driver);
		acceptedproductspage.PreviosAndNextButton();

	}

//	 Verify that the search button is displayed on the pending products page.
	@Test(priority = 27)
	public void Verifysearchbuttonisdisplayed() throws InterruptedException {

		acceptedproductspage = new AcceptedProductsPage(driver);
		acceptedproductspage.SerachButton();

	}

//	 Verify that the search button works correctly and filters products based on the search query
	@Test(enabled = false)
	public void Verifysearchbuttonworkscorrectlyandfiltersproducts() {
		acceptedproductspage = new AcceptedProductsPage(driver);

	}

	@Test(priority = 28)
	public void verifyTableTextDsiplay() throws InterruptedException {
		acceptedproductspage = new AcceptedProductsPage(driver);
		// acceptedproductspage.AllTableText();

		// Check if the table text is displayed
		if (acceptedproductspage.isTableTextDisplayed()) {
			System.out.println("Text of table is displayed.");
		} else {
			System.out.println("Text of table is not displayed.");
		}

		// acceptedproductspage. printAllTableText();

		// Retrieve text from all columns in the table
		List<List<String>> tableColumns = acceptedproductspage.getAllTableColumns();
		for (List<String> column : tableColumns) {
			System.out.println("Column:");
			for (String text : column) {
				System.out.println(text);
			}
		}

	}

}
