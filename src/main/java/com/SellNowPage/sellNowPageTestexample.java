package com.SellNowPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class sellNowPageTestexample {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	@FindBy(xpath = "(//button[@class='sell_btn'][normalize-space()='Sell Now'])[1]  | //ul[@class='header_section']//div//button[@class='sell_btn'][normalize-space()='Sell Now'] ")
	WebElement sellnowButton;

	@FindBy(xpath = "//input[@name='ownerName']")
	WebElement ownerName;

	@FindBy(xpath = "//input[@name='pincode']")
	WebElement pincode;

	@FindBy(xpath = "//select[@placeholder='Select Circle']")
	WebElement circle;

	@FindBy(xpath = "//textarea[@name='houseno']")
	WebElement HouseNoLandMark;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement continuebutton;

	@FindBy(xpath = "//select[contains(@name,'type')]")
	WebElement ProductType;

	@FindBy(xpath = "//select[@name='category']")
	WebElement category;

	@FindBy(xpath = "//select[@name='carat']")
	WebElement carat;

	@FindBy(xpath = "//input[@name='quantity']")
	WebElement Quantity;

	@FindBy(xpath = "//input[@name='gold_grams']")
	WebElement GoldGrams;

	@FindBy(xpath = "//input[@name='stone_grams']")
	WebElement StoneGrams;

	@FindBy(xpath = "//input[contains(@name,'yearUsed')]")
	WebElement productYears;

	@FindBy(xpath = "//input[@value='Full damage']")
	WebElement productdamagedescriptionfulldamage;

	@FindBy(xpath = "//textarea[@name='description']")
	WebElement productDescription;

	@FindBy(xpath = "//img[@class='cameraIcon']")
	WebElement UploadImages;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement continuebutton2;

	@FindBy(xpath = "//select[@placeholder='select type']")
	WebElement selectvaluertype;

	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submitbutton;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/section[1]/nav[1]/ul[1]/li[1] ")
	WebElement logo;

	public sellNowPageTestexample(WebDriver driver) {

		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}

	public void PersonalInformation() throws InterruptedException {
		Thread.sleep(8000);
		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		// executor.executeScript("arguments[0].click();", sellnowButton);

		sellnowButton.click();
		Thread.sleep(5000);
		ownerName.sendKeys("Shiv");
		Thread.sleep(5000);
		pincode.sendKeys("500016");

		Thread.sleep(4000);

		Select select = new Select(circle);
		Thread.sleep(4000);
		select.selectByVisibleText("Begumpet");

		Thread.sleep(4000);

		HouseNoLandMark.sendKeys("Beside richi bekari");

		continuebutton.click();

	}

	public void FillYourJewelleryDetails() throws InterruptedException {
		Thread.sleep(4000);
		Select select = new Select(ProductType);
		select.selectByVisibleText("Gold");
		Thread.sleep(4000);
		Select select1 = new Select(category);
		select1.selectByVisibleText("Necklace");
		Thread.sleep(4000);
		Select select2 = new Select(carat);
		select2.selectByVisibleText("22K");

		Thread.sleep(4000);
		Quantity.sendKeys("1");
		Thread.sleep(4000);
		GoldGrams.sendKeys("1");
		Thread.sleep(4000);
		StoneGrams.sendKeys("1");
		Thread.sleep(4000);

		productYears.sendKeys("1");
		Thread.sleep(4000);

		productdamagedescriptionfulldamage.click();
		Thread.sleep(4000);
		productDescription.sendKeys("this product is fullydamage");

	}

	public void fileupload() throws InterruptedException, AWTException {

		Thread.sleep(4000);

		// Scroll the page to bring Upload Images button into view
		js.executeScript("arguments[0].scrollIntoView(true);", UploadImages);
		Thread.sleep(2000);

		UploadImages.click();

		Thread.sleep(4000);

		// Scroll the page to bring Continue button into view
		js.executeScript("arguments[0].scrollIntoView(true);", continuebutton2);
		Thread.sleep(2000);

		// Wait for some time to ensure the file upload dialog appears
		Thread.sleep(3000);

		// Specify the file path of the file to be uploaded
		String filePath = "C:\\v_BuyAutomation\\download.jpg";

		// Copy the file path to the clipboard
		StringSelection stringSelection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		// Create Robot class instance
		Robot robot = new Robot();

		// Paste the file path from clipboard using CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// Press Enter to confirm the file upload
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		continuebutton2.click();
	}

	public void selectValuer() throws InterruptedException {
		Select select = new Select(selectvaluertype);
		Thread.sleep(4000);
		select.selectByVisibleText("Kalyan jwellers");
		Thread.sleep(4000);

		submitbutton.click();

		if (driver != null) {

			Thread.sleep(6000);

			driver.navigate().back();
		} else {
			System.out.println("WebDriver is null. Cannot navigate back.");
		}

	}

	public void PersonalInformationempty() throws InterruptedException {
		Thread.sleep(8000);
		// Click the Sell Now button
		sellnowButton.click();

		Thread.sleep(8000);
		continuebutton.click();

		Thread.sleep(3000);

		WebElement errorMessage = driver.findElement(By.xpath("//p[normalize-space()='Your Name is required']"));

		// Get the text of the error message
		String errorMessageText = errorMessage.getText();

		// Validate if the error message is displayed correctly
		Assert.assertEquals(errorMessageText, "Your Name is required", "Error message not displayed or incorrect");

	}

	// p[normalize-space()='Circle is required']

	// p[normalize-space()='Landmark is required']

}
