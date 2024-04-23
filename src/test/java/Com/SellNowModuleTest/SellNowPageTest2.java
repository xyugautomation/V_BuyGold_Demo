package Com.SellNowModuleTest;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.LoginModulePage.LoginPage;
import com.SellNowPage.sellNowPageTestexample;

import Com.BaseModule.launchbrowser;

public class SellNowPageTest2 extends launchbrowser{
	@Test
	public void validatesellnowformfillfull() throws InterruptedException, AWTException {

		LoginPage LP = new LoginPage(driver);

		LP.loginpagewebelement(driver);

		sellNowPageTestexample sellnow = new sellNowPageTestexample(driver);

		sellnow.PersonalInformation();

		sellnow.FillYourJewelleryDetails();

		sellnow.fileupload();

		sellnow.selectValuer();

	}




}

