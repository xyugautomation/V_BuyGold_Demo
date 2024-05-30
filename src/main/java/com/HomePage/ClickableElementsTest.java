package com.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickableElementsTest {
	private WebDriver driver;
	private String baseUrl;

	@BeforeClass
	public void setUp() {
		// Set up the WebDriver instance
		WebDriverManager.chromedriver();
		driver = new ChromeDriver();
		baseUrl = "http://52.77.24.76/"; // Change this to your base URL

		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	public void testClickableElements() {
		// Find all clickable elements on the page
		java.util.List<WebElement> clickableElements = driver.findElements(By.xpath("//a | //button")); 
		

		// Loop through each clickable element and perform the action
		for (WebElement element : clickableElements) {
			driver.get("http://52.77.24.76/logintype");
			driver.navigate().back();
			String elementText = element.getText();
			String elementHref = element.getAttribute("href");

			// Click the element
			element.click();

			// Check if it navigates to the correct page or performs the intended action
			String currentUrl = driver.getCurrentUrl();
			Assert.assertNotEquals(currentUrl, baseUrl,
					"Element " + elementText + " did not navigate to a different page.");

			// Navigate back to the original page
			driver.navigate().back();

		}
	}
}
