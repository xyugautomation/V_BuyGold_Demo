package Com.NavBarModuleTest;
import org.testng.annotations.Test;

import com.NavBarModule.PendantsPage;

import Com.BaseModule.launchbrowser;
public class PendantsPageTest extends launchbrowser {
	// Pendants product is display or not

		@Test(priority = 1)
		public void PendantsPageProductTest() {

			PendantsPage pendantsPage = new PendantsPage(driver);
			pendantsPage.PendantsProductTest();

		}

		@Test(priority = 2)
		public void PendantsPageProductclickalble() throws InterruptedException {
			PendantsPage pendantsPage = new PendantsPage(driver);
			pendantsPage.PendantsProductSection();

		}
}
