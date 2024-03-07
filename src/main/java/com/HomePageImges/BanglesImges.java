package com.HomePageImges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BanglesImges {

	public static WebDriver driver;

	// 5) .............. Bangles Image Xpath start.............//

	@FindBy(xpath = "//a[normalize-space()='Bangles']")
	WebElement NavBarBangles;

	// xpath of Bangles img
	@FindBy(xpath = "//app-category[@class='ng-star-inserted']//div[@class='row']//div[1]//div[1]")
	WebElement BanglesImg;

	// xpath of NosePins image Make An Offer
	@FindBy(xpath = "//button[normalize-space()='Make Offer']")
	WebElement makeanofferBangles;

	// xpath of Bangles image EnterPrice
	@FindBy(xpath = "//input[@placeholder='Enter Price']")
	WebElement EnterpriceBangles;

	// xpath of NosePins image Submit button
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submitBangles;

	// xpath of Bangles image pop button close
	@FindBy(xpath = "//button[@aria-label='Close']")
	WebElement popcloseBangles;

	// xpath of Bangles image Product Details Text --> name
	@FindBy(xpath = "//p[@class='product-paragraph']")
	WebElement ProductDetailsBangles;

	// xpath of Bangles image Product Details --> name
	@FindBy(xpath = "//p[normalize-space()='Bangles']")
	WebElement nameElementBangles;

	// xpath of Bangles image Product Details --> Price
	@FindBy(xpath = "//p[@class='product-info item-prices']")
	WebElement priceElementBangles;

	// xpath of Bangles image Product Details --> Carat
	@FindBy(xpath = "//p[normalize-space()='22 k']")
	WebElement caratElementBangles;

	// xpath of Bangles image Product Details --> Gross Grams
	@FindBy(xpath = "//p[normalize-space()='2 gms(Hallmark)']")
	WebElement grossGramsElementBangles;

	// xpath of Bangles image Product Details --> Gold Grams
	@FindBy(xpath = "(//p[@class='product-info'][normalize-space()='1 gms'])[1]")
	WebElement goldGramsElementBangles;

	// xpath of Bangles image Product Details --> Stone Grams
	@FindBy(xpath = "(//p[@class='product-info'][normalize-space()='1 gms'])[2]")
	WebElement stoneGramsElementBangles;

	// xpath of Bangles image Product Details --> Damage Description
	@FindBy(xpath = "//p[normalize-space()='Half damage']")
	WebElement damageDescriptionElementBangles;

	// xpath of seller Name
	@FindBy(xpath = "//p[normalize-space()='Rathod123']")
	WebElement SellerNameBangles;

	// xpath of Seller Years
	@FindBy(xpath = "//p[normalize-space()='1']")
	WebElement YearsBangles;

	// xpath of Seller Location
	@FindBy(xpath = "//p[normalize-space()=', dddfd,Secunderabad.']")
	WebElement LocationBangles;

	// xpath of seller Date
	@FindBy(xpath = "//p[normalize-space()='Feb 26, 2024']")
	WebElement DateBangles;

	// .............. Bangles Image Xpath End.............//

	// .......Pop up msg start........//

	@FindBy(xpath = "//div[contains(text(),'You already made the offer waiting for seller acce')]")
	WebElement message1;

	@FindBy(xpath = "//div[contains(text(),'This product is')]")
	WebElement message2;

	@FindBy(xpath = "//div[contains(text(),'Make offer completed successfully waiting for sell')]")
	WebElement message3;

	// .......Pop up msg End........//

	// images click class constructor
	public BanglesImges(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// 5: --> Bangles image click sent to the price and submit button click
	public void imageFiveclick(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		NavBarBangles.click();

		Thread.sleep(7000);

		BanglesImg.click();

		Thread.sleep(5000);

		// Find elements containing product details

		String ProductDetailss = ProductDetailsBangles.getText();

		String Necklacename = nameElementBangles.getText();

		String priceofelement = priceElementBangles.getText();

		String carat = caratElementBangles.getText();

		String grossGrams = grossGramsElementBangles.getText();

		String goldGrams = goldGramsElementBangles.getText();

		String stoneGrams = stoneGramsElementBangles.getText();

		String damageDescription = damageDescriptionElementBangles.getText();

		Thread.sleep(2000);
		// Seller Details

		String SellerName = SellerNameBangles.getText();
		String SellerYears = YearsBangles.getText();
		String Locations = LocationBangles.getText();
		String Date = DateBangles.getText();

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
