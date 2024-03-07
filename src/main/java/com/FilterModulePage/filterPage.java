package com.FilterModulePage;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

public class filterPage {

	public static WebDriver driver;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-home[1]/section[1]/div[1]/div[2]/div[1]/select[1]")
	WebElement SelectCaret;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-home[1]/section[1]/div[1]/div[2]/div[2]/select[1]")
	WebElement selectWeight;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-home[1]/section[1]/div[1]/div[2]/div[3]/select[1]")
	WebElement selectPrice;

	@FindBy(xpath = "//button[normalize-space()='Reset'] | /html[1]/body[1]/app-root[1]/app-layout[1]/app-home[1]/section[1]/div[1]/div[1]/button[1]")
	WebElement Reset_Button;

	@FindBy(xpath = "//b[text()='No Product Found']")
	WebElement productnotfound;

	public filterPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void Filterss(WebDriver driver) throws InterruptedException {

		// select Caret Logic
		Thread.sleep(3000);

		for (int i = 0; i < 3; i++) {
			Thread.sleep(2000);
			Select dropdown = new Select(SelectCaret);
			dropdown.selectByIndex(i);
			System.out.println("Selected carat option: " + dropdown.getFirstSelectedOption().getText());
			Thread.sleep(2000);

			// Check if "Product not found" message appears
			boolean productNotFoundDisplayed = isProductNotFoundDisplayed();
			if (productNotFoundDisplayed) {
				System.out
						.println("Product not found for carat option: " + dropdown.getFirstSelectedOption().getText());

			} else {
				System.out.println("Product is found");
			}

			Reset_Button.click();
		}

		// select Weight Logic
		Thread.sleep(3000);
		for (int i = 0; i < 6; i++) {
			Thread.sleep(2000);

			Select dropdown1 = new Select(selectWeight);
			dropdown1.selectByIndex(i);

			System.out.println("Selected weight option: " + dropdown1.getFirstSelectedOption().getText());
			Thread.sleep(2000);

			boolean productNotFoundDisplayed = isProductNotFoundDisplayed();
			if (productNotFoundDisplayed) {
				System.out
						.println("Product not found for carat option: " + dropdown1.getFirstSelectedOption().getText());

			} else {
				System.out.println("Product is found");
			}

			Reset_Button.click();

		}

		// select Price Logic
		Thread.sleep(3000);
		for (int i = 0; i < 7; i++) {
			Thread.sleep(2000);

			// Select the price
			Select dropdown2 = new Select(selectPrice);
			dropdown2.selectByIndex(i);

			System.out.println("Selected price option: " + dropdown2.getFirstSelectedOption().getText());
			Thread.sleep(2000);
			// Check if "Product not found" message appears
			boolean productNotFoundDisplayed = isProductNotFoundDisplayed();
			if (productNotFoundDisplayed) {
				System.out
						.println("Product not found for carat option: " + dropdown2.getFirstSelectedOption().getText());

			} else {
				System.out.println("Product is found");
			}

		}

		Thread.sleep(3000);
		Reset_Button.click();
		// driver.close();

	}

	private boolean isProductNotFoundDisplayed() {
		try {

			return productnotfound.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;

		}
	}
}
