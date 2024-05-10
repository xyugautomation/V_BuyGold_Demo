package Com.LoginPageTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.LoginModulePage.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.utilityModule.ExtentReportExample;

import Com.BaseModule.launchbrowser;

public class LoginPageTest extends launchbrowser {
	ExtentReports extent = ExtentReportExample.getExtent();
	ExtentTest test;

	@Test
	public void validatalogout() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.loginpagewebelement(driver);

		LP.logout(driver);
		test = extent.createTest("validatalogout");

		test.pass("Verify Login With Valid credentials");

		ExtentReportExample.logTesterDetails(test); // Log tester details

		try {
			
			boolean condition = false;
			if (!condition) {
				
			} else {
				ExtentReportExample.logTestStatus(test, Status.PASS, "Test passed");
			}
		} catch (AssertionError e) {
			ExtentReportExample.logTestStatus(test, Status.FAIL, "Test failed: " + e.getMessage());
		}

		extent.flush();

	}

	
	

	@AfterSuite
	public void tearDown() {
		extent.flush();
		ExtentReportExample.openExtentReport();
	}
}
