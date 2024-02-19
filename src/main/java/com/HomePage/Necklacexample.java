package com.HomePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Necklacexample {
	public static WebDriver driver;
	
	
	 @FindBy(xpath = "//a[normalize-space()='Necklace']")
	    private WebElement necklaceLink;

	    @FindBy(xpath = "//p[text()='Necklace']")
	    private List<WebElement> products;

	   
//	    @FindBy(xpath = "//div[@class='product']")
//	    private List<WebElement> products;

	    public Necklacexample(WebDriver driver) {
	    
	    	
	    	PageFactory.initElements(driver, this);
	  
	    }

	    public void navigateToCategoryAndInteractWithProducts(String category, String productIdentifier) {
	        try {
	            // Click on the category in the navigation bar
	            WebElement categoryLink = getCategoryLink(category);
	            categoryLink.click();

	            // Wait for some time to allow the page to load (you might want to replace this with explicit waits)
	            Thread.sleep(5000);

	            // Identify and interact with all products based on the identifier
	            List<WebElement> matchingProducts = getProductsByIdentifier(productIdentifier);
	            for (WebElement product : matchingProducts) {
	                // Now you can interact with each identified product element
	                // For example, click on the product
	                product.click();
	                // Perform other interactions as needed

	                // Optionally, navigate back to the category page to interact with the next product
	                driver.navigate().back();
	                // Wait for some time to allow the page to load again
	                Thread.sleep(5000);
	            }

	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	    private WebElement getCategoryLink(String category) throws InterruptedException {
	        if ("Necklace".equals(category)) {
	        	 Thread.sleep(2000);
	        	return necklaceLink;
	        
	        } else {
	            throw new IllegalArgumentException("Unsupported category: " + category);
	        }
	    }
	    private List<WebElement> getProductsByIdentifier(String productIdentifier) {
	        List<WebElement> matchingProducts = new ArrayList<>();
	        for (WebElement product : products) {
	            // Adjust the condition based on the dynamic identifier of the product
	            if (product.getText().contains(productIdentifier)) {
	                matchingProducts.add(product);
	            }
	        }
	        if (matchingProducts.isEmpty()) {
	            throw new IllegalArgumentException("No products found with identifier: " + productIdentifier);
	        }
	        
	        return matchingProducts;
	    }
}
