package com.HomePageImges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BraceletsImges {

	public static WebDriver driver;

	// 4) .............. Bracelets Image Xpath start.............//

	@FindBy(xpath = "//a[normalize-space()='Bracelets']")
	WebElement NavBarBracelets;

	// xpath of Bracelets img
	@FindBy(xpath = "//app-category[@class='ng-star-inserted']//div[@class='row']//div[1]//div[1]")
	WebElement BraceletsImg;

	// xpath of Bracelets image Make An Offer
	@FindBy(xpath = "//button[normalize-space()='Make Offer']")
	WebElement makeanofferBracelets;

	// xpath of Bracelets image EnterPrice
	@FindBy(xpath = "//input[@placeholder='Enter Price']")
	WebElement EnterpriceBracelets;

	// xpath of Bracelets image Submit button
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submitBracelets;

	// xpath of Bracelets image pop button close
	@FindBy(xpath = "//button[@aria-label='Close']")
	WebElement popcloseBracelets;

	// xpath of Bracelets image Product Details --> name
	@FindBy(xpath = "//p[normalize-space()='Bracelets']")
	WebElement nameElementBracelets;

	// xpath of Bracelets image Product Details Text --> name
	@FindBy(xpath = "//p[@class='product-paragraph']")
	WebElement ProductDetailsBracelets;

	// xpath of Bracelets image Product Details --> Price
	@FindBy(xpath = "//p[@class='product-info item-prices']")
	WebElement priceElementBracelets;

	// xpath of Bracelets image Product Details --> Carat
	@FindBy(xpath = "//p[normalize-space()='22 k']")
	WebElement caratElementBracelets;

	// xpath of Bracelets image Product Details --> Gross Grams
	@FindBy(xpath = "//p[normalize-space()='16 gms(Hallmark)']")
	WebElement grossGramsElementBracelets;

	// xpath of Bracelets image Product Details --> Gold Grams
	@FindBy(xpath = "//p[normalize-space()='12 gms']")
	WebElement goldGramsElementBracelets;

	// xpath of Bracelets image Product Details --> Stone Grams
	@FindBy(xpath = "//p[normalize-space()='4 gms']")
	WebElement stoneGramsElementBracelets;

	// xpath of Bracelets image Product Details --> Damage Description
	@FindBy(xpath = "//p[normalize-space()='partial damage']")
	WebElement damageDescriptionElementBracelets;

	// xpath of seller Name
	@FindBy(xpath = "//p[normalize-space()='Jesay']")
	WebElement SellerNameBracelets;

	// xpath of Seller Years
	@FindBy(xpath = "//p[normalize-space()='5']")
	WebElement YearsBracelets;

	// xpath of Seller Location
	@FindBy(xpath = "//p[normalize-space()=', 23-19,Hyderabad.']")
	WebElement LocationBracelets;

	// xpath of seller Date
	@FindBy(xpath = "//p[normalize-space()='Mar 1, 2024']")
	WebElement DateBracelets;

	// .............. Bracelets Image Xpath End.............//

	// images click class constructor
	public BraceletsImges(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// 4: --> Bracelets image click sent to the price and submit button click
	public void imageFourclick(WebDriver driver) throws InterruptedException {

		Thread.sleep(5000);
		NavBarBracelets.click();

		Thread.sleep(9000);

		BraceletsImg.click();

		Thread.sleep(5000);

		// Find elements containing product details

		String ProductDetailss = ProductDetailsBracelets.getText();

		String Necklacename = nameElementBracelets.getText();

		String priceofelement = priceElementBracelets.getText();

		String carat = caratElementBracelets.getText();

		String grossGrams = grossGramsElementBracelets.getText();

		String goldGrams = goldGramsElementBracelets.getText();

		String stoneGrams = stoneGramsElementBracelets.getText();

		String damageDescription = damageDescriptionElementBracelets.getText();

		Thread.sleep(2000);
		// Seller Details

		String SellerName = SellerNameBracelets.getText();
		String SellerYears = YearsBracelets.getText();
		String Locations = LocationBracelets.getText();
		String Date = DateBracelets.getText();

		// Output the extracted details
		System.out.println("Product Details:" + ProductDetailss);
		System.out.println("Name: " + Necklacename);
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

		navigateBack(driver);

	}

	public static void navigateBack(WebDriver driver) throws InterruptedException {

		Thread.sleep(5000);

		driver.navigate().back();
	}

}
