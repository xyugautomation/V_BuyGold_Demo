package Com.Sprint_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.HomePageImges.BanglesImges;
import com.HomePageImges.BraceletsImges;
import com.HomePageImges.NecklaceImges;
import com.HomePageImges.NosePinsImges;
import com.HomePageImges.RingImage;
import com.LoginModulePage.LoginPage;
import com.NavBarModule.BanglesPage;
import com.NavBarModule.BullionPage;
import com.NavBarModule.ChainsPage;
import com.NavBarModule.EarringsPage;
import com.NavBarModule.NecklacePage;
import com.NavBarModule.NosePinsPage;
import com.NavBarModule.OtherPage;
import com.NavBarModule.PendantsPage;
import com.NavBarModule.RingsPage;
import com.NotificationPage.notificationPage;

public class All_Sprint_2_Test_Cases {

	@Test(priority = 1)
	public void aboutpage() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			WebElement linkAbout = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//span[normalize-space()='About V-Buy Gold group']")));
			if (linkAbout != null) {
				linkAbout.click();
				wait.until(ExpectedConditions.titleContains("V-Buy-Gold"));

				if (driver.getTitle().contains("V-Buy-Gold")) {
					System.out.println("About page is loaded successfully");
				} else {
					System.out.println("About page is not loaded");
				}
			} else {
				System.out.println("About link element is not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}

	@Test(priority = 2)
	public void ContactUspage() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			WebElement linkAbout = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Contact Us']")));
			if (linkAbout != null) {
				linkAbout.click();
				wait.until(ExpectedConditions.titleContains("V-Buy-Gold"));

				if (driver.getTitle().contains("V-Buy-Gold")) {
					System.out.println("contactUs page is loaded successfully");
				} else {
					System.out.println("contactUs page is not loaded");
				}
			} else {
				System.out.println("contactUs link element is not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}

	@Test(priority = 3)
	public void Heplpage() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			WebElement linkAbout = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Help']")));
			if (linkAbout != null) {
				linkAbout.click();
				wait.until(ExpectedConditions.titleContains("V-Buy-Gold"));

				if (driver.getTitle().contains("V-Buy-Gold")) {
					System.out.println("Hepl page is loaded successfully");
				} else {
					System.out.println("Hepl page is not loaded");
				}
			} else {
				System.out.println("Hepl link element is not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}

	@Test(priority = 4)
	public void LegalPrivacyinformationPage() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			WebElement linkAbout = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//span[normalize-space()='Legal & Privacy information']")));
			if (linkAbout != null) {
				linkAbout.click();
				wait.until(ExpectedConditions.titleContains("V-Buy-Gold"));

				if (driver.getTitle().contains("V-Buy-Gold")) {
					System.out.println("LegalPrivacyinformation page is loaded successfully");
				} else {
					System.out.println("LegalPrivacyinformation page is not loaded");
				}
			} else {
				System.out.println("LegalPrivacyinformation link element is not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}

	@Test(priority = 5)
	public void BraceletsProductTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");
		BanglesPage banglesPage = new BanglesPage(driver);
		banglesPage.BanglesProductTest();
		driver.close();
	}

	@Test(priority = 6)
	public void BraceletsProductclickalble() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		BanglesPage banglesPage = new BanglesPage(driver);
		banglesPage.BanglesProductSection();
		driver.close();
	}

	// Bullion product is display or not

	@Test(priority = 7)
	public void BullionPageProductTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		BullionPage bullionPage = new BullionPage(driver);
		bullionPage.BullionProductTest();
		driver.close();
	}

	@Test(priority = 8)
	public void BullionPageProductclickalble() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		BullionPage bullionPage = new BullionPage(driver);
		bullionPage.BullionProductSection();
		driver.close();
	}

	@Test(priority = 9)
	public void chainsProductTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");
		ChainsPage chainsPage = new ChainsPage(driver);
		chainsPage.ChainsProductTest();
		driver.close();
	}

	@Test(priority = 10)
	public void chainsProductclickalble() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");
		ChainsPage chainsPage = new ChainsPage(driver);
		chainsPage.ChainsProductSection();
		driver.close();
	}

	@Test(priority = 11)
	public void EarringsProductTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");
		EarringsPage earringsPage = new EarringsPage(driver);
		earringsPage.EarringsProductTest();
		driver.close();
	}

	@Test(priority = 12)
	public void EarringsProductclickalble() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");
		EarringsPage earringsPage = new EarringsPage(driver);
		earringsPage.EarringsProductSection();
		driver.close();
	}

	@Test(priority = 13)
	public void NecklaceProductTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		NosePinsPage necklacepage = new NosePinsPage(driver);
		necklacepage.NosePinsProductTest();
		driver.close();
	}

	@Test(priority = 14)
	public void NecklaceProductclickalble() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");
		NosePinsPage necklacepage = new NosePinsPage(driver);
		necklacepage.NosePinsProductSection();
		driver.close();
	}

	// Noise pin product is display or not

	@Test(priority = 15)
	public void NosePinsPageProductTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		NosePinsPage necklacepage = new NosePinsPage(driver);
		necklacepage.NosePinsProductTest();
		driver.close();
	}

	// if we are click noise pin product is display or not

	@Test(priority = 16)
	public void NosePinsPageProductclickalble() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		NosePinsPage necklacepage = new NosePinsPage(driver);
		necklacepage.NosePinsProductSection();
		driver.close();
	}

	// Bullion product is display or not

	@Test(priority = 17)
	public void OtherPageProductTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		OtherPage otherPage = new OtherPage(driver);
		otherPage.OtherProductTest();
		driver.close();
	}

	@Test(priority = 18)
	public void OtherProductclickalble() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		OtherPage otherPage = new OtherPage(driver);
		otherPage.OtherProductSection();
		driver.close();
	}

	@Test(priority = 19)
	public void PendantsPageProductTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		PendantsPage pendantsPage = new PendantsPage(driver);
		pendantsPage.PendantsProductTest();
		driver.close();
	}

	@Test(priority = 20)
	public void PendantsPageProductclickalble() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		PendantsPage pendantsPage = new PendantsPage(driver);
		pendantsPage.PendantsProductSection();
		driver.close();
	}

	// Bracelets product is display or not

	@Test(priority = 21)
	public void RingsProductTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");
		RingsPage ringsPage = new RingsPage(driver);
		ringsPage.RingsProductTest();
		driver.close();
	}

	@Test(priority = 22)
	public void RingsProductclickalble() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		RingsPage ringsPage = new RingsPage(driver);
		ringsPage.RingsProductSection();
		driver.close();
	}

	@Test(priority = 23)
	public void VerifyNotificationPage() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		LoginPage LP = new LoginPage(driver);
		LP.loginpagewebelement(driver);

		notificationPage NP = new notificationPage(driver);

		NP.verifynotificationbutton(driver);
		driver.close();
	}

	// verify Bangles image click send to the price and submit

	@Test(priority = 24)
	public void VerifyBanglesImgDetails() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		System.out.println("<<------5) Bangles image process is completed------->>");
		System.out.println();
		BanglesImges img = new BanglesImges(driver);

		img.imageFiveclick(driver);

		System.out.println("<<------Bangles image process is completed------->>");
		System.out.println();
		driver.close();
	}

	@Test(priority = 25)
	public void VerifyBraceletsImgDetails() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		System.out.println("<<------...1) Bracelets image process is Started...------->>");
		System.out.println();
		BraceletsImges img = new BraceletsImges(driver);

		img.imageFourclick(driver);

		System.out.println("<<------...Bracelets image process is completed...------->>");
		System.out.println();
		driver.close();
	}

	@Test(priority = 26)
	public void VerifyNecklaceImgDetails() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		System.out.println("<<------...1) Necklace image process is Started...------->>");
		System.out.println();
		NecklaceImges img = new NecklaceImges(driver);

		img.imageTwoclick(driver);

		System.out.println("<<------...Necklace image process is completed...------->>");
		System.out.println();
		driver.close();
	}

	@Test(priority = 27)
	public void VerifyNosePinsImgDetails() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");
		System.out.println("<<------...1) Nose Pins image process is Started...------->>");
		System.out.println();
		NosePinsImges img = new NosePinsImges(driver);

		img.imageThreeclick(driver);

		System.out.println("<<------...Nose Pins image process is completed...------->>");
		System.out.println();
		driver.close();
	}

	@Test(priority = 28)
	public void VerifyRingImgDetails() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://52.77.24.76/");

		System.out.println("<<------...1) Rings image process is Started...------->>");
		System.out.println();
		RingImage img = new RingImage(driver);

		img.imageoneclick(driver);

		System.out.println("<<------...Rings image process is completed...------->>");
		System.out.println();
		driver.close();
	}

	@AfterTest
	public void driverclosed(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}

}
