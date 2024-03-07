package Com.SellNowModuleTest;

import org.testng.annotations.Test;

import com.LoginModulePage.LoginPage;
import com.SellNowPage.EmptyInputValidation;

import Base.launchbrowser;

public class EmptyInputValidationTest extends launchbrowser {

	
	@Test
	public void validatationpersonalInformationEmpty() throws InterruptedException {
		
		LoginPage LP = new LoginPage(driver);

		LP.loginpagewebelement(driver);
		
		EmptyInputValidation empty=new EmptyInputValidation(driver);
		
		empty.PersonalInformationempty();
		
	}
	
	
	
}
