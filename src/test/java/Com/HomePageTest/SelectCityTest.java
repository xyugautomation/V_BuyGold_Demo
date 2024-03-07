package Com.HomePageTest;

import org.testng.annotations.Test;

import com.HomePage.SelectCity;
import com.LoginModulePage.LoginPage;

import Base.launchbrowser;

public class SelectCityTest  extends launchbrowser {

	
	
	@Test(priority =4)
	public void SelectCityVerify() throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		LP.loginpagewebelement(driver);

		SelectCity city = new SelectCity(driver);

		city.selectcity();

	}

}
