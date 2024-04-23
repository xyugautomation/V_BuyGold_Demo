package com.TrusteeModule;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trustee_Login {
	public static WebDriver driver;
	public static JavascriptExecutor js;

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

	@FindBy(xpath = "//button[@class='logout']")
	public static WebElement logoutbutton;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	public static WebElement YesButton;

	public Trustee_Login(WebDriver driver) {

		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}

	public static void TrusteeMobileNumber(WebDriver driver) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		wait.until(ExpectedConditions.visibilityOf(EnterMobileNumber)).sendKeys("7458965874");

		wait.until(ExpectedConditions.visibilityOf(clickbutton)).click();

		Thread.sleep(5000);

		wait.until(ExpectedConditions.visibilityOf(A)).sendKeys("1");

		wait.until(ExpectedConditions.visibilityOf(B)).sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(C)).sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(D)).sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(E)).sendKeys("1");

		wait.until(ExpectedConditions.visibilityOf(F)).sendKeys("1");

		wait.until(ExpectedConditions.visibilityOf(logoutbutton)).click();

		wait.until(ExpectedConditions.visibilityOf(YesButton)).click();

		driver.close();

	}

}
