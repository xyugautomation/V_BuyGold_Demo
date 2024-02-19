package Com.NavBarModuleTest;
import org.testng.annotations.Test;

import com.NavBarModule.OtherPage;

import Base.launchbrowser;
public class OtherPageTest extends launchbrowser {

	// Bullion product is display or not

		@Test(priority = 1)
		public void OtherPageProductTest() {

			OtherPage otherPage = new OtherPage(driver);
			otherPage.OtherProductTest();

		}

		@Test(priority = 2)
		public void OtherProductclickalble() throws InterruptedException {
			OtherPage otherPage = new OtherPage(driver);
			otherPage.OtherProductSection();

		}
}
