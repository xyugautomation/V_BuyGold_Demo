package Com.NavBarModuleTest;
import org.testng.annotations.Test;

import com.NavBarModule.ChainsPage;

import Base.launchbrowser;
public class ChainsPageTest extends launchbrowser{
	// chains product is display or not

		@Test(priority = 1)
		public void chainsProductTest() {

			ChainsPage chainsPage = new ChainsPage(driver);
			chainsPage.ChainsProductTest();

		}

		@Test(priority = 2)
		public void chainsProductclickalble() throws InterruptedException {
			ChainsPage chainsPage = new ChainsPage(driver);
			chainsPage.ChainsProductSection();

		}
}
