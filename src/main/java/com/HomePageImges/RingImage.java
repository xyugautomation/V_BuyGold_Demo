package com.HomePageImges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RingImage {

	public static WebDriver driver;

	// 1).............. Rings Image Xpath start.............//

	// xpath of Ring image

	@FindBy(xpath = "//a[normalize-space()='Rings']")
	WebElement NavBarRings;

	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/app-category[1]/section[2]/div[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement Rings;

	// xpath of Rings image Make An Offer
	@FindBy(xpath = "//button[normalize-space()='Make Offer']")
	WebElement makeanofferRings;

	// xpath of Rings image EnterPrice
	@FindBy(xpath = "//input[@placeholder='Enter Price']")
	WebElement Enterprice;

	// xpath of Rings image Submit button
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submit;

	// xpath of Rings image pop button close
	@FindBy(xpath = "//button[@aria-label='Close']")
	WebElement popclose;

	@FindBy(xpath = "//p[@class='product-paragraph']")
	WebElement ProductDetailsRing;

	// xpath of Rings image Product Details --> name
	@FindBy(xpath = "//p[normalize-space()='Rings']")
	WebElement nameElement;

	// xpath of Rings image Product Details --> Price
	@FindBy(xpath = "//p[@class='product-info item-prices']")
	WebElement priceElement;

	// xpath of Rings image Product Details --> Carat
	@FindBy(xpath = "//p[normalize-space()='22 k']")
	WebElement caratElement;

	// xpath of Rings image Product Details --> Gross Grams
	@FindBy(xpath = "//p[normalize-space()='2 gms(Hallmark)']")
	WebElement grossGramsElement;

	// xpath of Rings image Product Details --> Gold Grams
	@FindBy(xpath = "//p[normalize-space()='1 gms']")
	WebElement goldGramsElement;

	// xpath of Rings image Product Details --> Stone Grams
	@FindBy(xpath = "//p[normalize-space()='1 gms']")
	WebElement stoneGramsElement;

	// xpath of Rings image Product Details --> Damage Description
	@FindBy(xpath = "//p[normalize-space()='full damage']")
	WebElement damageDescriptionElement;

	// xpath of Seller Details Title
	@FindBy(xpath = "//p[@class='seller-paragraph']")
	WebElement SellerNameTitle;

	// xpath of seller Name
	@FindBy(xpath = "//p[normalize-space()='k']")
	WebElement SellerNameRing;

	// xpath of Seller Years
	@FindBy(xpath = "//p[normalize-space()='1']")
	WebElement YearsRing;

	// xpath of Seller Location
	@FindBy(xpath = "//p[normalize-space()=', 118,Hyderabad.']")
	WebElement LocationRing;

	// xpath of seller Date
	@FindBy(xpath = "//p[normalize-space()='Feb 27, 2024']")
	WebElement DateRing;

	// .............. Rings Image Xpath End.............//

	// images click class constructor
	public RingImage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// 1: --> Rings image click sent to the price and submit button click
	public void imageoneclick(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		NavBarRings.click();

		Thread.sleep(7000);

		Rings.click();

		Thread.sleep(5000);

		// Find elements containing product details
		// Product Details
		String ProductDetailss = ProductDetailsRing.getText();

		String Ringname = nameElement.getText();

		String priceofelement = priceElement.getText();

		String carat = caratElement.getText();

		String grossGrams = grossGramsElement.getText();

		String goldGrams = goldGramsElement.getText();

		String stoneGrams = stoneGramsElement.getText();

		String damageDescription = damageDescriptionElement.getText();

		Thread.sleep(2000);

		// Seller Details

		String SellerName = SellerNameRing.getText();
		String SellerYears = YearsRing.getText();
		String Locations = LocationRing.getText();
		String Date = DateRing.getText();

		// Output the extracted details

		System.out.println("Out Put of the product Details");
		System.out.println("Product Details:" + ProductDetailss);
		System.out.println("Name: " + Ringname);
		System.out.println("Price: " + priceofelement);
		System.out.println("Carat: " + carat);
		System.out.println("Gross grams: " + grossGrams);
		System.out.println("Gold grams: " + goldGrams);
		System.out.println("Stone grams: " + stoneGrams);
		System.out.println("Damage Description: " + damageDescription);

		System.out.println("------------------------------------------------");

		System.out.println("Output of the seller Details");
		System.out.println("Seller Name" + SellerName);
		System.out.println("Seller years" + SellerYears);
		System.out.println("Seller Location" + Locations);
		System.out.println("Seller Date" + Date);

//			makeanofferRings.click();
//			Thread.sleep(5000);
//			Enterprice.sendKeys("49000");
//			Thread.sleep(5000);
//			submit.click();
//			Thread.sleep(5000);
//			popclose.click();
//			Thread.sleep(5000);

		navigateBack(driver);

	}

	public static void navigateBack(WebDriver driver) throws InterruptedException {

		Thread.sleep(5000);

		driver.navigate().back();
	}

}
