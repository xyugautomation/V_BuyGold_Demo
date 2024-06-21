package com.TrusteeModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RaiseTicketPage {
	@FindBy(xpath = "//span[normalize-space()='Raise Ticket']")
	public static WebElement riseticketsidebutton;

	@FindBy(xpath = "//button[normalize-space()='Submit']")
	public static WebElement submitbutton;

	@FindBy(xpath = "//textarea[@placeholder='Type here']")
	public static WebElement TextBox;

	@FindBy(xpath = "//div[@class='ng-star-inserted']")
	public static WebElement Minimum30CharactersText;

	@FindBy(xpath = "//h5[normalize-space()='Report an Issue']")
	public static WebElement ReportAnIssueText;

	public RaiseTicketPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void sidebuttn(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		riseticketsidebutton.click();

	}

	// Method to check visibility of submit button
	public boolean isSubmitButtonVisible() throws InterruptedException {

		return submitbutton.isDisplayed();
	}

	// Method to check visibility of text box
	public boolean isTextBoxVisible() {
		return TextBox.isDisplayed();
	}

	// Method to check visibility of minimum 30 characters text
	public static boolean isMinimum30CharactersTextVisible() {
		return Minimum30CharactersText.isDisplayed();
	}

	// Method to check visibility of report an issue text
	public boolean isReportAnIssueTextVisible() {
		return ReportAnIssueText.isDisplayed();
	}

	public void EnterText() throws InterruptedException {

		// Enter text into the "ReportAnIssueText" field
		TextBox.sendKeys("Customer is not responding");

		// Check if the error message element is displayed
		if (Minimum30CharactersText.isDisplayed()) {
			System.out.println("Error message is displayed: Minimum 30 characters required.");
		} else {
			System.out.println("Error message is not displayed.");
		}
		Thread.sleep(2000);
		TextBox.clear();

	}

	public void moreThan30CharText() {
		// Enter text into the "TextBox" field
		TextBox.sendKeys("Customer is not responding correctly");

		// Check if the length of the entered text is more than 30 characters
		String enteredText = TextBox.getAttribute("value");
		if (enteredText.length() > 30) {
			// If more than 30 characters are entered, check if the submit button is enabled
			if (submitbutton.isEnabled()) {
				System.out.println("Submit button is enabled.");
			} else {
				System.out.println("Submit button is disabled.");
			}
		} else {
			// If less than or equal to 30 characters are entered, print a message
			System.out.println("Please enter more than 30 characters.");
		}

	}

	public void AllButtonVisiable(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);

		// Minimum30CharactersText

		// Check visibility
		if (submitbutton.isDisplayed() && TextBox.isDisplayed() && ReportAnIssueText.isDisplayed()) {
			System.out.println("All elements are visible.");
		} else {
			System.out.println("One or more elements are not visible.");
		}

	}

	// Method to check if submit button is enabled
	public boolean isSubmitButtonEnabled() {
		return submitbutton.isEnabled();
	}

	// Method to get the entered text from the issue description text box
	public String getEnteredText() {
		return TextBox.getAttribute("value");
	}

}
