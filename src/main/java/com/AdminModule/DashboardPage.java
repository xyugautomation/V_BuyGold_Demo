package com.AdminModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

	WebDriver driver;
	WebDriverWait wait;

	// Dash board elements
	By dashboard = By.xpath("//span[normalize-space()='Dashboard']");
	By valuerList = By.xpath("//span[normalize-space()='Valuer List']");
	By trusteeList = By.xpath("//span[normalize-space()='Trustee List']");
	By moneyHolding = By.xpath("//span[normalize-space()='Money holding']");
	By ticketsList = By.xpath("//span[normalize-space()='Tickets List']");
	By commission = By.xpath("//span[normalize-space()='Commission']");

	By TotalValuerList = By.xpath("//p[normalize-space()='Total Valuer List']");
	By TotalTrusteeList = By.xpath("//p[normalize-space()='Total Trustee List']");
	By TotaldminCommission = By.xpath("//p[normalize-space()='Total Admin Commission']");
	By TotalNumberOfTickets = By.xpath("//p[normalize-space()='Total Number of Tickets']");
	By MoneHolding = By.xpath("//p[normalize-space()='Money Holding']");
	By VluersUnpaidCommsion = By.xpath("//div[@routerlink='/valuerlistpayment']//p[@class='till-head mb-3']");

	// Methods to get the text of each element
	public String getDashboardText() throws InterruptedException {
		Thread.sleep(2000);
		;
		return driver.findElement(dashboard).getText();
	}

	public String getValuerListText() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(valuerList).getText();
	}

	public String getTrusteeListText() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(trusteeList).getText();
	}

	public String getMoneyHoldingText() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(moneyHolding).getText();
	}

	public String getTicketsListText() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(ticketsList).getText();
	}

	public String getCommissionText() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(commission).getText();

	}

	// Methods to get the text of each element
	public String getTotalValuerListText() throws InterruptedException {
		Thread.sleep(2000);
		;
		return driver.findElement(TotalValuerList).getText();
	}

	public String getTotalTrusteeListText() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(TotalTrusteeList).getText();
	}

	public String getTotaldminCommissionText() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(TotaldminCommission).getText();
	}

	public String getTotalNumberOfTicketsText() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(TotalNumberOfTickets).getText();
	}

	public String getMoneHoldingText() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(MoneHolding).getText();
	}

	public String getVluersUnpaidCommsionText() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(VluersUnpaidCommsion).getText();

	}

	public DashboardPage(WebDriver driver) {
		this.driver = driver;

		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	}

	public boolean clickAllElements() {
		if (isDashboardClickable()) {
			clickElement(dashboard);
		} else {
			System.out.println("Dashboard is not clickable.");
			return false;
		}

		if (isValuerListClickable()) {
			clickElement(valuerList);
		} else {
			System.out.println("Valuer List is not clickable.");
			return false;
		}

		if (isTrusteeListClickable()) {
			clickElement(trusteeList);
		} else {
			System.out.println("Trustee List is not clickable.");
			return false;
		}

		if (isMoneyHoldingClickable()) {
			clickElement(moneyHolding);
		} else {
			System.out.println("Money Holding is not clickable.");
			return false;
		}

		if (isTicketsListClickable()) {
			clickElement(ticketsList);
		} else {
			System.out.println("Tickets List is not clickable.");
			return false;
		}

		if (isCommissionClickable()) {
			clickElement(commission);
		} else {
			System.out.println("Commission is not clickable.");
			return false;
		}

		return true; // All elements clicked successfully
	}

	private boolean clickElement(By locator) {
		try {
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			System.out.println("Clicked element located by " + locator.toString());
			return true;
		} catch (Exception e) {
			System.out.println(
					"Element located by " + locator.toString() + " is not clickable. Exception: " + e.getMessage());
			return false;
		}
	}

	public boolean isDashboardClickable() {
		return isElementClickable(dashboard);
	}

	public boolean isValuerListClickable() {

		return isElementClickable(valuerList);
	}

	public boolean isTrusteeListClickable() {
		return isElementClickable(trusteeList);
	}

	public boolean isMoneyHoldingClickable() {
		return isElementClickable(moneyHolding);
	}

	public boolean isTicketsListClickable() {
		return isElementClickable(ticketsList);
	}

	public boolean isCommissionClickable() {
		return isElementClickable(commission);
	}

	private boolean isElementClickable(By locator) {
		try {
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			boolean displayed = element.isDisplayed();
			boolean enabled = element.isEnabled();
			System.out.println("Element located by " + locator.toString() + " is displayed: " + displayed
					+ ", is enabled: " + enabled);
			return displayed && enabled;
		} catch (Exception e) {
			System.out.println(
					"Element located by " + locator.toString() + " is not clickable. Exception: " + e.getMessage());
			return false;
		}

	}
}
