package Com.HomePageImagesTest;

import org.testng.annotations.Test;

import com.HomePageImges.NecklaceImges;
import com.LoginModulePage.LoginPage;

import Base.launchbrowser;

public class NecklaceImgPageTest extends launchbrowser {

	@Test
	public void VerifyNecklaceImgDetails() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.loginpagewebelement(driver);

		System.out.println("<<------...1) Necklace image process is Started...------->>");
		System.out.println();
		NecklaceImges img = new NecklaceImges(driver);

		img.imageTwoclick(driver);

		System.out.println("<<------...Necklace image process is completed...------->>");
		System.out.println();

	}

}
