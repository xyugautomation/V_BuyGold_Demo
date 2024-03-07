package com.HomePage;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectCity {
	public static WebDriver driver;

	@FindBy(xpath = "//nav[@class='header_webview']//select | //body[1]/app-root[1]/app-layout[1]/app-header[1]/section[1]/nav[1]/ul[1]/li[2]/div[2]/select[1]")
	WebElement selectcity;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), 'Hyderabad ')]")
	boolean SelectcityHyderabad;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), 'Secunderabad ')]")
	WebElement SelectcitySecunderabad;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), 'Warangal ')]")
	WebElement SelectcityWarangal;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), 'Karimnagar ')]")
	WebElement SelectcityKarimnagar;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), 'Adilabad ')]")
	WebElement SelectcityAdilabad;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), 'Mahabubnagar ')]")
	WebElement SelectcityMahabubnagar;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), 'Medak ')]")
	WebElement SelectcityMedak;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), 'Siddipet ')]")
	WebElement SelectcitySiddipet;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), ' Gadwal ')]")
	WebElement SelectcityGadwal;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), ' Bhadrachalam ')]")
	WebElement SelectcityBhadrachalam;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), ' Sangareddy')]")
	WebElement SelectcitySangareddy;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), ' Nizamabad')]")
	WebElement SelectcityNizamabad;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), ' Nalgonda ')]")
	WebElement SelectcityNalgonda;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), ' Vikarabad ')]")
	WebElement SelectcityVikarabad;

	@FindBy(xpath = "// p[@class='madhapur-city'][contains(text(), ' Shamshabad ')]")
	WebElement SelectcityShamshabad;

	@FindBy(xpath = "//b[text()='No Product Found']")
	WebElement productnotfound;

	public SelectCity(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void selectcity() throws InterruptedException {
		Thread.sleep(5000);
		Select dropdown = new Select(selectcity);
		Thread.sleep(5000);
		List<WebElement> options = dropdown.getOptions();

		int numberOfOptions = options.size();

		for (int i = 1; i < numberOfOptions; i++) { // Start from index 1
			Thread.sleep(5000);
			if (options.get(i).isEnabled()) {
				dropdown.selectByIndex(i);
				System.out.println("Selected city option: " + dropdown.getFirstSelectedOption().getText());
				Thread.sleep(5000);

				// Check if "Product not found" message appears
				boolean productNotFoundDisplayed = isProductNotFoundDisplayed();
				if (productNotFoundDisplayed) {
					System.out.println("Product not found for city: " + dropdown.getFirstSelectedOption().getText());
				} else {
					// Products found, add your code to handle this scenario
					System.out.println("Products found for city: " + dropdown.getFirstSelectedOption().getText());
					// Add your logic to interact with the found products here
					// For example, you can navigate to a different page, interact with elements,
					// etc.
				}
			} else {
				System.out.println("Option at index " + i + " is disabled");
			}
		}

	}

	private boolean isProductNotFoundDisplayed() {
		try {

			return productnotfound.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;

		}
	}
}
