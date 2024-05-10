package com.ValuerModule;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AcceptedProductsPage {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	@FindBy(xpath="//span[normalize-space()='Accepted Products']")
	public static WebElement AcceptedProductText;
	
	
	@FindBy(xpath = "//p[@class='fs-5']")
	public static WebElement TillNowAcceptProductsText;

	@FindBy(xpath = "//input[@placeholder='Search the data here...']")
	public static WebElement SearchTheDataHere;

	@FindBy(xpath = "//h5[normalize-space()='No Product Found']")
	public static WebElement NoProductFound;

	@FindBy(xpath = "//ul[@class='ngx-pagination ng-star-inserted']")
	public static WebElement PreviosAndNext;

	@FindBy(xpath = "")
	public static WebElement Next;

	@FindBy(xpath = "//table[@class='table']//thead")
	public static WebElement AllTablesText;
	
	@FindBy(xpath="//table//td")
	public static List<WebElement> td;
	
	
	@FindBy(xpath="//table//tr")
	public static List<WebElement> tr;
	

	public AcceptedProductsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		

	}

	
	
	public void TillNowText() throws InterruptedException {

		Thread.sleep(3000);
		AcceptedProductText.click();
		
		 // Assuming TillNowAcceptProductsText is a class with a getText() method
	    String text = TillNowAcceptProductsText.getText();
	    
	    // Check if the returned text is not empty or null
	    if (text != null && !text.isEmpty()) {
	        // Display the text to the user (for example, printing to the console)
	        System.out.println("Text to display: " + text);
	    } else
	    {
	        // If the text is empty or null, do not display anything
	        System.out.println("No text to display.");
	    }
	}

	public void NoFoundButton() {

		 String productText = NoProductFound.getText(); // Assuming NoProductFound is a class with a getText() method
		    
		    if (productText == null || productText.isEmpty()) {
		        // If no product is found, display "No product found" message
		        System.out.println("No product found.");
		    } 
		    else {
		        // If a product is found, display a different message
		        System.out.println("Product found: " + productText);
		    }

	}

	public  void SerachButton() throws InterruptedException {
//		SearchTheDataHere.sendKeys("");
//		
//		  // Send an empty string to the "SearchTheDataHere" input field
//		SearchTheDataHere.sendKeys("");

		Thread.sleep(3000);
		
	    // Check if the input field is displayed
	    if (SearchTheDataHere.isDisplayed()) {
	        System.out.println("Search input field is displayed.");
	    } else {
	        System.out.println("Search input field is not displayed.");
	    }
		
	}

	public void AllTableText() throws InterruptedException {
	Thread.sleep(2000);
		 // Get the text of all table cells or rows
	    List<WebElement> tableCells = driver.findElements(By.xpath("//table//td"));
	    List<WebElement> tableRows = driver.findElements(By.xpath("//table//tr"));

	    // Check if the table text is not empty
	    if (!tableCells.isEmpty() || !tableRows.isEmpty()) {
	        System.out.println("Text of table is displayed.");
	    } else {
	        System.out.println("Text of table is not displayed.");
	    }
		
		
		AllTablesText.getText();
	}

	public void PreviosAndNextButton() throws InterruptedException {
		 
		Thread.sleep(2000);
		// Get the text of the "PreviosAndNext" button
	    String buttonText = PreviosAndNext.getText();

	    // Check if the text is not empty
	    if (!buttonText.isEmpty()) {
	        System.out.println("Text of PreviosAndNext button is displayed: " + buttonText);
	    } else {
	        System.out.println("Text of PreviosAndNext button is not displayed.");
	    }
	}
	
	public List<WebElement> getAllTableCells() {
        return td;
    }

    public List<WebElement> getAllTableRows() {
        return tr;
    }
	
	
	 public boolean isTableTextDisplayed() {
         List<WebElement> tableCells = getAllTableCells();
         List<WebElement> tableRows = getAllTableRows();

         return !tableCells.isEmpty() || !tableRows.isEmpty();
     }
	
	 public void printAllTableText() throws InterruptedException {
		 Thread.sleep(2000);
	        List<WebElement> tableCells = getAllTableCells();

	        for (WebElement cell : tableCells) {
	            System.out.println(cell.getText());
	        }
	    }
	
	
	 public List<List<String>> getAllTableColumns() throws InterruptedException {
		 Thread.sleep(2000);
		 List<List<String>> tableColumns = new ArrayList<>();
	        List<WebElement> rows = tr;

	        // Iterate over rows
	        for (WebElement row : rows) {
	            List<WebElement> columns = td;
	            // Iterate over columns
	            for (int i = 0; i < columns.size(); i++) {
	                // Initialize list for new column
	                if (tableColumns.size() <= i) {
	                    tableColumns.add(new ArrayList<>());
	                }
	                tableColumns.get(i).add(columns.get(i).getText());
	            }
	        }
	        return tableColumns;
	
	
	 }
}
