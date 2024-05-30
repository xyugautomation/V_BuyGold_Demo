package com.TrusteeModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketStatusPage {
	@FindBy(xpath = "//p[@class='no-data-found']")
	public static WebElement NoDataFound;

	@FindBy(xpath = "//table[@class='table mt-4 text-center']")
	public static WebElement TableText;

	@FindBy(xpath = "//h4[normalize-space()='Raised Tickets']")
	public static WebElement RaisedTicketsText;

	@FindBy(xpath = "//ul[@class='ngx-pagination ng-star-inserted']")
	public static WebElement PreviousAndNext;

	@FindBy(xpath = "//input[@placeholder='Search the data here...']")
	public static WebElement SearchButton;

	@FindBy(xpath = "//span[normalize-space()='Ticket Status']")
	public static WebElement ticketstatusButton;

	public TicketStatusPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void ticketstatusbuttonside() throws InterruptedException {
		Thread.sleep(2000);
		ticketstatusButton.click();

	}

	public boolean isNoDataFoundDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return NoDataFound.isDisplayed();
	}

	public boolean isTableTextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return TableText.isDisplayed();
	}

	public boolean isRaisedTicketsTextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return RaisedTicketsText.isDisplayed();
	}

	public boolean isPreviousAndNextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return PreviousAndNext.isDisplayed();
	}

	public boolean isSearchButtonDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return SearchButton.isDisplayed();
	}

}
