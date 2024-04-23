package com.utilityModule;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportExample {
	 private ExtentReports extent;
	    private ExtentTest test;

	    @BeforeSuite
	    public void setUp() {
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	    }

	    @BeforeMethod
	    public void setupTest() {
	        // Setup your test environment
	    }

	    @Test
	    public void testExample() {
	        test = extent.createTest("Test Example");
	        test.log(Status.INFO, "Starting test example...");

	        // Your test logic here

	        test.log(Status.PASS, "Test passed");
	    }

	    @AfterMethod
	    public void tearDown() {
	        // Cleanup after each test
	    }

	    @AfterSuite
	    public void tearDownSuite() {
	        extent.flush();
	    }
}
