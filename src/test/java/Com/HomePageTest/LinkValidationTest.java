package Com.HomePageTest;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.BaseModule.launchbrowser;
public class LinkValidationTest  extends launchbrowser {
	@Test
	   public static void links() {
	       
	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        // Iterate through each link and check its status
	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	            verifyLinkStatus(url);
	        }

	        
	    }

	    // Method to verify the status of a link
	    public static void verifyLinkStatus(String linkURL) {
	        try {
	            // Create a URL object
	            URL url = new URL(linkURL);

	            // Open a connection to the URL
	            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

	            // Get the status code
	            int statusCode = httpURLConnection.getResponseCode();

	            // Log the result
	            if (statusCode == 200) {
	                System.out.println(linkURL + " is a valid link.");
	            } else {
	                System.out.println(linkURL + " is a broken link. Status code: " + statusCode);
	            }

	        } catch (IOException e) {
	            System.out.println(linkURL + " is a broken link. Exception: " + e.getMessage());
	        }
	    }
}
