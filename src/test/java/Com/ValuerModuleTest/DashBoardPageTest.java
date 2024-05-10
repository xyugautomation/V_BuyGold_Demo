package Com.ValuerModuleTest;

import java.awt.Desktop;
import java.io.File;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ValuerModule.DashBoardPage;
import com.ValuerModule.Valuer_Login;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.utilityModule.ExtentReportExample;

import Com.BaseModule.LaunchBrowserValuer;

public class DashBoardPageTest extends LaunchBrowserValuer {
	// Path to store the Extent Reports file
	private static final String REPORT_PATH = "C:\\Users\\admin\\eclipse-workspace\\Generl\\V_Buy_Gold1\\ExtendsRepor\\report.html";

	static ExtentReports extent = ExtentReportExample.getExtent();
	static ExtentTest test;

	public static DashBoardPage dashboardpage;
	public static Valuer_Login loginDetails;
	public static Valuer_Login loginPage;

	// Verify that the logo of the Valuer-Login system is displayed on the
	// dashboard.
	@Test(priority = 1)
	public void VerifylogoDisplay() {

		loginPage = new Valuer_Login(driver);
		loginPage.ValuerLoginWithMobileNumber(driver);

	}

	// Verify that the logout button is displayed on the dashboard.
	@Test(priority = 2)
	public void VerifyLogoutButtonDisplay() throws InterruptedException {

		// Assuming dashboardpage and driver are declared and initialized elsewhere

		// Simulating a wait
		Thread.sleep(2000);
		dashboardpage = new DashBoardPage(driver);
		// Check if Logout button is displayed
		boolean isLogoutButtonDisplayed = dashboardpage.isLogoutButtonDisplayed(driver);
		System.out.println("Is Logout Button displayed? " + isLogoutButtonDisplayed);

		// Create ExtentReports instance
		ExtentReports extent = new ExtentReports();

		// Replace "path/to/extent/report.html" with your desired report path
		String reportPath = "C:\\Users\\admin\\eclipse-workspace\\Generl\\V_Buy_Gold1\\ExtendsRepor\\report.html";
		extent.attachReporter(new ExtentHtmlReporter(reportPath));

		// Create ExtentTest instance
		ExtentTest test = extent.createTest("VerifyLogoutButtonDisplay",
				"Verify that the logout button is displayed on the dashboard.");

		// Log test status based on the result
		if (isLogoutButtonDisplayed) {
			test.log(Status.PASS, "Logout button is displayed on the page.");
		} else {
			test.log(Status.FAIL, "Logout button is not displayed on the page.");
		}

		// Flush the extent report
		extent.flush();
		// Open the generated report file
		// openReport(reportPath);

	}

	// Verify that live price information is displayed on the dashboard.
	@Test(priority = 3)
	public void VerifyLivepriceDisplay() throws InterruptedException {

		dashboardpage = new DashBoardPage(driver);
		// Check if Dashboard button is displayed
		boolean isLivePriceTextDisplayed = dashboardpage.islivepricetextDisplayed(driver);
		System.out.println("Is LivePrice Text displayed? " + isLivePriceTextDisplayed);

		// Create ExtentReports instance
		ExtentReports extent = new ExtentReports();

		// Replace "path/to/extent/report.html" with your desired report path
		String reportPath = "C:\\Users\\admin\\eclipse-workspace\\Generl\\V_Buy_Gold1\\ExtendsRepor\\report.html";
		extent.attachReporter(new ExtentHtmlReporter(reportPath));

		// Create ExtentTest instance
		ExtentTest test = extent.createTest("VerifyLivepriceDisplay",
				"Verify that the LivePrice is displayed on the dashboard.");

		// Log test status based on the result
		if (isLivePriceTextDisplayed) {
			test.log(Status.PASS, "LivePrice is displayed on the page.");
		} else {
			test.log(Status.FAIL, "LivePrice is not displayed on the page.");
		}

		// Flush the extent report
		extent.flush();
		// Open the generated report file
		openReport(reportPath);

	}

	// Verify that the text "Dashboard" is displayed on the dashboard.
	@Test(priority = 4)
	public void VerifyDashBoardTextDisplay() throws InterruptedException {

		dashboardpage = new DashBoardPage(driver);
		// Check if Dashboard button is displayed
		boolean isDashboardTextDisplayed = dashboardpage.isDashBoardTextDisplayed(driver);
		System.out.println("Is Dashboard Text displayed? " + isDashboardTextDisplayed);

		// Create ExtentReports instance
		ExtentReports extent = new ExtentReports();

		// Replace "path/to/extent/report.html" with your desired report path
		String reportPath = "C:\\Users\\admin\\eclipse-workspace\\Generl\\V_Buy_Gold1\\ExtendsRepor\\report.html";
		extent.attachReporter(new ExtentHtmlReporter(reportPath));

		// Create ExtentTest instance
		ExtentTest test = extent.createTest("VerifyDashBoardTextDisplay",
				"Verify that the text \"Dashboard\" is displayed on the dashboard.");

		// Log test status based on the result
		if (isDashboardTextDisplayed) {
			test.log(Status.PASS, "text \"Dashboard\" is displayed on the page.");
		} else {
			test.log(Status.FAIL, "text \"Dashboard\" is not displayed on the page.");
		}

		// Flush the extent report
		extent.flush();
		// Open the generated report file
		openReport(reportPath);

	}

	// Verify that Dashboard products are displayed on the dashboard.
	@Test(priority = 5)
	public void VerifyDashboardProductDisplay() throws InterruptedException {

		dashboardpage = new DashBoardPage(driver);
		// Check if Dashboard button is displayed
		boolean isDashboardDisplayed = dashboardpage.isDashboardButtonDisplayed(driver);
		System.out.println("Is Dashboard button displayed? " + isDashboardDisplayed);

		// Create ExtentReports instance
		ExtentReports extent = new ExtentReports();

		// Replace "path/to/extent/report.html" with your desired report path
		String reportPath = "C:\\Users\\admin\\eclipse-workspace\\Generl\\V_Buy_Gold1\\ExtendsRepor\\report.html";
		extent.attachReporter(new ExtentHtmlReporter(reportPath));

		// Create ExtentTest instance
		ExtentTest test = extent.createTest("VerifyDashboardProductDisplay",
				" Verify that Dashboard products are displayed on the dashboard");

		// Log test status based on the result
		if (isDashboardDisplayed) {
			test.log(Status.PASS, "Dashboard products is displayed on the page.");
		} else {
			test.log(Status.FAIL, "Dashboard products is not displayed on the page.");
		}

		// Flush the extent report
		extent.flush();
		// Open the generated report file
		openReport(reportPath);

	}

	// Verify that pending products are displayed on the dashboard.
	@Test(priority = 6)
	public void VerifyPendingProductDisplay() throws InterruptedException {

		dashboardpage = new DashBoardPage(driver);
		boolean isPendingProductDisplayed = dashboardpage.isPendingProductsButtonDisplayed(driver);
		System.out.println("Is Pending Product displayed? " + isPendingProductDisplayed);

		// Create ExtentReports instance
		ExtentReports extent = new ExtentReports();

		// Replace "path/to/extent/report.html" with your desired report path
		String reportPath = "C:\\Users\\admin\\eclipse-workspace\\Generl\\V_Buy_Gold1\\ExtendsRepor\\report.html";
		extent.attachReporter(new ExtentHtmlReporter(reportPath));

		// Create ExtentTest instance
		ExtentTest test = extent.createTest("VerifyPendingProductDisplay",
				"Verify that pending products are displayed on the dashboard.");

		// Log test status based on the result
		if (isPendingProductDisplayed) {
			test.log(Status.PASS, "pending products is displayed on the page.");
		} else {
			test.log(Status.FAIL, "pending products is not displayed on the page.");
		}

		// Flush the extent report
		extent.flush();
		// Open the generated report file
		openReport(reportPath);

	}

	// Verify that accepted products are displayed on the dashboard.
	@Test(priority = 7)
	public void VerifyacceptedProductDisplay() throws InterruptedException {
		dashboardpage = new DashBoardPage(driver);
		boolean isacceptedProductDisplayed = dashboardpage.isAcceptedProductsButtonDisplayed(driver);
		System.out.println("Is accepted Product displayed? " + isacceptedProductDisplayed);

		// Create ExtentReports instance
		ExtentReports extent = new ExtentReports();

		// Replace "path/to/extent/report.html" with your desired report path
		String reportPath = "C:\\Users\\admin\\eclipse-workspace\\Generl\\V_Buy_Gold1\\ExtendsRepor\\report.html";
		extent.attachReporter(new ExtentHtmlReporter(reportPath));

		// Create ExtentTest instance
		ExtentTest test = extent.createTest("VerifyPendingProductDisplay",
				"Verify that accepted products are displayed on the dashboard.");

		// Log test status based on the result
		if (isacceptedProductDisplayed) {
			test.log(Status.PASS, "accepted products is displayed on the page.");
		} else {
			test.log(Status.FAIL, "accepted products is not displayed on the page.");
		}

		// Flush the extent report
		extent.flush();
		// Open the generated report file
		openReport(reportPath);

	}

//
	// Verify that rejected products are displayed on the dashboard.
	@Test(priority = 8)
	public void VerifyrejectedProductDisplay() throws InterruptedException {
		dashboardpage = new DashBoardPage(driver);
		boolean isrejectedProductDisplayed = dashboardpage.isRejectedProductsButtonDisplayed(driver);
		System.out.println("Is rejected Product displayed? " + isrejectedProductDisplayed);

		// Create ExtentReports instance
		ExtentReports extent = new ExtentReports();

		// Replace "path/to/extent/report.html" with your desired report path
		String reportPath = "C:\\Users\\admin\\eclipse-workspace\\Generl\\V_Buy_Gold1\\ExtendsRepor\\report.html";
		extent.attachReporter(new ExtentHtmlReporter(reportPath));

		// Create ExtentTest instance
		ExtentTest test = extent.createTest("VerifyrejectedProductDisplay",
				"Verify that rejected products are displayed on the dashboard.");

		// Log test status based on the result
		if (isrejectedProductDisplayed) {
			test.log(Status.PASS, "rejected products is displayed on the page.");
		} else {
			test.log(Status.FAIL, "rejected products is not displayed on the page.");
		}

		// Flush the extent report
		extent.flush();
		// Open the generated report file
		openReport(reportPath);

	}

	// Verify that commission details are displayed on the Dashboard.
	@Test(priority = 9)
	public void VerifycommissionDisplay() throws InterruptedException {
		dashboardpage = new DashBoardPage(driver);
		boolean iscommissionProductDisplayed = dashboardpage.isCommissionButtonDisplayed(driver);
		System.out.println("Is commission Product displayed? " + iscommissionProductDisplayed);

		// Create ExtentReports instance
		ExtentReports extent = new ExtentReports();

		// Replace "path/to/extent/report.html" with your desired report path
		String reportPath = "C:\\Users\\admin\\eclipse-workspace\\Generl\\V_Buy_Gold1\\ExtendsRepor\\report.html";
		extent.attachReporter(new ExtentHtmlReporter(reportPath));

		// Create ExtentTest instance
		ExtentTest test = extent.createTest("VerifycommissionDisplay",
				"Verify that commission products are displayed on the dashboard.");

		// Log test status based on the result
		if (iscommissionProductDisplayed) {
			test.log(Status.PASS, "rejected products is displayed on the page.");
		} else {
			test.log(Status.FAIL, "rejected products is not displayed on the page.");
		}

		// Flush the extent report
		extent.flush();
		// Open the generated report file
		openReport(reportPath);

	}

	// Verify that TicketStatus details are displayed on the Dashboard.
	@Test(priority = 10)
	public void VerifyTicketStatusDisplay() throws InterruptedException {
		dashboardpage = new DashBoardPage(driver);
		boolean isTicketStatusProductDisplayed = dashboardpage.isTicketStatusButtonDisplayed(driver);
		System.out.println("Is TicketStatus Product displayed? " + isTicketStatusProductDisplayed);

		// Create ExtentReports instance
		ExtentReports extent = new ExtentReports();

		// Replace "path/to/extent/report.html" with your desired report path
		String reportPath = "C:\\Users\\admin\\eclipse-workspace\\Generl\\V_Buy_Gold1\\ExtendsRepor\\report.html";
		extent.attachReporter(new ExtentHtmlReporter(reportPath));

		// Create ExtentTest instance
		ExtentTest test = extent.createTest("VerifyTicketStatusDisplay",
				"Verify that TicketStatus products are displayed on the dashboard.");

		// Log test status based on the result
		if (isTicketStatusProductDisplayed) {
			test.log(Status.PASS, "TicketStatus products is displayed on the page.");
		} else {
			test.log(Status.FAIL, "TicketStatus products is not displayed on the page.");
		}

		// Flush the extent report
		extent.flush();
		// Open the generated report file
		openReport(reportPath);

	}

	// Verify that RaiseTicket details are displayed on the Dashboard.
	@Test(priority = 11)
	public void VerifyRaiseTicketDisplay() throws InterruptedException {
		dashboardpage = new DashBoardPage(driver);
		boolean isRaiseTicketProductDisplayed = dashboardpage.isRaiseTicketsButtonDisplayed(driver);
		System.out.println("Is RaiseTicketProduct displayed? " + isRaiseTicketProductDisplayed);

		// Create ExtentReports instance
		ExtentReports extent = new ExtentReports();

		// Replace "path/to/extent/report.html" with your desired report path
		String reportPath = "C:\\Users\\admin\\eclipse-workspace\\Generl\\V_Buy_Gold1\\ExtendsRepor\\report.html";
		extent.attachReporter(new ExtentHtmlReporter(reportPath));

		// Create ExtentTest instance
		ExtentTest test = extent.createTest("VerifyRaiseTicketDisplay",
				"Verify that TicketStatus products are displayed on the dashboard.");

		// Log test status based on the result
		if (isRaiseTicketProductDisplayed) {
			test.log(Status.PASS, "RaiseTicket products is displayed on the page.");
		} else {
			test.log(Status.FAIL, "RaiseTicket products is not displayed on the page.");
		}

		// Flush the extent report
		extent.flush();
		// Open the generated report file
		openReport(reportPath);

	}

	// Test to verify and display whether Dashboard products are clickable on the
	// dashboard
	@Test(priority = 12)
	public void verifyDashboardProductClickable() throws InterruptedException {
		dashboardpage = new DashBoardPage(driver);
		boolean clickable = dashboardpage.isDashboardButtonClickable(driver);
		System.out.println("Dashboard products are clickable: " + clickable);
		System.out.println("Clicked on Dashboard products");

	}

	// Test to verify and display whether pending products are clickable on the
	// dashboard
	@Test(priority = 13)
	public void verifyPendingProductClickable() throws InterruptedException {

		dashboardpage = new DashBoardPage(driver);
		boolean clickable = dashboardpage.isPendingProductsButtonClickable(driver);
		System.out.println("Pending products are clickable: " + clickable);
		System.out.println("Clicked on Pending products");

	}

	// Test to verify and display whether accepted products are clickable on the
	// dashboard
	@Test(priority = 14)
	public void verifyAcceptedProductsClickable() throws InterruptedException {

		dashboardpage = new DashBoardPage(driver);
		boolean clickable = dashboardpage.isAcceptedProductsButtonClickable(driver);
		System.out.println("Accepted products are clickable: " + clickable);
		System.out.println("Clicked on Accepted products");

	}

	// Test to verify and display whether rejected products are clickable on the
	// dashboard
	@Test(priority = 15)
	public void verifyRejectedProductClickable() throws InterruptedException {

		dashboardpage = new DashBoardPage(driver);
		boolean clickable = dashboardpage.isRejectedProductsButtonClickable(driver);
		System.out.println("Rejected products are clickable: " + clickable);
		System.out.println("Clicked on Rejected products");

	}

	// Test to verify and display whether RaiseTicket details are clickable on the
	// dashboard
	@Test(priority = 16)
	public void verifyRaiseTicketClickable() throws InterruptedException {
		dashboardpage = new DashBoardPage(driver);
		boolean clickable = dashboardpage.isRaiseTicketsButtonClickable(driver);
		System.out.println("RaiseTicket details are clickable: " + clickable);
		System.out.println("Clicked on RaiseTicket details");
	}

	// Test to verify and display whether TicketStatus details are clickable on the
	// dashboard
	@Test(priority = 17)
	public void verifyTicketStatusClickable() throws InterruptedException {
		dashboardpage = new DashBoardPage(driver);
		boolean clickable = dashboardpage.isTicketStatusButtonClickable(driver);
		System.out.println("TicketStatus details are clickable: " + clickable);
		System.out.println("Clicked on TicketStatus details");

	}

	// Test to verify and display whether commission details are clickable on the
	// dashboard
	@Test(priority = 18)
	public void verifyCommissionClickable() throws InterruptedException {
		dashboardpage = new DashBoardPage(driver);
		boolean clickable = dashboardpage.isCommissionButtonClickable(driver);
		System.out.println("Commission details are clickable: " + clickable);

		System.out.println("Clicked on Commission details");
	}

	// Test to verify click on the side menu bar button are clickable on the
	// dashboard
	@Test(priority = 19)
	public void verifySideMenuButtonclickable() throws InterruptedException {

		dashboardpage = new DashBoardPage(driver);
		dashboardpage.ClickonSidemenubutton(driver);

	}

	// Method to open the report file
	private void openReport(String reportPath) {
		try {
			File file = new File(reportPath);
			if (file.exists()) {
				Desktop.getDesktop().browse(file.toURI());
			} else {
				System.out.println("Report file does not exist.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeSuite
	public void ExtendsReports() {
		// Initialize ExtentReports instance
		extent = new ExtentReports();
		extent.attachReporter(new ExtentHtmlReporter(REPORT_PATH));
	}

	@AfterSuite
	public void tearDown() {
		// Flush the ExtentReports instance
		extent.flush();
		// Open the generated report file after all test cases are executed
		openReport(REPORT_PATH);
	}

}
