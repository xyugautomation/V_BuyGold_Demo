package com.AdminModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LivePriceUpdateTest {
	
	@Test
public void TestLivePrice() {
	
WebDriverManager.chromedriver().setup();
   
    WebDriver driver = new ChromeDriver();

    
    
    // Navigate to the web page with live prices
    driver.get("https://stg.goldbharat.com/home");
    try {
       

        // Locate the element that displays the price
        WebElement priceElement = driver.findElement(By.xpath("(//h6[contains(text(),'₹ 743')])[1]"));

        // Variable to hold the previous price
        String previousPrice = priceElement.getText();
        System.out.println("Initial Price: " + previousPrice);

        // Loop to check price updates every second for a certain duration
        for (int i = 0; i < 20; i++) { // Checking 20 times (20 seconds total)
            // Wait for 1 second
            Thread.sleep(1000);

            // Get the updated price
            String currentPrice = priceElement.getText();
            System.out.println("Updated Price: " + currentPrice);

            // Check if the price has changed
            if (!previousPrice.equals(currentPrice)) {
                System.out.println("Price has updated.");
            } else {
                System.out.println("Price has not updated.");
            }

            // Update the previous price for the next iteration
            previousPrice = currentPrice;
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    } finally {
        // Close the browser
        driver.quit();
    }
}

}
