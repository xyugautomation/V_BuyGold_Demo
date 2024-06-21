package com.NavBarModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EarringsPage {
	@FindBy(xpath = "//a[normalize-space()='Earrings']")
	WebElement Earrings;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]")
	WebElement noProductFoundMsg;

	@FindBy(xpath = "//p[normalize-space()='Earrings']")
	WebElement EarringsProductSection;

	public static WebDriver driver;

	public EarringsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void EarringsProductTest() {

		try {
			// Add a simple wait using Thread.sleep() - not recommended for real test
			// automation
			Thread.sleep(5000); // Sleep for 5 seconds (adjust as needed)

			if (Earrings.isDisplayed()) {
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

	public void EarringsProductSection() throws InterruptedException {
		Thread.sleep(5000);
		Earrings.click();
		Thread.sleep(5000);
		if (EarringsProductSection.isDisplayed()) {
			System.out.println("Earrings products are displayed.");

		} else if (noProductFoundMsg.isDisplayed()) {
			System.out.println("Earrings product are not available");

		}

		else {
			System.out.println("Earrings products are not displayed.");
		}

	}
}
