package Com.HomePageTest;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NavigationFlowHelpPageTest {
	@Test
	public void Heplpage() {
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	  driver.get("http://52.77.24.76/");

	try {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    WebElement linkAbout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Help']")));
	    if (linkAbout != null) {
	        linkAbout.click();
	        wait.until(ExpectedConditions.titleContains("V-Buy-Gold"));

	        if (driver.getTitle().contains("V-Buy-Gold")) {
	            System.out.println("Hepl page is loaded successfully");
	        } else {
	            System.out.println("Hepl page is not loaded");
	        }
	    } else {
	        System.out.println("Hepl link element is not found");
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}

}
}
