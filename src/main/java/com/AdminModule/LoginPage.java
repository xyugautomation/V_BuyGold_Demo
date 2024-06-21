package com.AdminModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Email']")
	public static WebElement EmailField;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public static WebElement PasswordField;

	@FindBy(xpath = "//button[text()='Continue']")
	public static WebElement CntinueButton;

	// Locators
	By emailField = By.xpath("//input[@placeholder='Email']");
	By passwordField = By.xpath("//input[@placeholder='Password']"); // Update the locator if necessary
	By continueButton = By.xpath("//button[text()='Continue']");
	By errorMessageEmailID = By.xpath("//div[contains(text(),'Email is required')]"); // Update the locator if necessary
	By errorMessagePassword = By.xpath("//div[contains(text(),'Password is required')]");
	// Methods

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void LoginMethod() throws InterruptedException {

		Thread.sleep(2000);
		EmailField.sendKeys("admin@vbuygold.com");
		Thread.sleep(1000);
		PasswordField.sendKeys("admin.vbuy@2023");
		Thread.sleep(1000);
		CntinueButton.click();

	}

	// Methods
	public void setEmail(String email) throws InterruptedException {
		Thread.sleep(2000);
		WebElement emailElement = driver.findElement(emailField);
		System.out.println("Email field found: " + (emailElement != null));
		emailElement.sendKeys(email);
	}

	public void setPassword(String password) throws InterruptedException {
		Thread.sleep(2000);
		WebElement passwordElement = driver.findElement(passwordField);
		System.out.println("Password field found: " + (passwordElement != null));
		passwordElement.sendKeys(password);
	}

	public void clickContinue() throws InterruptedException {
		Thread.sleep(2000);
		WebElement continueButtonElement = driver.findElement(continueButton);
		System.out.println("Continue button found: " + (continueButtonElement != null));
		continueButtonElement.click();
	}

	public String getErrorMessage() throws InterruptedException {
		Thread.sleep(2000);
		WebElement errorMessageElement = driver.findElement(errorMessageEmailID);
		System.out.println("Error message element for email found: " + (errorMessageElement != null));
		return errorMessageElement.getText();
	}

	public String getErrorMessage1() throws InterruptedException {
		Thread.sleep(2000);
		WebElement errorMessageElement = driver.findElement(errorMessagePassword);
		System.out.println("Error message element for password found: " + (errorMessageElement != null));
		return errorMessageElement.getText();
	}

	// Clear Method
	public void clearField(By locator) {
		WebElement element = driver.findElement(locator);
		element.clear();
	}

	// Clear Email and Password Methods
	public void clearEmail() {
		clearField(emailField);
	}

	public void clearPassword() {
		clearField(passwordField);
	}
}
