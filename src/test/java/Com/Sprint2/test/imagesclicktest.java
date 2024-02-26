package Com.Sprint2.test;

import org.testng.annotations.Test;

import com.sprint2.imagesclick;

import Base.launchbrowser;
import LoginModule.LoginPage;

public class imagesclicktest extends launchbrowser {

	// verify Bracelets image click send to the price and submit
	@Test(priority = 1)
	public void ImageBracelets() throws InterruptedException {

		LoginPage LP = new LoginPage(driver);
		LP.loginpagewebelement(driver);

		imagesclick img = new imagesclick(driver);

		img.imageoneclick();

		System.out.println("<<------Bangles image process is completed------->>");

	}

//	// verify bullion image click send to the price and submit
//
//	@Test(priority = 2)
//	public void bullionimage() throws InterruptedException {
//
//		imagesclick img = new imagesclick(driver);
//
//		img.imageTwoclick();
//
//		System.out.println("<<------bullion image process is completed------->>");
//
//	}
//
//	// verify Chains image click send to the price and submit
//
//	@Test(priority = 3)
//	public void Chainsimage() throws InterruptedException {
//
//		imagesclick img = new imagesclick(driver);
//
//		img.imageTwoclick();
//
//		System.out.println("<<------Chains image process is completed------->>");
//	}
//
//	// verify Necklace image click send to the price and submit
//
//	@Test(priority = 4)
//	public void Necklaceimage() throws InterruptedException {
//
//		imagesclick img = new imagesclick(driver);
//
//		img.imageTwoclick();
//
//		System.out.println("<<------Necklace image process is completed------->>");
//	}
//
//	// verify Nose Pins image click send to the price and submit
//
//	@Test(priority = 5)
//	public void NosePins() throws InterruptedException {
//
//		imagesclick img = new imagesclick(driver);
//
//		img.imageTwoclick();
//
//		System.out.println("<<------Nose Pins image process is completed------->>");
//	}

}
