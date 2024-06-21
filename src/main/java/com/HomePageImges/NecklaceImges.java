package com.HomePageImges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NecklaceImges {

	// 2).............. Necklace Image Xpath start.............//

	@FindBy(xpath = "//a[normalize-space()='Necklace']")
	WebElement NavBarNecklace;

	@FindBy(xpath = "//div[@class='row']//div[1]//div[1]//img[1]")
	WebElement NecklaceImg;

	// xpath of Necklace image Make An Offer
	@FindBy(xpath = "//button[normalize-space()='Make Offer']")
	WebElement makeanofferNecklace;

	// xpath of Necklace image EnterPrice
	@FindBy(xpath = "//input[@placeholder='Enter Price']")
	WebElement EnterpriceNecklace;

	// xpath of Necklace image Submit button
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submitNecklace;

	// xpath of Necklace image pop button close
	@FindBy(xpath = "//button[@aria-label='Close']")
	WebElement popcloseNecklace;

	// xpath of Necklace image Product Details --> name
	@FindBy(xpath = "//p[normalize-space()='Necklace']")
	WebElement nameElementNecklace;

	@FindBy(xpath = "//p[@class='product-paragraph']")
	WebElement ProductDetailsNecklace;

	// xpath of Necklace image Product Details --> Price
	@FindBy(xpath = "//p[@class='product-info item-prices']")
	WebElement priceElementNecklace;

	// xpath of Necklace image Product Details --> Carat
	@FindBy(xpath = "//p[normalize-space()='22 k']")
	WebElement caratElementNecklace;

	// xpath of Necklace image Product Details --> Gross Grams
	@FindBy(xpath = "//p[normalize-space()='2 gms(Hallmark)']")
	WebElement grossGramsElementNecklace;

	// xpath of Necklace image Product Details --> Gold Grams
	@FindBy(xpath = "(//p[@class='product-info'][normalize-space()='1 gms'])[1]")
	WebElement goldGramsElementNecklace;

	// xpath of Necklace image Product Details --> Stone Grams
	@FindBy(xpath = "(//p[@class='product-info'][normalize-space()='1 gms'])[2]")
	WebElement stoneGramsElementNecklace;

	// xpath of Necklace image Product Details --> Damage Description
	@FindBy(xpath = "//p[normalize-space()='partial damage']")
	WebElement damageDescriptionElementNecklace;

	// xpath of Seller Details Title

	// xpath of seller Name
	@FindBy(xpath = "//p[normalize-space()='Karthik']")
	WebElement SellerNameNecklace;

	// xpath of Seller Years
	@FindBy(xpath = "//p[normalize-space()='1']")
	WebElement YearsNecklace;

	// xpath of Seller Location
	@FindBy(xpath = "//p[normalize-space()=', 143,Hyderabad.']")
	WebElement LocationNecklace;

	// xpath of seller Date
	@FindBy(xpath = "//p[normalize-space()='Mar 2, 2024']")
	WebElement DateNecklace;

	// .............. Necklace Image Xpath End.............//

	// images click class constructor
	public NecklaceImges(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// 2: --> Necklace image click sent to the price and submit button click
	public void imageTwoclick(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		NavBarNecklace.click();

		Thread.sleep(9000);

		NecklaceImg.click();

		Thread.sleep(5000);

		// Find elements containing product details

		String ProductDetailss = ProductDetailsNecklace.getText();

		String Necklacename = nameElementNecklace.getText();

		String priceofelement = priceElementNecklace.getText();

		String carat = caratElementNecklace.getText();

		String grossGrams = grossGramsElementNecklace.getText();

		String goldGrams = goldGramsElementNecklace.getText();

		String stoneGrams = stoneGramsElementNecklace.getText();

		String damageDescription = damageDescriptionElementNecklace.getText();

		Thread.sleep(2000);

		// Seller Details

		String SellerName = SellerNameNecklace.getText();
		String SellerYears = YearsNecklace.getText();
		String Locations = LocationNecklace.getText();
		String Date = DateNecklace.getText();

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
