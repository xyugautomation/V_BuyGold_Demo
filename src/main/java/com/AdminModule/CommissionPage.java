package com.AdminModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommissionPage {

	@FindBy(xpath = "//h4[normalize-space()='Valuer List']")
	public static WebElement ValuerList;

	@FindBy(xpath = "//input[@placeholder='Search the data here...']")
	public static WebElement SearchBox;

	@FindBy(xpath = "//li[@class='pagination-next ng-star-inserted']//a[@class='ng-star-inserted']")
	public static WebElement NextButton;

	@FindBy(xpath = "(//button[@class='view-button'][normalize-space()='Pay Now'])[1]")
	public static WebElement PayNowButton;

	@FindBy(xpath = "//li[@class='pagination-previous ng-star-inserted']//a[@class='ng-star-inserted']	")
	public static WebElement PreviousButton;

	@FindBy(xpath = "//table[@class='table mt-4 text-center']//thead")
	public static WebElement TableTitle;

	public CommissionPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void UIElementDisplay() throws InterruptedException {
		Thread.sleep(2000);
		ValuerList.click();
		 
		
	}

	
	
}
