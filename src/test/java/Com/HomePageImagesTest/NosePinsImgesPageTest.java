package Com.HomePageImagesTest;

import org.testng.annotations.Test;

import com.HomePageImges.NosePinsImges;
import com.LoginModulePage.LoginPage;

import Base.launchbrowser;

public class NosePinsImgesPageTest extends launchbrowser {
	@Test
	public void VerifyNosePinsImgDetails() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.loginpagewebelement(driver);

		System.out.println("<<------...1) Nose Pins image process is Started...------->>");
		System.out.println();
		NosePinsImges img = new NosePinsImges(driver);

		img.imageThreeclick(driver);

		System.out.println("<<------...Nose Pins image process is completed...------->>");
		System.out.println();

	}

}
