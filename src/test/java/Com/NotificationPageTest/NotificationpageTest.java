package Com.NotificationPageTest;

import org.testng.annotations.Test;

import com.LoginModulePage.LoginPage;
import com.NotificationPage.notificationPage;

import Base.launchbrowser;

public class NotificationpageTest extends launchbrowser {
	
	
	@Test(priority =3)
	public void VerifyNotificationPage() throws InterruptedException {

//		LoginPage LP = new LoginPage(driver);
//		LP.loginpagewebelement(driver);

		notificationPage NP = new notificationPage(driver);

		NP.verifynotificationbutton(driver);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
