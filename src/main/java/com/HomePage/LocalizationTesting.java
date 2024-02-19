package com.HomePage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LocalizationTesting {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// Set the path to the ChromeDriver executable
		WebDriverManager.chromedriver().setup();

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		// Implicitly wait for elements to be present before performing actions
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// List of languages to test (you can add more languages as needed)
		String[] languages = { "en", "fr", "es" };

		// Loop through each language
		for (String language : languages) {
			driver.manage().window().maximize();
			// Navigate to the application homepage with the selected language
			driver.get("http://52.77.24.76/" + language);
			Thread.sleep(5000);
			// Find UI elements and verify their text based on the language
			WebElement pageTitle = driver.findElement(By.xpath("//h1"));
			Thread.sleep(5000);
			WebElement loginButton = driver.findElement(
					By.xpath("//li[@class='user_info_btn']//div[@class='profile']//div[@class='profile']"));

			// Print out the language being tested
			System.out.println("Testing UI elements in " + language.toUpperCase() + " language:");

			// Verify the text of UI elements
			System.out.println("Page Title: " + pageTitle.getText());
			System.out.println("Login Button Text: " + loginButton.getText());
			System.out.println("----------------------------------------------");
		}
	}
}
