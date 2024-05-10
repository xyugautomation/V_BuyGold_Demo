package com.ValuerModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RejectedProductsPage {
	@FindBy(xpath = "//table[@class='table']")
	public static WebElement TableText;

	@FindBy(xpath = "//h5[normalize-space()='No Product Found']")
	public static WebElement NoProductFound;

	@FindBy(xpath = "//ul[@class='ngx-pagination ng-star-inserted']")
	public static WebElement PreviousAndNext;

	@FindBy(xpath = "//div[@class='col-5 mb-4']")
	public static WebElement TillNowRejectedProductsText;

	@FindBy(xpath = "//span[normalize-space()='Rejected Products']")
	public static WebElement sidemenuRejectbutton;

	@FindBy(xpath = "//input[@placeholder='Search the data here...']")
	public static WebElement searchButton;

	public RejectedProductsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void sidemenuRejectProduct() throws InterruptedException {

		Thread.sleep(2000);
		sidemenuRejectbutton.click();

	}

	// Method to check visibility of TableText
	public boolean isTableTextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return TableText.isDisplayed();
	}

	// Method to check visibility of NoProductFound
	public boolean isNoProductFoundDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return NoProductFound.isDisplayed();
	}

	// Method to check visibility of PreviousAndNext
	public boolean isPreviousAndNextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return PreviousAndNext.isDisplayed();
	}

	// Method to check visibility of TillNowRejectedProductsText
	public boolean isTillNowRejectedProductsTextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return TillNowRejectedProductsText.isDisplayed();
	}

	public boolean isSearchButtonDisplayed() throws InterruptedException {

		Thread.sleep(2000);
		return searchButton.isDisplayed();

	}

	public WebElement searchbuttonenterData() throws InterruptedException {
		Thread.sleep(2000);
		searchButton.sendKeys("Shiv");
		searchButton.click();
		return searchButton;

	}

}
