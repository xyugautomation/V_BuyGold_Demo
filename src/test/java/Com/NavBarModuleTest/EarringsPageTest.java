package Com.NavBarModuleTest;

import org.testng.annotations.Test;

import com.NavBarModule.EarringsPage;

import Com.BaseModule.launchbrowser;

public class EarringsPageTest extends launchbrowser {
	// Bracelets product is display or not

		@Test(priority = 1)
		public void EarringsProductTest() {

			EarringsPage earringsPage = new EarringsPage(driver);
			earringsPage.EarringsProductTest();

		}

		@Test(priority = 2)
		public void EarringsProductclickalble() throws InterruptedException {
			EarringsPage earringsPage = new EarringsPage(driver);
			earringsPage.EarringsProductSection();

		}
}
