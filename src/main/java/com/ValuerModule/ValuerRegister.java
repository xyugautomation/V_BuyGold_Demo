package com.ValuerModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ValuerRegister {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	@FindBy(xpath = "//div[@class='valuer_field ng-star-inserted']//select")
	public static WebElement selectValuerAndTrustee;

	// Personal Information xpath

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-valueregister[1]/div[1]/div[1]/ng-stepper[1]/div[1]/div[2]/div[1]/app-valstepone[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	public static WebElement MobileNumber;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-valueregister[1]/div[1]/div[1]/ng-stepper[1]/div[1]/div[2]/div[1]/app-valstepone[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
	public static WebElement EmailID;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-valueregister[1]/div[1]/div[1]/ng-stepper[1]/div[1]/div[2]/div[1]/app-valstepone[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")
	public static WebElement NameOfTheValuer;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-valueregister[1]/div[1]/div[1]/ng-stepper[1]/div[1]/div[2]/div[1]/app-valstepone[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]")
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

	// personal information invalidate data xpath

	@FindBy(xpath = "//div[@class='validationError ng-star-inserted']")
	public static WebElement mobileNumberErrorMsg;

	@FindBy(xpath = "  //div[normalize-space()='Please enter a valid email.']")
	public static WebElement emailIDErrorMsg;

	@FindBy(xpath = "//div[contains(text(),'Please enter a valid pin code.')]")
	public static WebElement pincodeerrormsg;

	@FindBy(xpath = "//div[normalize-space()='Day is required.']")
	public static WebElement dayerrormsg;

	@FindBy(xpath = "//app-valstepone[@class='ng-star-inserted']//p[@class='launch-carrea-paragraph'][normalize-space()='Become a Valuer with V-Buy Gold in 10 Minutes']")
	public static WebElement valuerwebpageclick;

	// Experience form xpath

	@FindBy(xpath = "//select[@id='fname']")
	public static WebElement YearofExperience;

	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/app-valueregister[1]/div[1]/div[1]/ng-stepper[1]/div[1]/div[2]/div[2]/app-valstepthree[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
	public static WebElement companyNameShopName;

	@FindBy(xpath = "//textarea[@class='form-control myforms ng-untouched ng-pristine ng-invalid'] | //textarea[@formcontrolname='shop_address']")
	public static WebElement companyNameAddress;

	@FindBy(xpath = "//app-valstepthree[@class='ng-star-inserted']//button[@type='submit'][normalize-space()='Save']")
	public static WebElement SaveButton;

	// Experience page negative text msg xpath
	@FindBy(xpath = "//div[normalize-space()='Experience is required.']")
	public static WebElement YearofExperienceerrortextmsg;

	@FindBy(xpath = "//select[@id='fname']")
	public static WebElement companyNameShopNameerrortextmsg;

	@FindBy(xpath = "//form[@class='ng-pristine ng-invalid ng-touched']//div[1]//div[1]")
	public static WebElement companyNameAddresserrortextmsg;

	// Bank Details xpath

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-valueregister[1]/div[1]/div[1]/ng-stepper[1]/div[1]/div[2]/div[3]/app-valstepfour[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	public static WebElement IFSCCode;

	@FindBy(xpath = "//div[@class='content ng-tns-c625643793-1 ng-trigger ng-trigger-stepTransition ng-star-inserted active']//div[2]//div[1]//input[1]")
	public static WebElement AccountHolderName;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-valueregister[1]/div[1]/div[1]/ng-stepper[1]/div[1]/div[2]/div[3]/app-valstepfour[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")
	public static WebElement BankAccountNumber;

	@FindBy(xpath = "(//label[@for='file'])[1]")
	public static WebElement UploadBankDocument;

	@FindBy(xpath = "//input[@formcontrolname='identification_documents']")
	public static WebElement UploadPersonalIndentityDocument;

	@FindBy(xpath = "//button[@class='button save-continue-botns-invalid ng-star-inserted'] | //button[@class='button submit-botn ng-star-inserted']")
	public static WebElement SaveButtonBankPage;

	@FindBy(xpath = "//button[normalize-space()='Go to your Valuer Dashboard']")
	public static WebElement GoToYourValuerDashboard;

	// valuer login page

	@FindBy(xpath = "input[placeholder='Enter Phone number'] | //body[1]/app-root[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")
	public static WebElement EnterMobileNumber;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	public static WebElement clickbutton;

	@FindBy(xpath = "//input[@autocomplete='one-time-code'][1]")
	public static WebElement A;

	@FindBy(xpath = "//input[@autocomplete='one-time-code'][2]")
	public static WebElement B;

	@FindBy(xpath = "//input[@autocomplete='one-time-code'][3]")
	public static WebElement C;

	@FindBy(xpath = "//input[@autocomplete='one-time-code'][4]")
	public static WebElement D;

	@FindBy(xpath = "//input[@autocomplete='one-time-code'][5]")
	public static WebElement E;

	@FindBy(xpath = "//input[@autocomplete='one-time-code'][6]")
	public static WebElement F;

	public ValuerRegister(WebDriver driver) {

		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}

	public void ValuerSelect() throws InterruptedException {
		Thread.sleep(3000);
		Select valuer = new Select(selectValuerAndTrustee);

		valuer.selectByIndex(1);

	}

	public static void PersonalInformation(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		; // Adjust the timeout as needed

		MobileNumber.sendKeys("8989895689");
		wait.until(ExpectedConditions.visibilityOf(EmailID)).sendKeys("Shiva@gmail.com");
		wait.until(ExpectedConditions.visibilityOf(NameOfTheValuer)).sendKeys("Shiv_Valuer");
		wait.until(ExpectedConditions.visibilityOf(PinCode)).sendKeys("500016");
		Thread.sleep(4000);
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		; // Adjust the timeout as needed

		Select selectday = new Select(wait.until(ExpectedConditions.visibilityOf(YearofExperience)));
		selectday.selectByIndex(1);

		wait.until(ExpectedConditions.visibilityOf(companyNameShopName)).sendKeys("X-yugTechnologies");

		wait.until(ExpectedConditions.visibilityOf(companyNameAddress)).sendKeys("Beside Prakash Nager");

		wait.until(ExpectedConditions.visibilityOf(companyNameShopName)).sendKeys("X-yugTechnologies");

		wait.until(ExpectedConditions.visibilityOf(SaveButton)).click();

	}

	public static void BankDetails(WebDriver driver) throws InterruptedException, AWTException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		; // Adjust the timeout as needed

		wait.until(ExpectedConditions.visibilityOf(IFSCCode)).sendKeys("HDFC0000042");

		wait.until(ExpectedConditions.visibilityOf(AccountHolderName)).sendKeys("ShivPatilYetala");

		wait.until(ExpectedConditions.visibilityOf(BankAccountNumber)).sendKeys("34221298980");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)", "");
//		Thread.sleep(5000);
//		UploadBankDocument.click();
//		
//		Thread.sleep(2000);
//		// Specify the file path
//		String filePath = "C:\\v_BuyAutomation\\download.jpg";
//		// Use Robot class to interact with the system-level file dialog
//		Robot robot = new Robot();
//		// Copy the file path to clipboard
//		StringSelection stringSelection = new StringSelection(filePath);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//		// Paste the file path into the file dialog and press Enter
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.delay(1000); // Delay to ensure the path is pasted
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);

//		
//		
//		
//		}

	}

	public void ulopadpersonalindentiydocument(WebDriver driver) throws InterruptedException, AWTException {

		Thread.sleep(2000);
		// Scrolling to the end of the page
		Long documentHeight = (Long) js
				.executeScript("return Math.max(" + "document.body.scrollHeight, document.documentElement.scrollHeight,"
						+ "document.body.offsetHeight, document.documentElement.offsetHeight,"
						+ "document.body.clientHeight, document.documentElement.clientHeight);");
		js.executeScript("window.scrollTo(0, arguments[0]);", documentHeight);

		// Thread.sleep(9000);
//		UploadPersonalIndentityDocument.click();
//
//		Thread.sleep(2000);
//		// Specify the file path
//		String filePath1 = "D:\\AutomationFile\\BIAR0097R13-POSTER-V1-64762.jpg";
//		// Use Robot class to interact with the system-level file dialog
//		Robot robot1 = new Robot();
//		// Copy the file path to clipboard
//		StringSelection stringSelection1 = new StringSelection(filePath1);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
//		// Paste the file path into the file dialog and press Enter
//		robot1.keyPress(KeyEvent.VK_CONTROL);
//		robot1.keyPress(KeyEvent.VK_V);
//		robot1.keyRelease(KeyEvent.VK_V);
//		robot1.keyRelease(KeyEvent.VK_CONTROL);
//		robot1.delay(1000); // Delay to ensure the path is pasted
//		robot1.keyPress(KeyEvent.VK_ENTER);
//		robot1.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
		SaveButtonBankPage.click();
//
//		
//		  // Locate the file input element (the "Browse Files" button)
//      //  WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
//
//     
//		

	}

	public static void OnBoardingDashBoard(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		; // Adjust the timeout as needed
		Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOf(GoToYourValuerDashboard)).click();

	}

	public static void valuerMobileNumber(WebDriver driver) throws InterruptedException {
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(EnterMobileNumber)).sendKeys("8989895689");
		wait.until(ExpectedConditions.visibilityOf(clickbutton)).click();
		wait.until(ExpectedConditions.visibilityOf(A)).sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(B)).sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(C)).sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(D)).sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(E)).sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(F)).sendKeys("1");
	}

	// negative test cases

	public void personalinformationinvalid(WebDriver driver) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		; // Adjust the timeout as needed

		wait.until(ExpectedConditions.visibilityOf(MobileNumber)).sendKeys("8698");

		wait.until(ExpectedConditions.visibilityOf(EmailID)).sendKeys("Shiva");
//
		wait.until(ExpectedConditions.visibilityOf(PinCode)).sendKeys("50");

		wait.until(ExpectedConditions.visibilityOf(SelectDay)).click();

		wait.until(ExpectedConditions.visibilityOf(valuerwebpageclick)).click();

		Thread.sleep(2000);
		// Scrolling to the end of the page
		Long documentHeight = (Long) js
				.executeScript("return Math.max(" + "document.body.scrollHeight, document.documentElement.scrollHeight,"
						+ "document.body.offsetHeight, document.documentElement.offsetHeight,"
						+ "document.body.clientHeight, document.documentElement.clientHeight);");
		js.executeScript("window.scrollTo(0, arguments[0]);", documentHeight);

		// SaveButtonBankPage.click();

		Assert.assertTrue(mobileNumberErrorMsg.isDisplayed(), "Error message should be displayed for invalid Mobile");
		System.out.println("Mobile Number Error Message Displayed: " + mobileNumberErrorMsg.isDisplayed());

		Assert.assertTrue(emailIDErrorMsg.isDisplayed(), "Error message should be displayed for invalid Gamil");
		System.out.println("Email ID Error Message Displayed: " + emailIDErrorMsg.isDisplayed());

		Assert.assertTrue(pincodeerrormsg.isDisplayed(), "Error message should be displayed for invalid pincode");
		System.out.println("Pincode Error Message Displayed: " + pincodeerrormsg.isDisplayed());

		Assert.assertTrue(dayerrormsg.isDisplayed(), "Error message should be displayed for should not select Day");
		System.out.println("Select day Error Message Displayed: " + dayerrormsg.isDisplayed());

		MobileNumber.clear();
		EmailID.clear();
		PinCode.clear();

	}

	public void ExperienceinvalidateData(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		; // Adjust the timeout as needed

		wait.until(ExpectedConditions.visibilityOf(YearofExperience)).click();

		wait.until(ExpectedConditions.visibilityOf(companyNameShopName)).sendKeys("X-yugTechnologies");
		companyNameShopName.clear();

		wait.until(ExpectedConditions.visibilityOf(companyNameAddress)).sendKeys("Beside Prakash Nager");

		companyNameAddress.clear();

		// wait.until(ExpectedConditions.visibilityOf(SaveButton)).click();

		wait.until(ExpectedConditions.visibilityOf(valuerwebpageclick)).click();

		Assert.assertTrue(YearofExperienceerrortextmsg.isDisplayed(),
				"Error message should be displayed for invalid Mobile");
		System.out.println("YearOfExperience Error Message Displayed: " + YearofExperienceerrortextmsg.isDisplayed());

		Assert.assertTrue(companyNameShopNameerrortextmsg.isDisplayed(),
				"Error message should be displayed for invalid Mobile");
		System.out.println("CompanyShop Error Message Displayed: " + companyNameShopNameerrortextmsg.isDisplayed());

		Assert.assertTrue(companyNameAddresserrortextmsg.isDisplayed(),
				"Error message should be displayed for invalid Mobile");
		System.out.println("CompanyName Error Message Displayed: " + companyNameAddresserrortextmsg.isDisplayed());

	}

}
