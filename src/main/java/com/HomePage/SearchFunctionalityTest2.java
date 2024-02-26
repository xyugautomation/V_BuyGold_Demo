package com.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFunctionalityTest2 {

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/section[1]/nav[1]/ul[1]/li[2]/div[1]/input[1] | (//input[@placeholder='Search for jewellery'])[1]")
	WebElement searchInput;

	@FindBy(xpath = "(//img[@class='header_logo'])[1]")
	WebElement logo;

	public static WebDriver driver;

	// Constructor to initialize PageFactory elements
	public SearchFunctionalityTest2(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void searchFunctionality() throws InterruptedException {
		// Adding some wait to ensure the element is present

		Thread.sleep(5000);
		searchInput.sendKeys("Necklace");

		System.out.println("On Home Page Necklace product is display...!!!");

		Thread.sleep(5000);
		searchInput.clear();

		Thread.sleep(5000);
		searchInput.sendKeys("Nose Pins");

		System.out.println("On Home Page Nose Pins product is display...!!!");

		Thread.sleep(5000);
		searchInput.clear();

		Thread.sleep(5000);
		searchInput.sendKeys("Chains");

		System.out.println("On Home Page Chains product is display...!!!");

		Thread.sleep(5000);
		searchInput.clear();

		Thread.sleep(5000);
		searchInput.sendKeys("Bracelets");

		System.out.println("On Home Page Bracelets product is display...!!!");

		Thread.sleep(5000);
		searchInput.clear();

		Thread.sleep(5000);
		searchInput.sendKeys("Bangles");

		System.out.println("On Home Page Bangles product is display...!!!");

		Thread.sleep(5000);
		searchInput.clear();

		Thread.sleep(5000);
		searchInput.sendKeys("Rings");

		System.out.println("On Home Page Rings product is display...!!!");

		Thread.sleep(5000);
		searchInput.clear();

		Thread.sleep(5000);
		searchInput.sendKeys("Earrings");

		System.out.println("On Home Page Earrings product is not display...!!!");

		Thread.sleep(5000);
		searchInput.clear();

		Thread.sleep(5000);
		searchInput.sendKeys("pendants");

		System.out.println("On Home Page pendants product is not display...!!!");

		Thread.sleep(5000);
		searchInput.clear();

		searchInput.sendKeys("Bullion");

		System.out.println("On Home Page Bullion product is display...!!!");

		Thread.sleep(5000);
		searchInput.clear();

		Thread.sleep(5000);
		searchInput.sendKeys("Others");

		System.out.println("On Home Page Others product is display...!!!");

		Thread.sleep(5000);
		// negative data .....
		searchInput.clear();

		Thread.sleep(5000);
		searchInput.sendKeys("123avhfshf");

		System.out.println("On Home Page 123avhfshf product is not display...!!!");

		searchInput.clear();

		Thread.sleep(5000);
		logo.click();

		System.out.println("Back to The Home Page All Product are display...!!!");
	}
}
