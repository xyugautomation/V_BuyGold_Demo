package com.AdminModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ValuerListPage {

	WebDriver driver;
	// Locators
	By table = By.xpath("//table[@class='table mt-4 text-center']"); // Use appropriate ID or selector
	By headers = By.xpath("//th[normalize-space()='S.No']");
	By rows = By.xpath("//table[@id='tableId']/tbody/tr");
	By viewButtons = By.xpath("//table[@id='tableId']/tbody/tr/td/button");
	
	@FindBy(xpath="//span[normalize-space()='Valuer List']")
	public static WebElement sidevaluerList;
	

	
	
	
	
	public ValuerListPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void clickonSideMenuValuerList(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		sidevaluerList.click();
		
		
	}
	
	
	
	// Methods
	public boolean isTableDisplayed(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);

		return driver.findElement(table).isDisplayed();
	}

	public List<WebElement> getHeaders(WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);

		return driver.findElements(headers);
	}

	public List<WebElement> getRows(WebDriver driver ) throws InterruptedException {
		Thread.sleep(2000);

		return driver.findElements(rows);
	}

	public WebElement getCell(int rowIndex, int colIndex ,WebDriver driver) throws InterruptedException {

		Thread.sleep(2000);
		return driver.findElement(By.xpath("//table[@id='tableId']/tbody/tr[" + rowIndex + "]/td[" + colIndex + "]"));
	}

	public void clickViewButton(int rowIndex ,WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//table[@id='tableId']/tbody/tr[" + rowIndex + "]/td/button")).click();
	}




}
