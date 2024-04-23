package com.utilityModule;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
public class ScreenshotUtility {
	 public static String captureScreenshot(WebDriver driver, String screenshotName) {
	        try {
	            // Convert WebDriver object to TakeScreenshot
	            TakesScreenshot ts = (TakesScreenshot) driver;

	            // Capture screenshot as File type
	            File source = ts.getScreenshotAs(OutputType.FILE);

	            // Define the destination path for the screenshot
	            String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
	            String destPath = "./Screenshots/" + screenshotName + "_" + timeStamp + ".png";

	            // Create destination directory if it doesn't exist
	            File destFile = new File(destPath);
	            FileUtils.copyFile(source, destFile);

	            // Return the path of the screenshot
	            return destPath;
	        } catch (IOException e) {
	            System.out.println("Exception while taking screenshot: " + e.getMessage());
	            return e.getMessage();
	        }
	    }
}
