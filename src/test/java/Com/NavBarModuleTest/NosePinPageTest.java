package Com.NavBarModuleTest;
import org.testng.annotations.Test;

import com.NavBarModule.NecklacePage;

import Base.launchbrowser;
public class NosePinPageTest extends launchbrowser {

	// Noise pin product is display or not

		@Test(priority = 1)
		public void NecklaceProductTest() {

			NecklacePage necklacepage = new NecklacePage(driver);
			necklacepage.NecklaceProductTest();

		}

		
		//if we are click noise pin product is display or not
		
		@Test(priority = 2)
		public void NecklaceProductclickalble() throws InterruptedException {
			NecklacePage necklacepage = new NecklacePage(driver);
			necklacepage.NecklaceProductSection();

		}

}
