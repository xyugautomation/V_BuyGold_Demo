package Com.HomePageTest;
import org.testng.annotations.Test;


import com.HomePage.SearchFunctionalityTest2;

import Base.launchbrowser;
import LoginModule.LoginPage;
public class SearchFunctionalitypageTest extends launchbrowser {
	@Test
	public void validateSearchFucntionality() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);

		LP.loginpagewebelement(driver);

		SearchFunctionalityTest2 search = new SearchFunctionalityTest2(driver);
		 search.searchFunctionality();

	//	search.selectcity();

	}
}
