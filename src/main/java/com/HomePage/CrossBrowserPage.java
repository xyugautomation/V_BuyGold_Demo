package com.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserPage {
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void setup(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Invalid browser specified");
			break;
		}
	}

	@Test
	@Parameters("browser")
	public void testApplication(String browser) {

		System.out.println("Testing on " + browser + "...");

		// Test your application here
		driver.get("http://52.77.24.76/");

		// Add your test assertions here
	}

}
