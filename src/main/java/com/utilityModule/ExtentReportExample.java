package com.utilityModule;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@SuppressWarnings("deprecation")
public class ExtentReportExample {
	private static ExtentReports extent;
	private static ExtentHtmlReporter htmlReporter;
	private static String filePath = "C:\\Users\\admin\\eclipse-workspace\\Generl\\V_Buy_Gold1\\test-output\\ExtentReports\\ExtentReport.html";

	public synchronized static ExtentReports getExtent() {
		if (extent == null) {
			extent = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter(filePath);

			// Set custom CSS styling for the Extent Report
			htmlReporter.config()
					.setCSS("body { font-family: Arial, sans-serif; background-color: #f9f9f9; }"
							+ ".brand-logo { font-size: 1.5em; color: #333; }"
							+ ".dashboard-summary { background-color: #f3f3f3; padding: 10px; margin-bottom: 20px; }"
							+ ".test-name { font-weight: bold; color: #333; }" + ".test-status { font-style: italic; }"
							+ ".test-description { margin-top: 10px; }");

			extent.attachReporter(htmlReporter);

		}
		return extent;
	}

	public static void logTesterDetails(ExtentTest test) {

		ExtentTest systemDetailsNode = test.createNode("System Details");

		systemDetailsNode.info("Operating System: Windows 10");
		systemDetailsNode.info("Browser: Chrome");

		test.info("Environment: QA");
		test.info("Build Version: 1.0.0");

		test.info("Tester Name: Shivshankar");

	}

	public static void openExtentReport() {
		File reportFile = new File(filePath);
		if (reportFile.exists()) {
			try {
				Desktop.getDesktop().browse(reportFile.toURI());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void logTestStatus(ExtentTest test, Status status, String message) {
		switch (status) {
		case PASS:
			test.pass(message);
			break;
		case FAIL:
			test.fail(message);
			break;
		case SKIP:
			test.skip(message);
			break;
		default:
			test.log(Status.INFO, message);
			break;
		}
	}

	public static void logWithScreenshot(ExtentTest test, Status status, String message) {
	    // Log the test status
	    logTestStatus(test, status, message);
	}
}
