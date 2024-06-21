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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.ValuerModule.PendingProductsPage;
import com.ValuerModule.Valuer_Login;

public class sellNowPageTestexample {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static PendingProductsPage pendingproductpage;
	public static Valuer_Login vlogin;

	@FindBy(xpath = "(//button[@class='sell_btn'][normalize-space()='Sell Now'])[1]  | //ul[@class='header_section']//div//button[@class='sell_btn'][normalize-space()='Sell Now'] ")
	WebElement sellnowButton;

	@FindBy(xpath = "//input[@id='fname']")
	WebElement ownerName;

	@FindBy(xpath = "(//input[@id='lname'])[1]")
	WebElement pincode;

	@FindBy(xpath = "//p[normalize-space()='Begumpet']//input[@type='radio']")
	WebElement circle;

	@FindBy(xpath = "//textarea[@formcontrolname='locality']")
	WebElement HouseNoLandMark;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement continuebutton;

	@FindBy(xpath = "(//select[@id='fname'])[1]")
	WebElement ProductType;

	@FindBy(xpath = "(//select[@id='fname'])[2]")
	WebElement category;

	@FindBy(xpath = "//select[@formcontrolname='carat']")
	WebElement carat;

	@FindBy(xpath = "//input[@formcontrolname='quantity']")
	WebElement Quantity;

	@FindBy(xpath = "//input[@formcontrolname='gold_grams']")
	WebElement GoldGrams;

	@FindBy(xpath = "//input[@formcontrolname='stone_grams']")
	WebElement StoneGrams;

	@FindBy(xpath = "//input[@formcontrolname='yearUsed']")
	WebElement productYears;

	@FindBy(xpath = "//input[@value='Full damage']")
	WebElement productdamagedescriptionfulldamage;

	@FindBy(xpath = "//textarea[@id='lname']")
	WebElement productDescription;

	@FindBy(xpath = "//div[@class='col-md-4' or @class='inputWrapper']")
	WebElement ChooseFile;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement continuebutton2;

	@FindBy(xpath = "//button[normalize-space()='Select Valuer']")
	WebElement selectvaluer;

	@FindBy(xpath = "//h6[@class='gold-paras' and text()='Shiv_Patil']")
	WebElement Shiv_valuerclick;

	@FindBy(xpath = "//button[normalize-space()='Ok']")
	WebElement AcceptOkButton;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "//button[normalize-space()='Go To Dashboard']")
	WebElement GoToDashBoard;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/section[1]/nav[1]/ul[1]/li[1] ")
	WebElement logo;

	public sellNowPageTestexample(WebDriver driver) {

		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}

	public void PersonalInformation() throws InterruptedException {
		Thread.sleep(4000);
		sellnowButton.click();
		Thread.sleep(5000);
		ownerName.sendKeys("Shiv");
		Thread.sleep(5000);
		pincode.sendKeys("500016");
		Thread.sleep(4000);
		// Select select = new Select(circle);
		Thread.sleep(4000);
		circle.click();
		// select.selectByVisibleText("Begumpet");
		Thread.sleep(4000);
		HouseNoLandMark.sendKeys("Beside richi bekari");
		continuebutton.click();

	}

	public void PersonalInformationempty() throws InterruptedException {
		Thread.sleep(8000);
		sellnowButton.click();
		Thread.sleep(8000);
		continuebutton.click();
		Thread.sleep(3000);
		WebElement errorMessage = driver.findElement(By.xpath("//p[normalize-space()='Your Name is required']"));
		String errorMessageText = errorMessage.getText();
		Assert.assertEquals(errorMessageText, "Your Name is required", "Error message not displayed or incorrect");
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
		select2.selectByIndex(1);
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
		productDescription.sendKeys("this product is fully damage");

	}

	public void fileupload() throws InterruptedException, AWTException {
		Long documentHeight = (Long) js
				.executeScript("return Math.max(" + "document.body.scrollHeight, document.documentElement.scrollHeight,"
						+ "document.body.offsetHeight, document.documentElement.offsetHeight,"
						+ "document.body.clientHeight, document.documentElement.clientHeight);");
		js.executeScript("window.scrollTo(0, arguments[0]);", documentHeight);
		Thread.sleep(5000);
		ChooseFile.click();
		Thread.sleep(2000);
		String filePath = "C:\\v_BuyAutomation\\download.jpg";
		Robot robot = new Robot();
		StringSelection stringSelection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	private void scrollElementIntoView(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
	}

	public void scrollToBottom(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void selectValuer(WebDriver driver) throws InterruptedException {
		scrollToBottom(driver);
		if (driver == null) {
			throw new IllegalArgumentException("Driver must be initialized before calling selectValuer method.");
		}

		Thread.sleep(4000);
		selectvaluer.click();
		Thread.sleep(4000);
		scrollToBottom(driver);
		scrollElementIntoView(driver, Shiv_valuerclick);
		Thread.sleep(4000);
		Shiv_valuerclick.click();
		Thread.sleep(4000);
		AcceptOkButton.click();
		Thread.sleep(4000);
		saveButton.click();
		Thread.sleep(4000);
		GoToDashBoard.click();
	}

	public void openLinkInNewTab(String url, WebDriver driver) throws InterruptedException, AWTException {
		((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", url);
		String newTab = driver.getWindowHandles().toArray(new String[0])[1];
		driver.switchTo().window(newTab);
		vlogin = new Valuer_Login(driver);
		vlogin.ValuerLoginWithMobileNumber(driver);
		pendingproductpage = new PendingProductsPage(driver);
		pendingproductpage.sidemenucommisonbuttonclick();
		pendingproductpage.ViewButton(driver);
		pendingproductpage.scrollThePageEnd(driver);
		pendingproductpage.vluerprice(driver);
		pendingproductpage.fileupload(driver);
		pendingproductpage.acceptButton();

	}

}
