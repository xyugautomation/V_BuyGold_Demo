package Com.HomePageImagesTest;

import org.testng.annotations.Test;

import com.HomePageImges.BanglesImges;
import com.LoginModulePage.LoginPage;

import Com.BaseModule.launchbrowser;

public class BanglesImgPageTest extends launchbrowser {

	// verify Bangles image click send to the price and submit

	@Test(priority = 5)
	public void VerifyBanglesImgDetails() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.loginpagewebelement(driver);

		System.out.println("<<------5) Bangles image process is completed------->>");
		System.out.println();
		BanglesImges img = new BanglesImges(driver);

		img.imageFiveclick(driver);

		System.out.println("<<------Bangles image process is completed------->>");
		System.out.println();
	}

}
