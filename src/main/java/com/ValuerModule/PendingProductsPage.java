package com.ValuerModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingProductsPage {

	@FindBy(xpath = "//p[@class='fs-5']")
	public static WebElement WaitingForApproval;

	@FindBy(xpath = "//table[@class='table']")
	public static WebElement TableText;

	@FindBy(xpath = "//ul[@class='ngx-pagination ng-star-inserted']")
	public static WebElement PreviousAndNext;

	@FindBy(xpath = "//h5[normalize-space()='No Product Found']")
	public static WebElement NoProductFound;

	@FindBy(xpath = "//span[normalize-space()='Pending Products']")
	public static WebElement SidemenuPendingProduct;

	public PendingProductsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void sidemenucommisonbuttonclick() throws InterruptedException {
		Thread.sleep(2000);
		SidemenuPendingProduct.click();

	}

	// Method to check visibility of WaitingForApproval
	public boolean isWaitingForApprovalDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return WaitingForApproval.isDisplayed();
	}

	// Method to check visibility of TableText
	public boolean isTableTextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return TableText.isDisplayed();
	}

	// Method to check visibility of PreviousAndNext
	public boolean isPreviousAndNextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return PreviousAndNext.isDisplayed();
	}

	// Method to check visibility of NoProductFound
	public boolean isNoProductFoundDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return NoProductFound.isDisplayed();
	}

}
