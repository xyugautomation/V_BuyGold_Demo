package com.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageProductTest {
	@FindBy(xpath = "//a[normalize-space()='Necklace']")
	WebElement Necklace;

	@FindBy(xpath = "//a[normalize-space()='Nose Pins']")
	WebElement NosePins;

	@FindBy(xpath = "//a[normalize-space()='Chains']")
	WebElement Chains;

	@FindBy(xpath = "//a[normalize-space()='Bracelets']")
	WebElement Bracelets;

	@FindBy(xpath = "//a[normalize-space()='Bangles']")
	WebElement Bangles;

	@FindBy(xpath = "//a[normalize-space()='Rings']")
	WebElement Rings;

	@FindBy(xpath = "//a[normalize-space()='Earrings']")
	WebElement Earrrings;

	@FindBy(xpath = "//a[normalize-space()='Pendants']")
	WebElement Pendants;

	@FindBy(xpath = "//a[normalize-space()='Bullion']")
	WebElement Bullion;

	@FindBy(xpath = "//a[normalize-space()='Others']")
	WebElement Others;

	HomePageProductTest() {

	}

	public void productdisplayNecklaceNosePins() {
		// Check if the necklace and bracelet product elements are displayed
		if (Necklace.isDisplayed() && NosePins.isDisplayed()) {
			System.out.println("Necklace and bracelet products are displayed on the home page.");
		} else {
			System.out.println("Necklace and/or bracelet products are not displayed on the home page.");
		}

	}

	public void productdisplayChainsBracelets() {
		// Check if the necklace and bracelet product elements are displayed
		if (Chains.isDisplayed() && Bracelets.isDisplayed()) {
			System.out.println("Necklace and bracelet products are displayed on the home page.");
		} else {
			System.out.println("Necklace and/or bracelet products are not displayed on the home page.");
		}

	}

	public void productdisplayBanglesRings() {
		// Check if the necklace and bracelet product elements are displayed
		if (Bangles.isDisplayed() && Rings.isDisplayed()) {
			System.out.println("Necklace and bracelet products are displayed on the home page.");
		} else {
			System.out.println("Necklace and/or bracelet products are not displayed on the home page.");
		}

	}

	public void productdisplayEarrringsPendants() {
		// Check if the necklace and bracelet product elements are displayed
		if (Earrrings.isDisplayed() && Pendants.isDisplayed()) {
			System.out.println("Necklace and bracelet products are displayed on the home page.");
		} else {
			System.out.println("Necklace and/or bracelet products are not displayed on the home page.");
		}

	}

	public void productdisplayBullionOthers() {
		// Check if the necklace and bracelet product elements are displayed
		if (Bullion.isDisplayed() && Others.isDisplayed()) {
			System.out.println("Necklace and bracelet products are displayed on the home page.");
		} else {
			System.out.println("Necklace and/or bracelet products are not displayed on the home page.");
		}

	}
}
