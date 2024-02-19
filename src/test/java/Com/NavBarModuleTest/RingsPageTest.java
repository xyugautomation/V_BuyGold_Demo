package Com.NavBarModuleTest;
import org.testng.annotations.Test;

import com.NavBarModule.RingsPage;

import Base.launchbrowser;
public class RingsPageTest extends launchbrowser {
	// Bracelets product is display or not

				@Test(priority = 1)
				public void RingsProductTest() {

					RingsPage ringsPage = new RingsPage(driver);
					ringsPage.RingsProductTest();

				}

				@Test(priority = 2)
				public void RingsProductclickalble() throws InterruptedException {
					RingsPage ringsPage = new RingsPage(driver);
					ringsPage.RingsProductSection();

				}
}
