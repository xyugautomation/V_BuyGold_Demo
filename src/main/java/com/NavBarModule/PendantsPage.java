package com.NavBarModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendantsPage {
	@FindBy(xpath = "//a[normalize-space()='Pendants']")
	WebElement Pendants;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]")
	WebElement noProductFoundMsg;

	@FindBy(xpath = "(//p[normalize-space()='Pendants'])")
	WebElement PendantsProductSection;

	public static WebDriver driver;

	public PendantsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void PendantsProductTest() {

		try {
			// Add a simple wait using Thread.sleep() - not recommended for real test
			// automation
			Thread.sleep(5000); // Sleep for 5 seconds (adjust as needed)

			if (Pendants.isDisplayed()) {
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

	public void PendantsProductSection() throws InterruptedException {
		Thread.sleep(5000);
		Pendants.click();
		Thread.sleep(5000);
		if (PendantsProductSection.isDisplayed()) {
			System.out.println("Pendants products are displayed.");

		} else if (noProductFoundMsg.isDisplayed()) {
			System.out.println("Pendants product are not available");

		}

		else {
			System.out.println("Pendants products are not displayed.");
		}

	}
}
