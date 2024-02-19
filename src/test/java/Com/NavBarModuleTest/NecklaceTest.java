package Com.NavBarModuleTest;
import org.testng.annotations.Test;

import com.NavBarModule.NosePinsPage;

import Base.launchbrowser;
public class NecklaceTest   extends launchbrowser{
	// necklace product is display or not

		@Test(priority = 1)
		public void NecklaceProductTest() {

			NosePinsPage necklacepage = new NosePinsPage(driver);
			necklacepage.NosePinsProductTest();

		}

		@Test(priority = 2)
		public void NecklaceProductclickalble() throws InterruptedException {
			NosePinsPage necklacepage = new NosePinsPage(driver);
			necklacepage.NosePinsProductSection();

		}
}
