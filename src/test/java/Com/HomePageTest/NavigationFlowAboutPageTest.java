package Com.HomePageTest;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class NavigationFlowAboutPageTest {
	
	
	@Test
	public void aboutpage() throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	  driver.get("http://stg.vbuygold.com/");

	try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


	    WebElement linkAbout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='About Us']")));
	    if (linkAbout != null) {
	        linkAbout.click();
	        wait.until(ExpectedConditions.titleContains("V-Buy-Gold"));

	        if (driver.getTitle().contains("V-Buy-Gold")) {
	            System.out.println("About page is loaded successfully");
	        } else {
	            System.out.println("About page is not loaded");
	        }
	    } else {
	        System.out.println("About link element is not found");
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	Thread.sleep(1000);
	driver.navigate().back();
	System.out.println("Back To Home Page...!!");
	
}
}
