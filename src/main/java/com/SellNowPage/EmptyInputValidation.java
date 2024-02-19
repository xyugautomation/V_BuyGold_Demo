package com.SellNowPage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

public class EmptyInputValidation {

	public static WebDriver driver;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement continueButton;

	@FindBy(xpath = "(//button[@class='sell_btn'][normalize-space()='Sell Now'])[1]  | //ul[@class='header_section']//div//button[@class='sell_btn'][normalize-space()='Sell Now'] ")
	WebElement sellnowButton;

	public EmptyInputValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void PersonalInformationempty() throws InterruptedException {
		Thread.sleep(8000);
		// Click the Sell Now button
		sellnowButton.click();

		Thread.sleep(8000);
		continueButton.click();

		Thread.sleep(3000);

		WebElement errorMessage = driver.findElement(By.xpath("//p[normalize-space()='Your Name is required']"));

		// Get the text of the error message
		String errorMessageText = errorMessage.getText();

		// Validate if the error message is displayed correctly
		Assert.assertEquals(errorMessageText, "Your Name is required", "Error message not displayed or incorrect");

	}

}
