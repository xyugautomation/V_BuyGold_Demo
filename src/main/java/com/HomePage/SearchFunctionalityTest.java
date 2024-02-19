package com.HomePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFunctionalityTest {
	public static WebDriver driver;

	public void serachFunctionality() throws InterruptedException {

		// Find the search input field and enter the product name
//	        WebElement searchInput = driver.findElement(By.xpath("//nav[@class='header_webview']//input[@placeholder='Search for jewellery']"));
//	        Thread.sleep(5000);
//	        searchInput.sendKeys("Necklace");
//	        Thread.sleep(5000);

//	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav[@class='header_webview']//input[@placeholder='Search for jewellery']")));
//	        element.sendKeys("Necklace");
//	       

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		boolean invisiable = wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath("//button[@aria-label='close']//*[name()='svg']")));

		if (invisiable) {
			Thread.sleep(5000);
			WebElement element = driver.findElement(By.xpath(
					"//div[@class='search_field'])[1] | //nav[@class='header_webview']//input[@placeholder='Search for jewellery'] "));
			Thread.sleep(5000);
			element.sendKeys("Necklace");

		}

		Thread.sleep(5000);
//	        
//	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//
//	        ;

		// Find the search button and click on it
//	        WebElement searchButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/section[1]/section[1]/nav[1]/ul[1]/li[2]/div[1]/input[1]"));
//	     
//	       searchButton.click();
//
//	        // Wait for the search results to load
//	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//	        WebElement searchResults = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//a[normalize-space()='Necklace']")));
//
//	        // Verify if the product name appears in the search results
//	        if (searchResults.getText().contains("Necklace")) {
//	            System.out.println("Product is displayed in search results!");
//	        } else {
//	            System.out.println("Product is NOT displayed in search results!");
//	        }
	}

	public void selectcity() throws InterruptedException {
		Thread.sleep(6000);
		WebElement element = driver.findElement(By.xpath("//nav[@class='header_webview']//select"));
		Thread.sleep(6000);
		Select s = new Select(element);
		Thread.sleep(6000);
		s.selectByIndex(2);

	}

}
