package com.ValuerModule;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingProductsPage {
	public static JavascriptExecutor js;
	public static Actions actions;

	@FindBy(xpath = "//p[@class='fs-5']")
	public static WebElement WaitingForApproval;

	@FindBy(xpath = "//table[@class='table']")
	public static WebElement TableText;

	@FindBy(xpath = "//ul[@class='ngx-pagination ng-star-inserted']")
	public static WebElement PreviousAndNext;

	@FindBy(xpath = "//h5[normalize-space()='No Product Found']")
	public static WebElement NoProductFound;

	@FindBy(xpath = "//span[normalize-space()='Pending Products']")
	public static WebElement SidemenuPendingProduct;

	@FindBy(xpath = "//tbody/tr[1]/td[9]/button[1]")
	public static WebElement ViewButton;

	@FindBy(xpath = "//input[@id='certificatepdf'] | //body[1]/app-root[1]/app-layout[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-productdetails[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public static WebElement fileupload;

	@FindBy(xpath = "//span[@class='ng-star-inserted']")
	public static WebElement acceptbutton;

	@FindBy(xpath = "//input[@formcontrolname='price']")
	public static WebElement valuerPrice;

	public PendingProductsPage(WebDriver driver) {

		this.js = (JavascriptExecutor) driver;
		this.actions = new Actions(driver);
		PageFactory.initElements(driver, this);

	}

	public void sidemenucommisonbuttonclick() throws InterruptedException {
		Thread.sleep(2000);
		SidemenuPendingProduct.click();

	}

	// Method to check visibility of WaitingForApproval
	public boolean isWaitingForApprovalDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return WaitingForApproval.isDisplayed();
	}

	// Method to check visibility of TableText
	public boolean isTableTextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return TableText.isDisplayed();
	}

	// Method to check visibility of PreviousAndNext
	public boolean isPreviousAndNextDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return PreviousAndNext.isDisplayed();
	}

	// Method to check visibility of NoProductFound
	public boolean isNoProductFoundDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		return NoProductFound.isDisplayed();
	}

	public void ViewButton(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		ViewButton.click();

	}

	public void fileupload(WebDriver driver) throws InterruptedException, AWTException {
		Thread.sleep(3000);
		WebElement fileInput = driver.findElement(By.xpath("//input[@id='certificatepdf'] | //body[1]/app-root[1]/app-layout[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-productdetails[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		String filePath = "C:\\v_BuyAutomation\\Coupon-Code.pdf";
        fileInput.sendKeys(filePath);
	}

	public void acceptButton() throws InterruptedException {
		Thread.sleep(2000);
		acceptbutton.click();

	}

	public void vluerprice(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		valuerPrice.clear();
		valuerPrice.sendKeys("8000");

	}	
	public void scrollThePageEnd(WebDriver driver) throws InterruptedException {

		try {

			Actions actions = new Actions(driver);

			for (int i = 0; i < 15; i++) {
				actions.sendKeys(Keys.ARROW_DOWN).perform();
				Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}