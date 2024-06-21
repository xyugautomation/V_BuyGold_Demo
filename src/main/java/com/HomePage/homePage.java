package com.HomePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {
	public static WebDriver driver;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/section[1]/nav[1]/ul[1]/li[1]/img[1]")
	WebElement V_Buy_Gold_Logo;

	@FindBy(xpath = "//button[normalize-space()='Reset']")
	WebElement Reset_button;

	@FindBy(xpath = "//nav[@class='header_webview']//button[@class='sell_btn'][normalize-space()='Sell Now']")
	WebElement SellNowButton;

	@FindBy(xpath = "//li[@class='user_info_btn']//div[@class='notification ng-star-inserted']//img")
	WebElement Notification_button;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/section[1]/nav[1]/ul[1]/li[4]/div[2]/div[1]/span[1]")
	WebElement login_sign_button;

	@FindBy(xpath = "//a[normalize-space()='Necklace']")
	WebElement Necklace;

	@FindBy(xpath = "//a[normalize-space()='Nose Pins']")
	WebElement NosePins;

	@FindBy(xpath = "//a[normalize-space()='Chains']")
	WebElement Chains;

	@FindBy(xpath = "//a[normalize-space()='Bracelets']")
	WebElement Bracelets;

	@FindBy(xpath = "//a[normalize-space()='Bangles']")
	WebElement Bangles;

	@FindBy(xpath = "//a[normalize-space()='Rings']")
	WebElement Rings;

	@FindBy(xpath = "//a[normalize-space()='Earrings']")
	WebElement Earrrings;

	@FindBy(xpath = "//a[normalize-space()='Pendants']")
	WebElement Pendants;

	@FindBy(xpath = "//a[normalize-space()='Bullion']")
	WebElement Bullion;

	@FindBy(xpath = "//a[normalize-space()='Others']")
	WebElement Others;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]/span[1]")
	WebElement linkAbout;

	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// Method to check if WebElement is present
	public boolean isElementPresent(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// Method to print element presence status
	public void printElementStatus(WebElement element, String description) {
		if (isElementPresent(element)) {
			System.out.println(description + " is present");
		} else {
			System.out.println(description + " is not present");
		}
	}

	// Example usage in your test method
	public void yourTestMethod() {
		printElementStatus(V_Buy_Gold_Logo, "V_Buy_Gold_Logo");
		printElementStatus(Reset_button, "Reset_button");
		printElementStatus(SellNowButton, "SellNowButton");
		printElementStatus(Notification_button, "Notification_button");
		printElementStatus(login_sign_button, "login_sign_button");
	}

	public void navBar() {

		if (isElementPresent(Necklace)) {
			System.out.println("Necklace is present");
		} else {
			System.out.println("Necklace is not present");
		}

		if (isElementPresent(NosePins)) {
			System.out.println("NosePins is present");
		} else {
			System.out.println("NosePins is not present");
		}

		if (isElementPresent(Chains)) {
			System.out.println("Chains is present");
		} else {
			System.out.println("Chains is not present");
		}

		if (isElementPresent(Bracelets)) {
			System.out.println("Bracelets is present");
		} else {
			System.out.println("Bracelets is not present");
		}

		if (isElementPresent(Bangles)) {
			System.out.println("Bangles is present");
		} else {
			System.out.println("Bangles is not present");
		}

		if (isElementPresent(Rings)) {
			System.out.println("Rings is present");
		} else {
			System.out.println("Rings is not present");
		}

		if (isElementPresent(Earrrings)) {
			System.out.println("Earrrings is present");
		} else {
			System.out.println("Earrrings is not present");
		}

		if (isElementPresent(Pendants)) {
			System.out.println("Pendants is present");
		} else {
			System.out.println("Pendants is not present");
		}

		if (isElementPresent(Bullion)) {
			System.out.println("Bullion is present");
		} else {
			System.out.println("Bullion is not present");
		}

		if (isElementPresent(Others)) {
			System.out.println("Others is present");
		} else {
			System.out.println("Others is not present");
		}

	}

	public boolean isElementClickable(WebElement element) {
		try {
			return element.isDisplayed() && element.isEnabled();
		} catch (NoSuchElementException | StaleElementReferenceException e) {
			return false;
		}
	}

	public void navBarClickable() {
		checkAndPrintStatus(Necklace);
		checkAndPrintStatus(NosePins);
		checkAndPrintStatus(Chains);
		checkAndPrintStatus(Bracelets);
		checkAndPrintStatus(Bangles);
		checkAndPrintStatus(Rings);
		checkAndPrintStatus(Earrrings);
		checkAndPrintStatus(Pendants);
		checkAndPrintStatus(Bullion);
		checkAndPrintStatus(Others);
	}

	public void checkAndPrintStatus(WebElement element) {
		if (isElementClickable(element)) {
			System.out.println(element + " is clickable");
		} else {
			System.out.println(element + " is not clickable");
		}
	}

	public void testPageTitle() {
		// Get the actual title of the webpage
		String actualTitle = driver.getTitle();

		// Expected title
		String expectedTitle = "Mastering Test Automation: Strategies, Tools, and Best Practices";

		// Compare the actual title with the expected title
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test Passed! The title is: " + actualTitle);
		} else {
			System.out.println("Test Failed! Expected title: " + expectedTitle + ", Actual title: " + actualTitle);
		}

	}

	public void sellbuttondetails() {

		String color = SellNowButton.getCssValue("background-color");
		String fontSize = SellNowButton.getCssValue("font-size");
		String width = SellNowButton.getCssValue("width");
		String fam = SellNowButton.getCssValue("font-family");
		boolean SellNowButtondisplay = SellNowButton.isDisplayed();

		System.out.println("===============SellNowButtonDetails==============");
		System.out.println("SellNow Button Color IS=" + "" + color);
		System.out.println("SellNow Button fontSize is =" + " " + fontSize);
		System.out.println("SellNow Button width is =" + "" + width);
		System.out.println("SellNow Button family is =" + "" + fam);
		System.out.println("SellNow_button  is display =" + "" + SellNowButtondisplay);
		System.out.println("================================================");
	}

	public void Reset_buttonDeatils() {

		String color = Reset_button.getCssValue("background-color");
		String fontSize = Reset_button.getCssValue("font-size");
		String width = Reset_button.getCssValue("width");
		String fam = Reset_button.getCssValue("font-family");
		boolean Resetbuttondisplay = Reset_button.isDisplayed();

		System.out.println("===============Reset_buttonDetails==============");
		System.out.println("Reset_button  Color IS=" + "" + color);
		System.out.println("Reset_button  fontSize is =" + " " + fontSize);
		System.out.println("Reset_button  width is =" + "" + width);
		System.out.println("Reset_button  family is =" + "" + fam);
		System.out.println("Reset_button  is display =" + "" + Resetbuttondisplay);
		System.out.println("===============SellNowButtonDetails==============");
	}

	public void Notification_buttonDeatils() {

		String color = Notification_button.getCssValue("background-color");
		String fontSize = Notification_button.getCssValue("font-size");
		String width = Notification_button.getCssValue("width");
		String fam = Notification_button.getCssValue("font-family");
		boolean notificationbuttondisplay = Notification_button.isDisplayed();

		System.out.println("===============Notification_buttonDetails==============");
		System.out.println("Notification_button  Color IS=" + "" + color);
		System.out.println("Notification_button  fontSize is =" + " " + fontSize);
		System.out.println("Notification_button  width is =" + "" + width);
		System.out.println("Notification_button  family is =" + "" + fam);
		System.out.println("Notification_button  is display =" + "" + notificationbuttondisplay);
		System.out.println("===============SellNowButtonDetails==============");

	}

}
