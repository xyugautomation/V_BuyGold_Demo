package FilterModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class filterPage {
	private static final int TIMEOUT_SECONDS = 30;
	public static WebDriver driver;
	@FindBy(xpath = "//div[3]//select[1]")
	WebElement SelectCarat;

	@FindBy(xpath = "//div[4]//select[1]")
	WebElement selectWeight;

	@FindBy(xpath = "//div[5]//select[1]")
	WebElement selectPrice;

	@FindBy(xpath = "//button[normalize-space()='Reset']")
	WebElement Reset_Button;

	public filterPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void Filterss() throws InterruptedException {
		// Create a Select object from the dropdown element

		// Select an option by visible text
		Thread.sleep(TIMEOUT_SECONDS);
		// waitForElementToBeClickable(driver, SelectCarat).click();
		Select dropdown = new Select(SelectCarat);
		dropdown.selectByIndex(1);

//		Thread.sleep(TIMEOUT_SECONDS);
//		Select dropdown1 = new Select(selectWeight);
//		dropdown1.selectByIndex(2);
//
//		Thread.sleep(TIMEOUT_SECONDS);
//		Select dropdown2 = new Select(selectPrice);
//		dropdown2.selectByIndex(2);

	}

	private WebElement waitForElementToBeClickable(WebDriver driver, WebElement element) {
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(TIMEOUT_SECONDS))
				.pollingEvery(Duration.ofMillis(500)).ignoring(org.openqa.selenium.NoSuchElementException.class);

		return wait.until((ExpectedCondition<WebElement>) driver1 -> element.isEnabled() ? element : null);
	}

}
