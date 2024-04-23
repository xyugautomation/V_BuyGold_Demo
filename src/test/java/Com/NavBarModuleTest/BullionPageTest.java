package Com.NavBarModuleTest;
import org.testng.annotations.Test;

import com.NavBarModule.BullionPage;

import Com.BaseModule.launchbrowser;
public class BullionPageTest  extends launchbrowser{
	// Bullion product is display or not

		@Test(priority = 1)
		public void BullionPageProductTest() {

			BullionPage bullionPage = new BullionPage(driver);
			bullionPage.BullionProductTest();

		}

		@Test(priority = 2)
		public void BullionPageProductclickalble() throws InterruptedException {
			BullionPage bullionPage = new BullionPage(driver);
			bullionPage.BullionProductSection();

		}
}
