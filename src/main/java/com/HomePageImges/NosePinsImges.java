package com.HomePageImges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NosePinsImges {
	public static WebDriver driver;

	// 3) .............. NosePins Image Xpath start.............//

	// xpath of NosePins img

	@FindBy(xpath = "//a[normalize-space()='Nose Pins']")
	WebElement NavBarNosePins;

	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/app-category[1]/section[2]/div[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement NosePinsImg;

	// xpath of NosePins image Make An Offer
	@FindBy(xpath = "//button[normalize-space()='Make Offer']")
	WebElement makeanofferNosePins;

	// xpath of NosePins image EnterPrice
	@FindBy(xpath = "//input[@placeholder='Enter Price']")
	WebElement EnterpriceNosePins;

	// xpath of NosePins image Submit button
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submitNosePins;

	// xpath of NosePins image pop button close
	@FindBy(xpath = "//button[@aria-label='Close']")
	WebElement popcloseNosePins;

	// xpath of NosePins image Product Details --> name
	@FindBy(xpath = "//p[normalize-space()='Nose Pins']")
	WebElement nameElementNosePins;

	// xpath of NosePins image Product Details Text --> name
	@FindBy(xpath = "//p[@class='product-paragraph']")
	WebElement ProductDetailsNosePins;

	// xpath of NosePins image Product Details --> Price
	@FindBy(xpath = "//p[@class='product-info item-prices']")
	WebElement priceElementNosePins;

	// xpath of NosePins image Product Details --> Carat
	@FindBy(xpath = "//p[normalize-space()='24 k']")
	WebElement caratElementNosePins;

	// xpath of NosePins image Product Details --> Gross Grams
	@FindBy(xpath = "//p[normalize-space()='9 gms(Hallmark)']")
	WebElement grossGramsElementNosePins;

	// xpath of NosePins image Product Details --> Gold Grams
	@FindBy(xpath = "//p[normalize-space()='9 gms']")
	WebElement goldGramsElementNosePins;

	// xpath of NosePins image Product Details --> Stone Grams
	@FindBy(xpath = "//p[normalize-space()='0 gms']")
	WebElement stoneGramsElementNosePins;

	// xpath of NosePins image Product Details --> Damage Description
	@FindBy(xpath = "//p[normalize-space()='partial damage']")
	WebElement damageDescriptionElementNosePins;

	// xpath of seller Name
	@FindBy(xpath = "//p[normalize-space()='qwewrq']")
	WebElement SellerNameNosePins;

	// xpath of Seller Years
	@FindBy(xpath = "//p[normalize-space()='7']")
	WebElement YearsNosePins;

	// xpath of Seller Location
	@FindBy(xpath = "//p[normalize-space()=', 1-456-2,Hyderabad.']")
	WebElement LocationNosePins;

	// xpath of seller Date
	@FindBy(xpath = "//p[normalize-space()='Mar 2, 2024']")
	WebElement DateNosePins;

	// .............. NosePins Image Xpath End.............//

	// images click class constructor
	public NosePinsImges(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// 3: --> Nose Pins image click sent to the price and submit button click
	public void imageThreeclick(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		NavBarNosePins.click();

		Thread.sleep(7000);

		NosePinsImg.click();

		Thread.sleep(5000);

		// Find elements containing product details

		String ProductDetailss = ProductDetailsNosePins.getText();

		String Necklacename = nameElementNosePins.getText();

		String priceofelement = priceElementNosePins.getText();

		String carat = caratElementNosePins.getText();

		String grossGrams = grossGramsElementNosePins.getText();

		String goldGrams = goldGramsElementNosePins.getText();

		String stoneGrams = stoneGramsElementNosePins.getText();

		String damageDescription = damageDescriptionElementNosePins.getText();

		Thread.sleep(2000);
		// Seller Details

		String SellerName = SellerNameNosePins.getText();
		String SellerYears = YearsNosePins.getText();
		String Locations = LocationNosePins.getText();
		String Date = DateNosePins.getText();

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
