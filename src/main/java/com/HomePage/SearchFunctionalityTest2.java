package com.HomePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFunctionalityTest2 {
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/section[1]/nav[1]/ul[1]/li[2]/div[1]/input[1] | (//input[@placeholder='Search for jewellery'])[1]")
	WebElement searchInput;

	@FindBy(xpath="(//img[@class='header_logo'])[1]")
	WebElement logo;
	
	
	public static WebDriver driver;

	// Constructor to initialize PageFactory elements
	public SearchFunctionalityTest2(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void searchFunctionality() throws InterruptedException {
		// Adding some wait to ensure the element is present
	
	Thread.sleep(5000);
	searchInput.clear();

	Thread.sleep(5000);
	searchInput.sendKeys("Rings");

	Thread.sleep(5000);
	searchInput.clear();

	Thread.sleep(5000);
	searchInput.sendKeys("Earrings");

	Thread.sleep(5000);
	searchInput.clear();

	Thread.sleep(5000);
	searchInput.sendKeys("pendants");

	Thread.sleep(5000);
	searchInput.clear();

	searchInput.sendKeys("Bullion");

	Thread.sleep(5000);
	searchInput.clear();

	Thread.sleep(5000);
	searchInput.sendKeys("Others");

	
	
	Thread.sleep(5000);
	// negative data .....
	searchInput.clear();
	
	Thread.sleep(5000);
	searchInput.sendKeys("123avhfshf");

	searchInput.clear();
	
	logo.click();
	
}
}
