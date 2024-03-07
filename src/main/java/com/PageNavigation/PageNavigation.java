package com.PageNavigation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageNavigation {

	public static WebDriver driver;

	// xpath For About Page
	@FindBy(xpath = "//span[text()='About V-Buy Gold group']")
	WebElement AboutLink;

	// Xpath For contact US Page
	@FindBy(xpath = "//span[text()='Contact Us']")
	WebElement contactusLink;

	// Xpath For Help Page
	@FindBy(xpath = "//span[text()='Help']")
	WebElement HelpLink;

	// Xpath For Legal Page
	@FindBy(xpath = "//span[text()='Legal & Privacy information'] ")
	WebElement LegalLink;

	public PageNavigation(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void AllPageNavigation(WebDriver driver) throws InterruptedException {

		// 1) About Page
		Thread.sleep(5000);

		// Scroll the element into view
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AboutLink);
		Thread.sleep(5000);
		// Click the element
		AboutLink.click();

		System.out.println("We are present about page");
		Thread.sleep(6000);

		// Create a JavaScriptExecutor object
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(6000);
		js.executeScript("window.scrollTo(0, 0)");

		System.out.println("###.....-->All About Page content is displaying<---.....###");
		System.out.println();
		Thread.sleep(4000);
		driver.navigate().back();

		System.out.println("We are back to the V_Buy Gold Home Page.........!!!!");

		// 2) contact us Page
		Thread.sleep(5000);

		// Scroll the element into view
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", contactusLink);
		Thread.sleep(5000);
		// Click the element
		contactusLink.click();

		System.out.println("We are present contactus page");
		Thread.sleep(6000);

		// Create a JavaScriptExecutor object
		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(6000);
		js1.executeScript("window.scrollTo(0, 0)");

		System.out.println("###.....-->All contactus Page content is displaying<---.....###");

		System.out.println();

		Thread.sleep(4000);
		driver.navigate().back();

		System.out.println("We are back to the V_Buy Gold Home Page.........!!!!");

		// 3) Help Page
		Thread.sleep(5000);

		// Scroll the element into view
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", HelpLink);
		Thread.sleep(5000);
		// Click the element
		HelpLink.click();

		System.out.println("We are present Help page");
		Thread.sleep(6000);

		// Create a JavaScriptExecutor object
		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(6000);
		js2.executeScript("window.scrollTo(0, 0)");

		System.out.println("###.....-->All Help Page content is displaying<---.....###");
		System.out.println();
		Thread.sleep(4000);
		driver.navigate().back();

		System.out.println("We are back to the V_Buy Gold Home Page.........!!!!");

		// 4) Legal Page
		Thread.sleep(5000);

		// Scroll the element into view
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LegalLink);
		Thread.sleep(5000);
		// Click the element
		LegalLink.click();

		System.out.println("We are present Legal page");
		Thread.sleep(6000);

		// Create a JavaScriptExecutor object
		JavascriptExecutor js3 = (JavascriptExecutor) driver;

		js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(6000);
		js3.executeScript("window.scrollTo(0, 0)");

		System.out.println("###.....-->All Legal Page content is displaying<---.....###");
		System.out.println();
		Thread.sleep(4000);
		driver.navigate().back();

		System.out.println("We are back to the V_Buy Gold Home Page.........!!!!");

		// driver.close();

	}

}
