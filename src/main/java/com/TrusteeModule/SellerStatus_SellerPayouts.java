package com.TrusteeModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellerStatus_SellerPayouts {
	@FindBy(xpath = "//span[normalize-space()='Seller Status']")
	public static WebElement sellerStatus;

	@FindBy(xpath = "//span[normalize-space()='Seller Payouts']")
	public static WebElement sellerPayouts;

	@FindBy(xpath = "//div[@class='d-flex justify-content-center align-items-center ng-star-inserted']")
	public static WebElement NoDataFound;

	@FindBy(xpath = "//ul[@class='ngx-pagination ng-star-inserted']")
	public static WebElement PreviousAndNext;

	@FindBy(xpath = "//table[@class='table']")
	public static WebElement TableText;

	@FindBy(xpath = "//p[@class='fs-5']")
	public static WebElement sellerForDepositGold;

	public SellerStatus_SellerPayouts(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void sellerStatusClick() throws InterruptedException {
		Thread.sleep(3000);
		sellerStatus.click();
		Thread.sleep(3000);
		sellerPayouts.click();

	}

	// Method to check visibility of CommissionEarnedText
	public boolean isCommissionEarnedTextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return sellerForDepositGold.isDisplayed();
	}

	// Method to check visibility of NoDataFound
	public boolean isNoDataFoundDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return NoDataFound.isDisplayed();

	}

	// Method to check visibility of PreviousAndNext
	public boolean isPreviousAndNextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return PreviousAndNext.isDisplayed();
	}

	// Method to check visibility of TableText
	public boolean isTableTextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return TableText.isDisplayed();
	}

}
