package com.sprint2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class imagesclick {

	public static WebDriver driver;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/section[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]")
	WebElement Braceletsimg;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/div[2]/button[2]")
	WebElement makeanofferBraceletsl;

	@FindBy(xpath = "//input[@placeholder='Enter Price']")
	WebElement Enterprice;

	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submit;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/section[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[4]/div[1]/div[1]/img[1]")
	WebElement bullionimg;

	@FindBy(xpath = "//button[@aria-label='Close']")
	WebElement popclose;

	@FindBy(xpath = "//div[@class='product_info']//p[contains(text(),'Carat')]")
	WebElement carattext;

	@FindBy(xpath = "//div[contains(text(),'You already made the offer waiting for seller acce')]")
	WebElement message1;

	@FindBy(xpath = "//div[contains(text(),'This product is')]")
	WebElement message2;

	@FindBy(xpath = "//div[contains(text(),'Make offer completed successfully waiting for sell')]")
	WebElement message3;

	@FindBy(xpath = "//div[@class='product_info']//p[contains(text(),'Bracelets')]")
	WebElement nameElement;

	@FindBy(xpath = "//div[@class='product_info']//p[@class='price']")
	WebElement priceElement;

	@FindBy(xpath = "//section[@class='details-tab-view']//p[3]//span[1]")
	WebElement caratElement;

	@FindBy(xpath = "//div[@class='product_info']//p[contains(text(),'Gross grams')]")
	WebElement grossGramsElement;

	@FindBy(xpath = "//div[@class='desktop-view-details row']//p[3]//span[1]")
	WebElement goldGramsElement;

	@FindBy(xpath = "//div[@class='desktop-view-details row']//p[4]//span[1]")
	WebElement stoneGramsElement;

	@FindBy(xpath = "//div[@class='product_info']//span[contains(text(),'partial damage')]")
	WebElement damageDescriptionElement;

	// imagesclick class constructor
	public imagesclick(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// 1: --> Bracelets image click sent to the price and submit button click
	public void imageoneclick() throws InterruptedException {
		Thread.sleep(7000);

		Braceletsimg.click();

		Thread.sleep(5000);

		// Find elements containing product details

		// Extract text from elements
		String[] nameTokens = nameElement.getText().split(":");
		String name = (nameTokens.length > 1) ? nameTokens[1].trim() : "";

		String[] priceTokens = priceElement.getText().split(":");
		String price = (priceTokens.length > 1) ? priceTokens[1].trim() : "";

		String[] caratTokens = caratElement.getText().split(":");
		String carat = (caratTokens.length > 1) ? caratTokens[1].trim() : "";
//
//		String[] grossGramsTokens = grossGramsElement.getText().split(":");
//		String grossGrams = (grossGramsTokens.length > 1) ? grossGramsTokens[1].trim() : "";

		String[] goldGramsTokens = goldGramsElement.getText().split(":");
		String goldGrams = (goldGramsTokens.length > 1) ? goldGramsTokens[1].trim() : "";

		String[] stoneGramsTokens = stoneGramsElement.getText().split(":");
		String stoneGrams = (stoneGramsTokens.length > 1) ? stoneGramsTokens[1].trim() : "";

		String[] damageDescriptionTokens = damageDescriptionElement.getText().split(":");
		String damageDescription = (damageDescriptionTokens.length > 1) ? damageDescriptionTokens[1].trim() : "";

		// Output the extracted details
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Carat: " + carat);
		// System.out.println("Gross grams: " + grossGrams);
		System.out.println("Gold grams: " + goldGrams);
		System.out.println("Stone grams: " + stoneGrams);
		System.out.println("Damage Description: " + damageDescription);

//		makeanofferBraceletsl.click();
//		Thread.sleep(5000);
//		Enterprice.sendKeys("49000");
//		Thread.sleep(5000);
//		submit.click();
//
//		
//		
//		
//		
//		
//		Thread.sleep(5000);
//		popclose.click();
//		
//		
//
//		// Check if only message3 is displayed and the other messages are not displayed
//		if (message3.isDisplayed() && !message1.isDisplayed() && !message2.isDisplayed()) {
//			System.out.println("Make offer completed successfully waiting for sell displayed.==> Test case passed.");
//		} else {
//			System.out.println(
//					"Make offer completed successfully waiting for sell not displayed or other messages are displayed.===> Test case failed.");
//		}
//
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// 2: --> bullion image click sent to the price and submit button click
	public void imageTwoclick() throws InterruptedException {
		Thread.sleep(5000);

		bullionimg.click();

	}

	// 3: --> Chains image click sent to the price and submit button click
	public void imageThreeclick() throws InterruptedException {
		Thread.sleep(5000);

	}

	// 4: --> Necklace image click sent to the price and submit button click
	public void imageFourclick() throws InterruptedException {
		Thread.sleep(5000);

	}

	// 5: --> Nose Pins image click sent to the price and submit button click
	public void imagefiveclick() throws InterruptedException {
		Thread.sleep(5000);

	}

	public void navigateBack() {
		driver.navigate().back();
	}

}
