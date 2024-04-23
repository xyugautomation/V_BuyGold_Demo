package Com.LoginPageTest;

import org.testng.annotations.Test;

import Com.BaseModule.launchbrowser;

public class CrossBrowserTesting extends launchbrowser{
	  @Test
	    public void testApplication() {
	        // Test your application here
	        driver.get("https://example.com");

	        // Add your test assertions here
	    }
	
}
