package com.HomePage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ClickableElementsTest2 {

    private WebDriver driver;
    private String baseUrl;


@BeforeClass
    public void setUp() {
     
	  
	  // Set up the WebDriver instance
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseUrl = "http://52.77.24.76/"; // Change this to your base URL
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void testClickableElements() {
        // Find all clickable elements: <a> tags and <button> elements
        List<WebElement> clickableElements = driver.findElements(By.xpath("//a | //button"));

        // Check if each clickable element has a href attribute and is clickable
        for (WebElement element : clickableElements) {
            // Check if the element has a href attribute (for <a> tags)
            String hrefAttribute = element.getAttribute("href");

            // For <button> elements, we don't check for href attribute but we check for clickability
            if (hrefAttribute != null && !hrefAttribute.isEmpty()) {
                // Check if the element is clickable (enabled and displayed)
                if (element.isEnabled() && element.isDisplayed()) {
                    // Click the element to test if it's clickable
                    element.click();
                } else {
                    // Fail the test if the element is not clickable
                    Assert.fail("Element is not clickable: " + element.getAttribute("outerHTML"));
                }
            } else {
                // For buttons, check if it's clickable
                try {
                    element.click();
                } catch (Exception e) {
                    // Fail the test if the element is not clickable
                    Assert.fail("Element is not clickable: " + element.getAttribute("outerHTML"));
                }
            }
        }
}}