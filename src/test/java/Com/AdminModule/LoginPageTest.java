package Com.AdminModule;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminModule.LoginPage;

import Com.BaseModule.LaunchBrowserAdmin;

public class LoginPageTest extends LaunchBrowserAdmin {

	public static LoginPage loginPage;

	@Test(priority = 1)
	public void testLoginWithInvalidEmail() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.setEmail("invaliduser@example.com");
		loginPage.setPassword("validpassword");
		loginPage.clickContinue();
		Assert.assertEquals(loginPage.getErrorMessage(), "Invalid email or password");

	}

	@Test(priority = 2)
	public void testLoginWithInvalidPassword() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.clearEmail();
		loginPage.clearPassword();
		loginPage.setEmail("validuser@example.com");
		loginPage.setPassword("invalidpassword");
		loginPage.clickContinue();
		Assert.assertEquals(loginPage.getErrorMessage(), "Invalid email or password");

	}

	@Test(priority = 3)
	public void testLoginWithEmptyEmailAndPassword() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.clearEmail();
		loginPage.clearPassword();
		loginPage.setEmail("");
		loginPage.setPassword("");
		loginPage.clickContinue();
		Assert.assertEquals(loginPage.getErrorMessage(), "Email and password must not be empty");

	}

	@Test(priority = 4)
	public void testLoginWithEmptyEmailField() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.clearEmail();
		loginPage.clearPassword();
		loginPage.setEmail("");
		loginPage.setPassword("validpassword");
		loginPage.clickContinue();
		Assert.assertEquals(loginPage.getErrorMessage(), "Email must not be empty");

	}

	@Test(priority = 5)
	public void testLoginWithEmptyPasswordField() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.clearEmail();
		loginPage.clearPassword();
		loginPage.setEmail("validuser@example.com");
		loginPage.setPassword("");
		loginPage.clickContinue();
		Assert.assertEquals(loginPage.getErrorMessage(), "Password must not be empty");

	}

	@Test(priority = 6)
	public void testSuccessfulLogin() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.clearEmail();
		loginPage.clearPassword();
		loginPage.setEmail("admin@vbuygold.com");
		loginPage.setPassword("admin.vbuy@2023");
		loginPage.clickContinue();

	}
}
