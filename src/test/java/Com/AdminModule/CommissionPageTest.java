package Com.AdminModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseModule.LaunchBrowserAdmin;

public class CommissionPageTest extends LaunchBrowserAdmin {

	@FindBy(xpath = "//table//tr")
	List<WebElement> tableRows;

	@FindBy(xpath = "//table//th")
	List<WebElement> tableHeaders;

	@FindBy(xpath = "//input[@placeholder='Search the data here...']")
	WebElement searchInput;

	@FindBy(xpath = "//button[@data-bs-toggle='modal'][normalize-space()='Pay Now'])[1]")
	List<WebElement> payNowButtons;

	public CommissionPageTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public int getTableRowCount() {
		return tableRows.size();
	}

	public int getTableHeaderCount() {
		return tableHeaders.size();
	}

	public void searchValuer(String valuerName) {
		searchInput.clear();
		searchInput.sendKeys(valuerName);
	}

	public void clickPayNowButton(int rowIndex) {
		payNowButtons.get(rowIndex - 1).click();
	}

	public String getCellValue(int rowIndex, int colIndex) {
		return tableRows.get(rowIndex).findElements(By.tagName("td")).get(colIndex).getText();
	}

	public boolean isPayNowButtonDisplayed(int rowIndex) {
		return payNowButtons.get(rowIndex - 1).isDisplayed();
	}

}
