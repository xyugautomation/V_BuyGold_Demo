package com.utilityModule;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportManager {

	
	 private static ExtentReports extent;
	    private static ExtentTest test;

	    public static void initialize() {
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	    }

	    public static ExtentTest createTest(String testName) {
	        test = extent.createTest(testName);
	        return test;
	    }

	    public static void flushReport() {
	        extent.flush();
	    }
	
	
	
}
