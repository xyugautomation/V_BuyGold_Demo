package Com.PageNavigationTest;

import org.testng.annotations.Test;

import com.PageNavigation.PageNavigation;

import Base.launchbrowser;

public class PageNavigationTest extends launchbrowser {

	@Test(priority =2)
	public void AllPageNavigationTest() throws InterruptedException {

		PageNavigation PageNavigation = new PageNavigation(driver);

		PageNavigation.AllPageNavigation(driver);

	}

}
