package com.NavBarModule;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BanglesPage {
	@FindBy(xpath = "//a[normalize-space()='Bangles']")
	WebElement Bangles;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]")
	WebElement noProductFoundMsg;

	@FindBy(xpath = "(//p[@class='diamond-shape'][normalize-space()='Bangles'])[1] | //body[1]/app-root[1]/app-layout[1]/app-category[1]/section[2]/div[1]/div[1]/div[1]/div[1]/p[1]")
	WebElement BanglesProductSection;

	public static WebDriver driver;

	public BanglesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void BanglesProductTest() {

		try {
			// Add a simple wait using Thread.sleep() - not recommended for real test
			// automation
			Thread.sleep(6000); // Sleep for 5 seconds (adjust as needed)

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
		try {

			// Check if driver is properly initialized
			if (driver == null) {
				System.out.println("WebDriver instance is not initialized.");
				return;
			}

			// Wait for the Bangles element to be clickable
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(Bangles)).click();

			// Wait for the BanglesProductSection or noProductFoundMsg element to be
			// displayed
			wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOf(BanglesProductSection),
					ExpectedConditions.visibilityOf(noProductFoundMsg)));

			if (BanglesProductSection.isDisplayed()) {
				System.out.println("Bangles products are displayed.");
			} else if (noProductFoundMsg.isDisplayed()) {
				System.out.println("Bangles products are not available");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Bangles products are not displayed.");
		}
	}
}