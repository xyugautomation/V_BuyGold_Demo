package com.TrusteeModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrusteeRegister {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	@FindBy(xpath = "//div[@class='valuer_field ng-star-inserted']//select")
	public static WebElement selectValuerAndTrustee;

	// Personal Information xpath

	@FindBy(xpath = "//div[@class='col-md-6 inputforms']//form[@class='ng-untouched ng-pristine ng-invalid']//div[@class='input']//div//input[@id='fname']")
	public static WebElement MobileNumber;

	@FindBy(xpath = "(//input[@id='lname'])[1]")
	public static WebElement EmailID;

	@FindBy(xpath = "(//input[@id='lname'])[2]")
	public static WebElement NameOfTheTrustee;

	@FindBy(xpath = "(//input[@id='lname'])[3]")
	public static WebElement PinCode;

	@FindBy(xpath = "//p[normalize-space()='Begumpet']//input[@type='radio']")
	public static WebElement Circle;

	@FindBy(xpath = "//textarea[@formcontrolname='Landmark']")
	public static WebElement HouseNo_LandMark;

	@FindBy(xpath = "//select[@id='lname']")
	public static WebElement SelectDay;

	@FindBy(xpath = "//input[@formcontrolname='Shop_open_time']")
	public static WebElement ShopOpenTime;

	@FindBy(xpath = "//input[@formcontrolname='Shop_closed_time']")
	public static WebElement ShopeCloseTime;

	@FindBy(xpath = "//input[@type='checkbox']")
	public static WebElement chechBoxButton;

	@FindBy(xpath = "//button[normalize-space()='Save & Continue']")
	public static WebElement SaveAndContinue;

	// Experience form xpath

	@FindBy(xpath = "//select[@id='fname']")
	public static WebElement YearofExperience;

	@FindBy(xpath = "//form[@class='ng-untouched ng-pristine ng-invalid']//div[@class='input']//div//input[@id='fname'] | (//input[@id='fname'])[2]")

	public static WebElement companyNameShopName;

	@FindBy(xpath = "//textarea[@class='form-control myforms ng-untouched ng-pristine ng-invalid'] | (//textarea[@class='form-control myforms ng-untouched ng-pristine ng-invalid'])[1]")
	public static WebElement companyNameAddress;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
	public static WebElement SaveButton;

	// Bank Details xpath

	@FindBy(xpath = "(//input[@id='lname'])[6]")
	public static WebElement IFSCCode;

	@FindBy(xpath = "(//input[@id='lname'])[7]")
	public static WebElement AccountHolderName;

	@FindBy(xpath = "(//input[@id='lname'])[8]")
	public static WebElement BankAccountNumber;

	@FindBy(xpath = "//input[@formcontrolname='bank_document']")
	public static WebElement UploadBankDocument;

	@FindBy(xpath = "//input[@formcontrolname='identification_documents']")
	public static WebElement UploadPersonalIndentityDocument;

	@FindBy(xpath = "//button[@class='button save-continue-botns-invalid ng-star-inserted']")
	public static WebElement SaveButtonBankPage;

	@FindBy(xpath = "//button[normalize-space()='Go to your Valuer Dashboard']")
	public static WebElement GoToYourValuerDashboard;

	public TrusteeRegister(WebDriver driver) {
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}

	public void TrusteeSelect() throws InterruptedException {
		Thread.sleep(3000);
		Select valuer = new Select(selectValuerAndTrustee);

		valuer.selectByIndex(2);

	}

	public static void PersonalInformation(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		; // Adjust the timeout as needed

		MobileNumber.sendKeys("7458965874");
		wait.until(ExpectedConditions.visibilityOf(EmailID)).sendKeys("Shiva@gmail.com");
		wait.until(ExpectedConditions.visibilityOf(NameOfTheTrustee)).sendKeys("Shiv_Valuer");
		wait.until(ExpectedConditions.visibilityOf(PinCode)).sendKeys("500016");
		Thread.sleep(3000);
		Circle.click();

		// Scrolling to the end of the page
		Long documentHeight = (Long) js
				.executeScript("return Math.max(" + "document.body.scrollHeight, document.documentElement.scrollHeight,"
						+ "document.body.offsetHeight, document.documentElement.offsetHeight,"
						+ "document.body.clientHeight, document.documentElement.clientHeight);");
		js.executeScript("window.scrollTo(0, arguments[0]);", documentHeight);

		wait.until(ExpectedConditions.visibilityOf(HouseNo_LandMark)).sendKeys("beside ameerpet metro station");

		Select selectday = new Select(wait.until(ExpectedConditions.visibilityOf(SelectDay)));
		selectday.selectByIndex(1);
		Thread.sleep(4000);
		ShopOpenTime.sendKeys("0900AM");

		Thread.sleep(4000);
		ShopeCloseTime.sendKeys("0630PM");

		Thread.sleep(4000);

		chechBoxButton.click();
		Thread.sleep(4000);

		SaveAndContinue.click();
	}

	public static void Experience(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		; // Adjust the timeout as needed

		Select selectday = new Select(wait.until(ExpectedConditions.visibilityOf(YearofExperience)));
		selectday.selectByIndex(1);

		wait.until(ExpectedConditions.visibilityOf(companyNameShopName)).sendKeys("X-yugTechnologies");

		wait.until(ExpectedConditions.visibilityOf(companyNameAddress)).sendKeys("Beside Prakash Nager");

		wait.until(ExpectedConditions.visibilityOf(companyNameShopName)).sendKeys("X-yugTechnologies");

		wait.until(ExpectedConditions.visibilityOf(SaveButton)).click();
	}

	public static void BankDetails(WebDriver driver) throws InterruptedException, AWTException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		; // Adjust the timeout as needed

		wait.until(ExpectedConditions.visibilityOf(IFSCCode)).sendKeys("HDFC0000042");

		wait.until(ExpectedConditions.visibilityOf(AccountHolderName)).sendKeys("ShivPatilYetala");

		wait.until(ExpectedConditions.visibilityOf(BankAccountNumber)).sendKeys("34221298980");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);
		UploadBankDocument.click();

		Thread.sleep(2000);
		// Specify the file path
		String filePath = "C:\\v_BuyAutomation\\download.jpg";
		// Use Robot class to interact with the system-level file dialog
		Robot robot = new Robot();
		// Copy the file path to clipboard
		StringSelection stringSelection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		// Paste the file path into the file dialog and press Enter
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1000); // Delay to ensure the path is pasted
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void OnBoardingDashBoard() {

	}

}
