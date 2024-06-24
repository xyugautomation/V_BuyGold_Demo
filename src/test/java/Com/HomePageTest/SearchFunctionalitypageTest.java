package Com.HomePageTest;

import org.testng.annotations.Test;

import com.HomePage.SearchFunctionalityTest2;
import com.LoginModulePage.LoginPage;

import Com.BaseModule.launchbrowser;

public class SearchFunctionalitypageTest extends launchbrowser {

	public SearchFunctionalityTest2 SearchPage;
	public LoginPage LP;

	@Test
	public void testJewelrySearch() throws InterruptedException {
		LP = new LoginPage(driver);
		LP.loginpagewebelement(driver);
		SearchPage = new SearchFunctionalityTest2(driver);
		// SearchPage.searchForItemChains();
		// SearchPage.searchForItemNosePins(driver);

		SearchPage.searchForItemsearchInputNecklace(driver);

	}
}

