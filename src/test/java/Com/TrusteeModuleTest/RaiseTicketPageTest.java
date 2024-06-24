package Com.TrusteeModuleTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.TrusteeModule.Trustee_Login;
import com.ValuerModule.RaiseTicketPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.utilityModule.ExtentReportExample;

import Com.BaseModule.LaunchBrowserValuer_Trustee;

public class RaiseTicketPageTest extends LaunchBrowserValuer_Trustee {
	static ExtentReports extent = ExtentReportExample.getExtent();
	static ExtentTest test;
	public static Trustee_Login trusteepage;

//	Verify that the submit button is displayed on the page where users can report an issue.
	@Test(priority = 34)
	public static void SubmitbuttonDisplay() throws InterruptedException {
//		trusteepage = new Trustee_Login(driver);
//		trusteepage.TrusteeMobileNumber(driver);
		RaiseTicketPage raiseticketpage = new RaiseTicketPage(driver);
		raiseticketpage.sidebuttn(driver);

		// Create a test instance
		ExtentTest test = ExtentReportExample.getExtent().createTest("SubmitbuttonDisplay");

		// Log the test description
		test.pass("Verify that the submit button is displayed on the page where users can report an issue.");

		// Log tester details
		ExtentReportExample.logTesterDetails(test);

		try {
			// Example condition to check whether the button is displayed
			boolean isButtonDisplayed = raiseticketpage.isSubmitButtonVisible();

			if (!isButtonDisplayed) {
				// If button is not displayed, log test failure
				ExtentReportExample.logTestStatus(test, Status.FAIL, "Submit button is not displayed on the page.");
			} else {
				// If button is displayed, log test success
				ExtentReportExample.logTestStatus(test, Status.PASS, "Submit button is displayed on the page.");
			}
		} catch (Exception e) {
			// Log any exceptions occurred during the test execution
			ExtentReportExample.logTestStatus(test, Status.FAIL, "Test failed: " + e.getMessage());
		}

		// Flush the extent report
		ExtentReportExample.getExtent().flush();

		// Optionally, print submit button visibility status
		System.out.println("Submit button visibility: " + raiseticketpage.isSubmitButtonVisible());
	}

//Verify that the text "Report an Issue" is displayed on the page where users can report an issue.
	@Test(priority = 35)
	public static void ReportanIssueDisplay() throws InterruptedException {

		// Perform necessary actions to navigate to the page where text "Report an
		// Issue" is expected
		RaiseTicketPage raiseticketpage = new RaiseTicketPage(driver);
		raiseticketpage.sidebuttn(driver);

		// Create a test instance
		ExtentTest test = ExtentReportExample.getExtent().createTest("ReportanIssueDisplay");

		// Log the test description
		test.pass("Verify that the text \"Report an Issue\" is displayed on the page where users can report an issue.");

		// Log tester details
		ExtentReportExample.logTesterDetails(test);

		try {
			// Example condition to check whether the text is displayed
			boolean isTextDisplayed = raiseticketpage.isReportAnIssueTextVisible();

			if (!isTextDisplayed) {
				// If text is not displayed, log test failure
				ExtentReportExample.logTestStatus(test, Status.FAIL,
						"Text \"Report an Issue\" is not displayed on the page.");
			} else {
				// If text is displayed, log test success
				ExtentReportExample.logTestStatus(test, Status.PASS,
						"Text \"Report an Issue\" is displayed on the page.");
			}
		} catch (Exception e) {
			// Log any exceptions occurred during the test execution
			ExtentReportExample.logTestStatus(test, Status.FAIL, "Test failed: " + e.getMessage());
		}

		// Flush the extent report
		ExtentReportExample.getExtent().flush();

		// Optionally, print the visibility status of the text
		System.out.println("ReportAnIssueText visibility: " + raiseticketpage.isReportAnIssueTextVisible());

	}

//Verify that the text box for entering the issue description is displayed on the page. 
	@Test(priority = 36)
	public void TextBoxDisplay() throws InterruptedException {
		// Initialize RaiseTicketPage instance and navigate to the page
		RaiseTicketPage raiseticketpage = new RaiseTicketPage(driver);
		raiseticketpage.sidebuttn(driver);

		// Create a test instance
		ExtentTest test = ExtentReportExample.getExtent().createTest("TextBoxDisplay");

		// Log the test description
		test.pass("Verify that the text box for entering the issue description is displayed on the page.");

		// Log tester details
		ExtentReportExample.logTesterDetails(test);

		try {
			// Example condition to check whether the text box is displayed
			boolean isTextBoxVisible = raiseticketpage.isTextBoxVisible();

			if (!isTextBoxVisible) {
				// If text box is not visible, log test failure
				ExtentReportExample.logTestStatus(test, Status.FAIL, "Test failed: The text box is not visible");
			} else {
				// If text box is visible, log test success
				ExtentReportExample.logTestStatus(test, Status.PASS, "Test passed");
			}
		} catch (Exception e) {
			// Log any exceptions occurred during the test execution
			ExtentReportExample.logTestStatus(test, Status.FAIL, "Test failed: " + e.getMessage());
		}

		// Flush the extent report
		ExtentReportExample.getExtent().flush();

		// Optionally, print the visibility status of the text box
		System.out.println("TextBoxVisible visibility: " + raiseticketpage.isTextBoxVisible());
	}

//Verify that a minimum of the less then  30 characters are entered in the issue description text box.

	@Test(priority = 37)
	public void VerifyLessThen30CharErrormsgdisplay() throws InterruptedException {
		// Assuming 'driver' is a WebDriver instance available in your test class

		// Initialize RaiseTicketPage instance and navigate to the page
		RaiseTicketPage raiseticketpage = new RaiseTicketPage(driver);
		raiseticketpage.sidebuttn(driver);
		raiseticketpage.EnterText();

		// Create a test instance
		ExtentTest test = ExtentReportExample.getExtent().createTest("VerifyLessThen30CharErrormsgdisplay");

		// Log the test description
		test.pass("Verify that a minimum of less than 30 characters are entered in the issue description text box.");

		// Log tester details
		ExtentReportExample.logTesterDetails(test);

		try {
			// Example condition to check if less than 30 characters are entered
			String enteredText = raiseticketpage.getEnteredText();
			boolean isLessThan30Chars = enteredText.length() < 30;

			if (!isLessThan30Chars) {
				// If more than or equal to 30 characters entered, log test failure
				ExtentReportExample.logTestStatus(test, Status.FAIL,
						"Test failed: More than or equal to 30 characters entered");
			} else {
				// If less than 30 characters entered, log test success
				ExtentReportExample.logTestStatus(test, Status.PASS, "Test passed");
			}
		} catch (Exception e) {
			// Log any exceptions occurred during the test execution
			ExtentReportExample.logTestStatus(test, Status.FAIL, "Test failed: " + e.getMessage());
		}

		// Flush the extent report
		ExtentReportExample.getExtent().flush();
	}

//
//Verify that the submit button is enabled when a minimum of 30 characters are entered in the issue description text box.
	@Test(priority = 38)
	public void submitbuttonenabled30char() throws InterruptedException {

		// Initialize RaiseTicketPage instance and navigate to the page
		RaiseTicketPage raiseticketpage = new RaiseTicketPage(driver);
		raiseticketpage.sidebuttn(driver);
		raiseticketpage.moreThan30CharText();

		// Create a test instance
		ExtentTest test = ExtentReportExample.getExtent().createTest("submitbuttonenabled30char");

		// Log the test description
		test.pass(
				"Verify that the submit button is enabled when a minimum of 30 characters are entered in the issue description text box.");

		// Log tester details
		ExtentReportExample.logTesterDetails(test);

		try {
			// Example condition to check if submit button is enabled
			boolean isSubmitButtonEnabled = raiseticketpage.isSubmitButtonEnabled();

			if (!isSubmitButtonEnabled) {
				// If submit button is not enabled, log test failure
				ExtentReportExample.logTestStatus(test, Status.FAIL, "Test failed: The submit button is not enabled");
			} else {
				// If submit button is enabled, log test success
				ExtentReportExample.logTestStatus(test, Status.PASS, "Test passed");
			}
		} catch (Exception e) {
			// Log any exceptions occurred during the test execution
			ExtentReportExample.logTestStatus(test, Status.FAIL, "Test failed: " + e.getMessage());
		}

		// Flush the extent report
		ExtentReportExample.getExtent().flush();
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
		ExtentReportExample.openExtentReport();
	}

}
