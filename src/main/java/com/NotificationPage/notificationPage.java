package com.NotificationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class notificationPage {

	public static WebDriver driver;

	@FindBy(xpath = "//div[@class='notification ng-star-inserted']//span[contains(text(),'Notifications')]")
	WebElement notificationbutton;

	@FindBy(xpath = "(//button[contains(text(),'View')])[1]")
	WebElement Viewbutton;

	@FindBy(xpath = "//li[@routerlink='/']//img[@class='header_logo']")
	WebElement Logo;

	public notificationPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void verifynotificationbutton(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);
		notificationbutton.click();

		Thread.sleep(4000);
		Viewbutton.click();

		Thread.sleep(4000);

		Logo.click();

		// driver.close();

	}

}
