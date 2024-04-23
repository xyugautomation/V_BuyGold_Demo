package com.ValuerModule;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Valuer_Login {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	@FindBy(xpath = "input[placeholder='Enter Phone number'] | //body[1]/app-root[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")
	public static WebElement EnterMobileNumber;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	public static WebElement clickbutton;

	@FindBy(xpath = "//input[@autocomplete='one-time-code'][1]")
	public static WebElement A;

	@FindBy(xpath = "//input[@autocomplete='one-time-code'][2]")
	public static WebElement B;

	@FindBy(xpath = "//input[@autocomplete='one-time-code'][3]")
	public static WebElement C;

	@FindBy(xpath = "//input[@autocomplete='one-time-code'][4]")
	public static WebElement D;

	@FindBy(xpath = "//input[@autocomplete='one-time-code'][5]")
	public static WebElement E;

	@FindBy(xpath = "//input[@autocomplete='one-time-code'][6]")
	public static WebElement F;

	@FindBy(xpath = "//p[normalize-space()='Enter verification code']")
	public static WebElement Text;

	@FindBy(xpath = "//img[@src='../../../assets/v-buy-gold-logo.png']")
	public static WebElement logo;

	@FindBy(xpath = "//p[normalize-space()='Login with your phone number']")
	public static WebElement loginpagetext;

	@FindBy(xpath = "//p[contains(text(),'Your contact number is never shared with external ')]")
	public static WebElement loginpagecontenttext;

	@FindBy(xpath = "//button[@class='logout']")
	public static WebElement logoutbutton;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	public static WebElement YesButton;

	public Valuer_Login(WebDriver driver) {

		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}

	public static void valuerMobileNumber(WebDriver driver) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Get the title of the webpage
		String title = driver.getTitle();

		// Check if the title matches
		if (title.equals("V-buy Gold Valuer")) {
			System.out.println("Title is as expected: " + title);
		} else {
			System.out.println("Title is not as expected. Actual title is: " + title);
		}

		// Get the current URL
		String currentURL = driver.getCurrentUrl();

		// Define the expected URL
		String expectedURL = "http://52.77.24.76:81/login";

		// Check if the current URL matches the expected URL
		if (currentURL.equals(expectedURL)) {
			System.out.println("Correct URL is open: " + currentURL);
		} else {
			System.out.println("Incorrect URL is open. Expected: " + expectedURL + ", Actual: " + currentURL);
		}

		// Find the text field element
		WebElement textField = driver.findElement(By.xpath("//input[@placeholder='Enter Phone number']"));

		// Get the placeholder attribute value
		String placeholderText = textField.getAttribute("placeholder");

		// Check if the placeholder text matches the expected text
		if (placeholderText.equals("Enter Phone number")) {
			System.out.println("Placeholder text is as expected: " + placeholderText);
		} else {
			System.out.println("Placeholder text is not as expected. Actual placeholder text is: " + placeholderText);
		}

		// Create JavaScriptExecutor instance
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Execute JavaScript to get cursor position
		Long cursorX = (Long) js.executeScript("return window.pageXOffset;");
		Long cursorY = (Long) js.executeScript("return window.pageYOffset;");

		// Check if cursor position is not null
		if (cursorX != null && cursorY != null) {
			System.out.println("Cursor is present on the page at position: X=" + cursorX + ", Y=" + cursorY);
		} else {
			System.out.println("Cursor is not present on the page.");
		}

		// get login text display
		if (loginpagetext != null) {
			if (loginpagetext.isDisplayed()) {
				System.out.println("Text is displayed on the page.");
			} else {
				System.out.println("Text is not displayed on the page.");
			}
		} else {
			System.out.println("Text element not found on the page.");
		}

		// get login page content text

		if (loginpagecontenttext != null) {
			if (loginpagecontenttext.isDisplayed()) {
				System.out.println("content is displayed on the login page.");
			} else {
				System.out.println("content is not displayed on the page.");
			}
		} else {
			System.out.println("content element not found on the page.");
		}

		// get enter mobile number page logo
		if (logo != null) {

			if (logo.isDisplayed()) {

				System.out.println("Logo is present on the Enter mobile number page");

			} else {

				System.out.println("Logo is not present on the Enter mobile number page");
			}

		} else {

			System.out.println("Logo element not found on the Enter mobile number page");

		}

		wait.until(ExpectedConditions.visibilityOf(EnterMobileNumber)).sendKeys("8989895689");

		wait.until(ExpectedConditions.visibilityOf(clickbutton)).click();

		// Find the success message element
		WebElement successMessage = null;
		try {
			successMessage = driver.findElement(By.xpath("//p[normalize-space()='OTP Sent Suceessfully']"));
		} catch (org.openqa.selenium.NoSuchElementException e) {
			// Success message not found
		}

		// Check if the success message is displayed
		if (successMessage != null && successMessage.isDisplayed()) {
			System.out.println("Success message is displayed mobile number page: " + successMessage.getText());
		} else {
			System.out.println("Success message is not displayed mobile number page.");
		}

		Thread.sleep(3000);

		// Check if the element is present
		if (Text != null) {
			if (Text.isDisplayed()) {
				System.out.println("Text is displayed on the page.");
			} else {
				System.out.println("Text is not displayed on the page.");
			}
		} else {
			System.out.println("Text element not found on the page.");
		}

		// check if the logo is present

		if (logo != null) {

			if (logo.isDisplayed()) {

				System.out.println("Logo is present on the OTP page");

			} else {

				System.out.println("Logo is not present on the OTP page");
			}

		} else {

			System.out.println("Logo element not found on the OTP page");

		}

		wait.until(ExpectedConditions.visibilityOf(A)).sendKeys("1");

		wait.until(ExpectedConditions.visibilityOf(B)).sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(C)).sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(D)).sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(E)).sendKeys("1");

		wait.until(ExpectedConditions.visibilityOf(F)).sendKeys("1");

		// Find the success message element
		WebElement successMessage1 = null;
		try {
			successMessage1 = driver.findElement(By.xpath("//p[normalize-space()='SUCCESS']"));
		} catch (org.openqa.selenium.NoSuchElementException e) {
			// Success message not found
		}

		// Check if the success message is displayed
		if (successMessage1 != null && successMessage1.isDisplayed()) {
			System.out.println("Success message is displayed: " + successMessage1.getText());
		} else {
			System.out.println("Success message is not displayed.");
		}

		wait.until(ExpectedConditions.visibilityOf(logoutbutton)).click();

		wait.until(ExpectedConditions.visibilityOf(YesButton)).click();

		// driver.close();

	}
}
