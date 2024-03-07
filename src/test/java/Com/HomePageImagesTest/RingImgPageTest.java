package Com.HomePageImagesTest;

import org.testng.annotations.Test;

import com.HomePageImges.RingImage;
import com.LoginModulePage.LoginPage;

import Base.launchbrowser;

public class RingImgPageTest extends launchbrowser {

	@Test
	public void VerifyRingImgDetails() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.loginpagewebelement(driver);

		System.out.println("<<------...1) Rings image process is Started...------->>");
		System.out.println();
		RingImage img = new RingImage(driver);

		img.imageoneclick(driver);

		System.out.println("<<------...Rings image process is completed...------->>");
		System.out.println();

	}

}
