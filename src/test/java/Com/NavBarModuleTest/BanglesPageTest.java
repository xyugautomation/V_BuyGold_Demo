package Com.NavBarModuleTest;
import org.testng.annotations.Test;

import com.NavBarModule.BanglesPage;

import Base.launchbrowser;
public class BanglesPageTest extends launchbrowser {
	// Bracelets product is display or not

			@Test(priority = 1)
			public void BraceletsProductTest() {

				BanglesPage banglesPage = new BanglesPage(driver);
				banglesPage.BanglesProductTest();

			}

			@Test(priority = 2)
			public void BraceletsProductclickalble() throws InterruptedException {
				BanglesPage banglesPage = new BanglesPage(driver);
				banglesPage.BanglesProductSection();

			}
}
