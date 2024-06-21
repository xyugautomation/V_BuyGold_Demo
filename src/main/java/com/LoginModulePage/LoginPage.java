package com.LoginModulePage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;

public class LoginPage {
	public static WebDriver driver;
	public static final int TIMEOUT_SECONDS = 40;
	public JavascriptExecutor js;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/section[1]/nav[1]/ul[1]/li[4]/div[2]/div[1]/div[1]/button[1]")
	private WebElement LoginButton;

	@FindBy(xpath = "//input[@placeholder='Continue with Phone ']")
	private WebElement continuewithphone;

	@FindBy(xpath = "//input[@placeholder='Phone Number']")
	private WebElement PhoneNumber;

	@FindBy(xpath = "//input[@placeholder='Enter Your Password']")
	private WebElement Password;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	private WebElement ContinueButton;

	@FindBy(xpath = "//button[normalize-space()='Profile']")
	private WebElement profile;

	@FindBy(xpath = "//button[@aria-label='close']//*[name()='svg']")
	private WebElement sucessfullymsg;

	@FindBy(xpath = "//h6[normalize-space()='Logout']")
	private WebElement Logout;

	@FindBy(xpath = "//button[normalize-space()='Ok']")
	private WebElement YesButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor) driver;
	}

	public void loginpagewebelement(WebDriver driver) {
		LoginButton.click();

		fluentWaitForElementToBeClickable(driver, continuewithphone).click();
		fluentWaitForElementToBeVisible(driver, PhoneNumber).sendKeys("6305349069");
		fluentWaitForElementToBeVisible(driver, Password).sendKeys("Smile@8698");
		fluentWaitForElementToBeClickable(driver, ContinueButton).click();
		// fluentWaitForElementToBeClickable(driver, sucessfullymsg).click();
	}

	public void logout(WebDriver driver) throws InterruptedException {
		Thread.sleep(10000);

		fluentWaitForElementToBeClickable(driver, profile).click();
		Thread.sleep(10000);
		fluentWaitForElementToBeClickable(driver, Logout).click();
		Thread.sleep(10000);
		fluentWaitForElementToBeClickable(driver, YesButton).click();

		driver.close();

	}

	private WebElement fluentWaitForElementToBeVisible(WebDriver driver, WebElement element) {
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(TIMEOUT_SECONDS))
				.pollingEvery(Duration.ofMillis(500)).ignoring(org.openqa.selenium.NoSuchElementException.class);

		return wait.until((ExpectedCondition<WebElement>) driver1 -> element.isDisplayed() ? element : null);
	}

	private WebElement fluentWaitForElementToBeClickable(WebDriver driver, WebElement element) {
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(TIMEOUT_SECONDS))
				.pollingEvery(Duration.ofMillis(500)).ignoring(org.openqa.selenium.NoSuchElementException.class);

		return wait.until((ExpectedCondition<WebElement>) driver1 -> element.isEnabled() ? element : null);
	}

	public void invalidatedata(WebDriver driver) throws InterruptedException {

		LoginButton.click();
		Thread.sleep(3000);

		continuewithphone.click();
		// fluentWaitForElementToBeClickable(driver, continuewithphone).click();

		// Enter a valid phone number (less than 10 digits) and password (less than 8
		// characters)
		PhoneNumber.sendKeys("123456789");
		Password.sendKeys("1234567");

		// Verify if the "Continue" button is disabled
		if (ContinueButton.isEnabled()) {
			System.out.println("Test failed: Continue button is enabled with invalid input.");
		} else {
			System.out.println("Test passed: Continue button remains disabled with invalid input.");
		}

		// Clear the input fields
		PhoneNumber.clear();
		Password.clear();

		// Enter a valid phone number (10 digits) and password (8 characters)
		PhoneNumber.sendKeys("1234567890");
		Password.sendKeys("12345678");

		// Verify if the "Continue" button is enabled
		if (ContinueButton.isEnabled()) {
			System.out.println("Test passed: Continue button is enabled with valid input.");
		} else {
			System.out.println("Test failed: Continue button remains disabled with valid input.");
		}

		driver.close();

	}

	@AfterMethod
	public void tearDown() {
		// Close the WebDriver instance after each test method
		if (driver != null) {
			driver.quit();
		}
	}

}
