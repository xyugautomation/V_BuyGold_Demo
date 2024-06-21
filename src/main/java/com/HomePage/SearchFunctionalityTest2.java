package com.HomePage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFunctionalityTest2 {

	public static WebDriver driver;

	@FindBy(xpath = "(//p[@class='diamond-shape'][normalize-space()='Chains'])[1]")
	WebElement searchInputChains;

	@FindBy(xpath = "(//p[@class='diamond-shape'][normalize-space()='Bangles'])[1]")
	WebElement searchInputBangles;

	@FindBy(xpath = "(//p[@class='diamond-shape'][normalize-space()='Bracelets'])[1]")
	WebElement searchInputBracelets;

	@FindBy(xpath = "(//p[@class='diamond-shape'][normalize-space()='Earrings'])[1]")
	WebElement searchInputEarrings;

	@FindBy(xpath = "(//p[@class='diamond-shape'][normalize-space()='Pendants'])[1]")
	WebElement searchInputPendants;

	@FindBy(xpath = "(//p[@class='diamond-shape'][normalize-space()='Bullion'])[1]")
	WebElement searchInputBullion;

	@FindBy(xpath = "(//p[@class='diamond-shape'][normalize-space()='Others'])[1]")
	WebElement searchInputOthers;

	@FindBy(xpath = "//nav[@class='header_webview']//input[@placeholder='Search for jewellery']")
	WebElement searchInput;

	@FindBy(xpath = "//b[normalize-space()='No Product Found']")
	WebElement productNotFound;

	@FindBy(xpath = "(//p[@class='diamond-shape'][normalize-space()='Rings'])[1]")
	WebElement searchInputRings;

	@FindBy(xpath = "(//p[@class='diamond-shape'][normalize-space()='Nose Pins'])[1]")
	WebElement searchInputNosePins;

	@FindBy(xpath = "(//p[@class='diamond-shape'][normalize-space()='Necklace'])[1]")
	WebElement searchInputNecklace;

	@FindBy(xpath = "(//img[@class='header_logo'])[1]")
	WebElement logo;

	public WebDriverWait wait;

	public SearchFunctionalityTest2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void searchForItemChains() throws InterruptedException {
		Thread.sleep(2000);
		searchInput.sendKeys("Chains");
		Thread.sleep(4000);
		if (searchInputChains.isDisplayed()) {
			System.out.println("Product is Display");
			Thread.sleep(2000);
		} else if (productNotFound.isDisplayed()) {
			System.out.println("Product is not displaying");
		}

	}

	public void searchForItemNosePins(WebDriver driver) {
		try {
			Thread.sleep(5000);

			searchInput = driver.findElement(
					By.xpath("//nav[@class='header_webview']//input[@placeholder='Search for jewellery']"));
			searchInput.sendKeys("NosePins");

			Thread.sleep(5000);

			productNotFound = driver.findElement(By.xpath("//b[normalize-space()='No Product Found']"));

			Thread.sleep(20000);

			if (driver.findElements(By.xpath("(//p[@class='diamond-shape'][normalize-space()='Nose Pins'])[1]"))
					.size() > 0) {
				System.out.println("Product is Display");
			} else if (productNotFound.isDisplayed()) {
				System.out.println("Product is not displaying");
			}
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
		}

	}

	public void searchForItemsearchInputNecklace(WebDriver driver) {
		try {
			Thread.sleep(5000);

			searchInput = driver.findElement(
					By.xpath("//nav[@class='header_webview']//input[@placeholder='Search for jewellery']"));
			searchInput.sendKeys("Necklace");

			Thread.sleep(5000);

			productNotFound = driver.findElement(By.xpath("//b[normalize-space()='No Product Found']"));

			Thread.sleep(20000);

			if (driver.findElements(By.xpath("(//p[@class='diamond-shape'][normalize-space()='Necklace'])[1]"))
					.size() > 0) {
				System.out.println("Product is Display");
			} else if (productNotFound.isDisplayed()) {
				System.out.println("Product is not displaying");
			}

		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
		}

	}

}