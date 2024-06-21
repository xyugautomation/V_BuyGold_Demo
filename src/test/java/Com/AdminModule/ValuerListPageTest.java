package Com.AdminModule;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.AdminModule.LoginPage;
import com.AdminModule.ValuerListPage;

import Com.BaseModule.LaunchBrowserAdmin;
import genericUtility.WebDriverUtility;

public class ValuerListPageTest extends LaunchBrowserAdmin {

	ValuerListPage valuerListPage;

	@Test(priority=1)
	public void testTablePresence() throws InterruptedException {

		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.LoginMethod();
		
		valuerListPage = new ValuerListPage(driver);
		
		
		valuerListPage.clickonSideMenuValuerList(driver);

		Assert.assertTrue(valuerListPage.isTableDisplayed(driver));
	}

	@Test(priority=2)
	public void testHeaders() throws InterruptedException {
		List<WebElement> headers = valuerListPage.getHeaders(driver);
		Assert.assertEquals("S.No", headers.get(0).getText());
		Assert.assertEquals("Id", headers.get(1).getText());
		// Add more header checks as needed
	}

	@Test(priority=3)
	public void testRowCount() throws InterruptedException {
		List<WebElement> rows = valuerListPage.getRows(driver);
		Assert.assertEquals(10, rows.size()); 
	}

	@Test(priority=4)
	public void testColumnCount() throws InterruptedException {
		List<WebElement> columns = valuerListPage.getRows(driver).get(0).findElements(By.tagName("td"));
		Assert.assertEquals(8, columns.size()); 
	}

	@Test(priority=5)
	public void testCellData() throws InterruptedException {
		String cellData = valuerListPage.getCell(1, 3 ,driver).getText();
		Assert.assertEquals("Demo User Testing", cellData); 
	}

	@Test(priority=6)
	public void testClickViewButton() throws InterruptedException, IOException {
		
		WebDriverUtility wUtil = new WebDriverUtility();
		
		wUtil.takeScreenShot(driver, "");
		valuerListPage.clickViewButton(1 ,driver);
		
	}

	
	@Test
	public void testNoDataFound() {
		
		
		
	}
	
	
	
	
	
	
	
}
