package com.TrusteeModule;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	WebDriver driver;
	private WebDriverWait wait;

	// side menu xpath
	@FindBy(xpath = "//span[normalize-space()='Seller Status']")
	public static WebElement sideMenuSeller;

	@FindBy(xpath = "//span[normalize-space()='Approval Pending']")
	public static WebElement sideMenuSellerApprovalPending;

	@FindBy(xpath = "//span[normalize-space()='Pending Gold Deposits']")
	public static WebElement sideMenuSellerPendingGoldDeposits;

	@FindBy(xpath = "//span[normalize-space()='Seller Payouts']")
	public static WebElement sideMenuSellerPayouts;

	@FindBy(xpath = "//span[normalize-space()='Buyer Status']")
	public static WebElement sideMenuBuyerStatus;

	@FindBy(xpath = "//span[normalize-space()='Pending Pickup & Deposit']")
	public static WebElement sideMenuBuyerStatusPendingPickupAndDeposit;

	@FindBy(xpath = "//span[normalize-space()='Delivered Products']")
	public static WebElement sideMenuBuyerStatusDeleveredProducts;

	@FindBy(xpath = "//span[normalize-space()='Raise Ticket']")
	public static WebElement sideMenuRaiseTicket;

	@FindBy(xpath = "//span[normalize-space()='Ticket Status']")
	public static WebElement sideMenuTicketStatus;

	@FindBy(xpath = "//span[normalize-space()='Commission']")
	public static WebElement sideMenuComssion;

	By title = By.tagName("title");
	public By waitingForSellerProductApproval = By
			.xpath("//p[normalize-space()='Waiting for seller product approval']");
	public By approvedProductsWaitingForSeller = By
			.xpath("//p[contains(text(),'Approved products, Waiting for seller for deposit ')]");
	public By waitingForBuyerToCollectProduct = By
			.xpath("//div[@routerlink='/waitingforbuyertocollect']//p[@class='till-head mb-3']");
	public By sellerToCollectMoney = By.xpath("//p[normalize-space()='Seller to collect money']");
	public By successfullyDeliveredProducts = By.xpath("//p[normalize-space()='Successfully delivered products']");
	public By moneyHolding = By.xpath("//p[normalize-space()='Money holding']");
	public By earnedCommissions = By.xpath("//p[normalize-space()='Earned Commissions']");
	By livePrice24k = By.xpath("//p[contains(text(), '22K Gold:')]");
	By livePrice22k = By.xpath("//p[contains(text(), '24K Gold:')]");

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Adjust the wait time as needed
	}

	public String getTitle() throws InterruptedException {
		Thread.sleep(3000);
		return driver.getTitle();
	}

	public String getWaitingForSellerProductApproval() throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(waitingForSellerProductApproval).getText();
	}

	public String getApprovedProductsWaitingForSeller() throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(approvedProductsWaitingForSeller).getText();
	}

	public String getWaitingForBuyerToCollectProduct() throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(waitingForBuyerToCollectProduct).getText();
	}

	public String getSellerToCollectMoney() throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(sellerToCollectMoney).getText();
	}

	public String getSuccessfullyDeliveredProducts() throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(successfullyDeliveredProducts).getText();
	}

	public String getMoneyHolding() throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(moneyHolding).getText();
	}

	public String getEarnedCommissions() throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(earnedCommissions).getText();
	}

	public boolean isLivePrice24kDisplayed() throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(livePrice24k).isDisplayed();
	}

	public boolean isLivePrice22kDisplayed() throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(livePrice22k).isDisplayed();
	}

	public boolean isWaitingForSellerProductApprovalClickable() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(waitingForSellerProductApproval).isEnabled();
	}

	public boolean isApprovedProductsWaitingForSellerClickable() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(approvedProductsWaitingForSeller).isEnabled();
	}

	public boolean isWaitingForBuyerToCollectProductClickable() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(waitingForBuyerToCollectProduct).isEnabled();
	}

	public boolean isSellerToCollectMoneyClickable() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(sellerToCollectMoney).isEnabled();
	}

	public boolean isSuccessfullyDeliveredProductsClickable() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(successfullyDeliveredProducts).isEnabled();
	}

	public boolean isMoneyHoldingClickable() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(moneyHolding).isEnabled();
	}

	public boolean isEarnedCommissionsClickable() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(earnedCommissions).isEnabled();
	}

	// Method to check if a side menu item is displayed
	public boolean isSideMenuItemDisplayed2(WebElement menuItem) {
		if (menuItem == null) {
			return false;
		}
		try {
			return menuItem.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// Methods to check if each specific side menu item is displayed
	public boolean isSideMenuSellerDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return isSideMenuItemDisplayed2(sideMenuSeller);
	}

	public boolean isSideMenuSellerApprovalPendingDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return isSideMenuItemDisplayed2(sideMenuSellerApprovalPending);
	}

	public boolean isSideMenuSellerPendingGoldDepositsDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return isSideMenuItemDisplayed2(sideMenuSellerPendingGoldDeposits);
	}

	public boolean isSideMenuSellerPayoutsDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return isSideMenuItemDisplayed2(sideMenuSellerPayouts);
	}

	public boolean isSideMenuBuyerStatusDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return isSideMenuItemDisplayed2(sideMenuBuyerStatus);
	}

	public boolean isSideMenuBuyerStatusPendingPickupAndDepositDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return isSideMenuItemDisplayed2(sideMenuBuyerStatusPendingPickupAndDeposit);
	}

	public boolean isSideMenuBuyerStatusDeliveredProductsDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return isSideMenuItemDisplayed2(sideMenuBuyerStatusDeleveredProducts);
	}

	public boolean isSideMenuRaiseTicketDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return isSideMenuItemDisplayed2(sideMenuRaiseTicket);
	}

	public boolean isSideMenuTicketStatusDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return isSideMenuItemDisplayed2(sideMenuTicketStatus);
	}

	public boolean isSideMenuCommissionDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return isSideMenuItemDisplayed2(sideMenuComssion);
	}
}
