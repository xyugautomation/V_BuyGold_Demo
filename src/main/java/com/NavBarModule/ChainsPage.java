package com.NavBarModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChainsPage {

	@FindBy(xpath = "//a[normalize-space()='Chains']")
	WebElement Chains;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]")
	WebElement noProductFoundMsg;

	@FindBy(xpath = "(//p[contains(text(),'Chains')])")
	WebElement ChainsProductSection;

	public static WebDriver driver;

	public ChainsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void ChainsProductTest() {

		try {
			// Add a simple wait using Thread.sleep() - not recommended for real test
			// automation
			Thread.sleep(5000); // Sleep for 5 seconds (adjust as needed)

			if (Chains.isDisplayed()) {
				System.out.println("Product is displayed");
			} else if (noProductFoundMsg.isDisplayed()) {
				System.out.println("No product found message is displayed");
			} else {
				System.out.println("Unexpected state. Neither product nor no product found message is displayed.");
			}
		} catch (InterruptedException e) {
			e.printStackTrace(); // Handle the InterruptedException if needed
		}
	}

	public void ChainsProductSection() throws InterruptedException {
		Thread.sleep(5000);
		Chains.click();
		Thread.sleep(5000);
		if (ChainsProductSection.isDisplayed()) {
			System.out.println("chains products are displayed.");

		} else if (noProductFoundMsg.isDisplayed()) {
			System.out.println("chains product are not available");

		}

		else {
			System.out.println("chains products are not displayed.");
		}

	}

}
