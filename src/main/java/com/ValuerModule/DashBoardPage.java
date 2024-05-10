package com.ValuerModule;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	// DashBoard of xpath

	@FindBy(xpath = "//a[@class='text-dash']")
	public static WebElement DashBoardText;

	// DashBoard of xpath logout button

	@FindBy(xpath = "//button[@class='logout']")
	public static WebElement Logoutbutton;

	// No product found of xpath

	@FindBy(xpath = "//h5[normalize-space()='No Product Found']")
	public static WebElement NoProductFoundText;

	@FindBy(xpath = "//p[@class='no-data-found']")
	public static WebElement TicketStatustext;

	@FindBy(xpath = "//p[@class='text-center text-danger']")
	public static WebElement CommissionText;

	// Previous and next button of xpath

	@FindBy(xpath = "//li[@class='pagination-previous disabled ng-star-inserted']//span[@class='ng-star-inserted']")
	public static WebElement PreviousButton;

	@FindBy(xpath = "//li[@class='pagination-next disabled ng-star-inserted']")
	public static WebElement NextButton;

	// xapth of sidemenu minimi button

	@FindBy(xpath = "//i[@class='fa-solid fa-ellipsis-vertical icon-vertical ng-star-inserted'] | (//i[@class='fa-solid fa-ellipsis-vertical icon-vertical ng-star-inserted'])[1]")
	public static WebElement SidemenuButtonminimizbutton;

	// Page Scroll button of xpath

	@FindBy(xpath = "//i[@class='fa-solid fa-ellipsis-vertical icon-vertical ng-star-inserted']")
	public static WebElement sideScrollbarOfPage;

	// Live Price of xpath

	@FindBy(xpath = "//p[normalize-space()='LivePrice:']")
	public static WebElement livepricetext;

	// 24k gold of xpath

	@FindBy(xpath = "//p[contains(text(),'22K Gold: ₹ 6,843/gram')]")
	public static WebElement livepriceof24kprice;

	@FindBy(xpath = "")
	public static WebElement livepriceof22kprice;

	// xpath of valuer_Name

	@FindBy(xpath = "//h5[normalize-space()='SHIV_PAT...']")
	public static WebElement valuer_Name;

	@FindBy(xpath = "//p[normalize-space()='Valuer']")
	public static WebElement valuer_NameText;

	// Logo of xpath
	@FindBy(xpath = "//img[@alt='logo']")
	public static WebElement Logo;

	// Xpath of side menu
	@FindBy(xpath = "//a[@class='ng-tns-c3299933523-3 ng-star-inserted active'] | //span[normalize-space()='Dashboard']")
	public static WebElement DashboardButton;

	@FindBy(xpath = "//span[normalize-space()='Pending Products']")
	public static WebElement PendingProductsButton;

	@FindBy(xpath = "//span[normalize-space()='Accepted Products']")
	public static WebElement AcceptedProductsButton;

	@FindBy(xpath = "//span[normalize-space()='Rejected Products']")
	public static WebElement RejectedProductsButton;

	@FindBy(xpath = "//span[normalize-space()='Raise Ticket']")
	public static WebElement RaiseTicktesButton;

	@FindBy(xpath = "//span[normalize-space()='Ticket Status']")
	public static WebElement TicketStatusButton;

	@FindBy(xpath = "//span[normalize-space()='Commission']")
	public static WebElement CommissionButton;

	// Overview all xpath

	@FindBy(xpath = "//span[@class='fs-4 pb-2']")
	public static WebElement OverViewText;

	@FindBy(xpath = "//div[@routerlink='/waitingforapproval']")
	public static WebElement PendingproductsBox;

	@FindBy(xpath = "//div[@routerlink='/approvedproductlist']")
	public static WebElement AcceptedProductsBox;

	@FindBy(xpath = "//div[@routerlink='/rejectedproductlist']")
	public static WebElement RejectedProductsBox;

	@FindBy(xpath = "//div[@routerlink='/transaction']")
	public static WebElement PendingCommissionBox;

	public DashBoardPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}

	// Method to check if Logo is displayed
	public boolean isLogoutButtonDisplayed(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		return Logoutbutton.isDisplayed();
	}

	// Method to check if Logo is displayed
	public boolean isLogoDisplayed(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		return Logo.isDisplayed();
	}

	// Method to check if Logo is displayed
	public boolean isDashBoardTextDisplayed(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		return DashBoardText.isDisplayed();
	}

	// Method to check if Logo is displayed
	public boolean islivepricetextDisplayed(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		return livepricetext.isDisplayed();
	}

	// Method to check if Dashboard button is displayed
	public boolean isDashboardButtonDisplayed(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		return DashboardButton.isDisplayed();
	}

	// Method to check if Pending Products button is displayed
	public boolean isPendingProductsButtonDisplayed(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		return PendingProductsButton.isDisplayed();

	}

	// Method to check if Accepted Products button is displayed
	public boolean isAcceptedProductsButtonDisplayed(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);

		return AcceptedProductsButton.isDisplayed();
	}

	// Method to check if Rejected Products button is displayed
	public boolean isRejectedProductsButtonDisplayed(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);

		return RejectedProductsButton.isDisplayed();
	}

	// Method to check if Raise Ticket button is displayed
	public boolean isRaiseTicketsButtonDisplayed(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);

		return RaiseTicktesButton.isDisplayed();
	}

	// Method to check if Ticket Status button is displayed
	public boolean isTicketStatusButtonDisplayed(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		return TicketStatusButton.isDisplayed();
	}

	// Method to check if Commission button is displayed
	public boolean isCommissionButtonDisplayed(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		return CommissionButton.isDisplayed();
	}

	// Methods to check if each button is clickable
	public boolean isDashboardButtonClickable(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);

		DashboardButton.click();

		return waitForElementToBeClickable(driver, DashboardButton);
	}

	public boolean isPendingProductsButtonClickable(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);

		PendingProductsButton.click();

		return waitForElementToBeClickable(driver, PendingProductsButton);
	}

	public boolean isAcceptedProductsButtonClickable(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		AcceptedProductsButton.click();

		return waitForElementToBeClickable(driver, AcceptedProductsButton);
	}

	public boolean isRejectedProductsButtonClickable(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		RejectedProductsButton.click();
		return waitForElementToBeClickable(driver, RejectedProductsButton);
	}

	public boolean isRaiseTicketsButtonClickable(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		RaiseTicktesButton.click();
		return waitForElementToBeClickable(driver, RaiseTicktesButton);
	}

	public boolean isTicketStatusButtonClickable(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		TicketStatusButton.click();
		return waitForElementToBeClickable(driver, TicketStatusButton);
	}

	public boolean isCommissionButtonClickable(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		CommissionButton.click();
		return waitForElementToBeClickable(driver, CommissionButton);
	}

	public void ClickonSidemenubutton(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);

		SidemenuButtonminimizbutton.click();

		Thread.sleep(2000);
		SidemenuButtonminimizbutton.click();

	}

	// Method to wait for an element to be clickable
	private boolean waitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
