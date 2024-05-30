package com.TrusteeModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommissionPage {
	@FindBy(xpath = "//p[@class='fs-5']")
	public static WebElement CommissionEarnedText;

	@FindBy(xpath = "//p[@class='text-center text-danger']")
	public static WebElement NoDataFound;

	@FindBy(xpath = "//ul[@class='ngx-pagination ng-star-inserted']")
	public static WebElement PreviousAndNext;

	@FindBy(xpath = "//table[@class='table']")
	public static WebElement TableText;

	@FindBy(xpath = "//span[normalize-space()='Commission']")
	public static WebElement CommissionSideMenu;

	public CommissionPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void commissionmosidemenu() throws InterruptedException {
		Thread.sleep(2000);
		CommissionSideMenu.click();

	}

	// Method to check visibility of CommissionEarnedText
	public boolean isCommissionEarnedTextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return CommissionEarnedText.isDisplayed();
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
