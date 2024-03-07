package Com.HomePageImagesTest;

import org.testng.annotations.Test;

import com.HomePageImges.BraceletsImges;
import com.LoginModulePage.LoginPage;

import Base.launchbrowser;

public class BraceletsImgesPageTest extends launchbrowser {
	@Test
	public void VerifyBraceletsImgDetails() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.loginpagewebelement(driver);

		System.out.println("<<------...1) Bracelets image process is Started...------->>");
		System.out.println();
		BraceletsImges img = new BraceletsImges(driver);

		img.imageFourclick(driver);

		System.out.println("<<------...Bracelets image process is completed...------->>");
		System.out.println();

	}
}
