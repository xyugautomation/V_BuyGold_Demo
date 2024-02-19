package com.NavBarModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class BanglesPage {
	@FindBy(xpath = "//a[normalize-space()='Bangles']")
	WebElement Bangles;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]")
	WebElement noProductFoundMsg;

	@FindBy(xpath = "(//p[contains(text(),'Bangles')])") 
	WebElement BanglesProductSection;

	public static WebDriver driver;

	public BanglesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void BanglesProductTest() {

		try {
			// Add a simple wait using Thread.sleep() - not recommended for real test
			// automation
			Thread.sleep(5000); // Sleep for 5 seconds (adjust as needed)

			if (Bangles.isDisplayed()) {
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

	public void BanglesProductSection() throws InterruptedException {
		Thread.sleep(5000);
		Bangles.click();
		Thread.sleep(5000);
		if (BanglesProductSection.isDisplayed()) {
			System.out.println("Bangles products are displayed.");

		} else if (noProductFoundMsg.isDisplayed()) {
			System.out.println("Bangles product are not available");

		}

		else {
			System.out.println("Bangles products are not displayed.");
		}

	}

	
}
