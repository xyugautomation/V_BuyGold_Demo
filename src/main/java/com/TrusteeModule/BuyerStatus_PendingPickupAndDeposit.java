package com.TrusteeModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyerStatus_PendingPickupAndDeposit {

	public static WebDriver driver;

	@FindBy(xpath = "//p[@class='fs-5']")
	public static WebElement WaitingForApprovalOfProducts;

	@FindBy(xpath = "//h5[text()='No Product Found ']")
	public static WebElement NoProductFound;

	@FindBy(xpath = "//ul[@class='ngx-pagination ng-star-inserted']")
	public static WebElement PreviousAndNextBtn;

	@FindBy(xpath = "//table[@class='table']")
	public static WebElement tableHighlight;

	@FindBy(xpath = "//span[normalize-space()='Buyer Status']")
	public static WebElement BuyerStatus;

	@FindBy(xpath = "//span[normalize-space()='Pending Pickup & Deposit']")
	public static WebElement PendingpickupAndDeposit;

	public BuyerStatus_PendingPickupAndDeposit(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void BuyerStatusClick() throws InterruptedException {
		Thread.sleep(3000);
		BuyerStatus.click();
		Thread.sleep(3000);
		PendingpickupAndDeposit.click();
	}

	// Method to check visibility of CommissionEarnedText
	public boolean isCommissionEarnedTextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return WaitingForApprovalOfProducts.isDisplayed();
	}

	// Method to check visibility of NoDataFound
	public boolean isNoDataFoundDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return NoProductFound.isDisplayed();

	}

	// Method to check visibility of PreviousAndNext
	public boolean isPreviousAndNextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return PreviousAndNextBtn.isDisplayed();
	}

	// Method to check visibility of TableText
	public boolean isTableTextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return tableHighlight.isDisplayed();
	}
}
