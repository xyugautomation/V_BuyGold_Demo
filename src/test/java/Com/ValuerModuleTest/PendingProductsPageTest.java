package Com.ValuerModuleTest;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.ValuerModule.PendingProductsPage;
import com.ValuerModule.Valuer_Login;

import Com.BaseModule.LaunchBrowserValuer;

public class PendingProductsPageTest extends LaunchBrowserValuer {

	public static PendingProductsPage Pendingpage;
	
//	 Verify that the text "Waiting for Approval" is displayed for products awaiting approval.
//	 Verify that products are displayed in the pending products module.
//	 Verify that the text "Waiting for Approval" is displayed for products awaiting approval.
//	  Verify that the back button returns to the previous page/module.
//	 Verify that the previous and next buttons are displayed for navigating between pages of products.
//	 Verify that all expected text elements are displayed on the pending products page.
//	
	
	

    @Test(priority=20)
    public void testWaitingForApprovalVisibility() throws InterruptedException {
//    	Valuer_Login loginPage = new Valuer_Login(driver);
//		loginPage.ValuerLoginWithMobileNumber(driver); 
    	
		Pendingpage =new PendingProductsPage(driver);
		
		Pendingpage.sidemenucommisonbuttonclick();
		
		boolean isDisplayed = Pendingpage.isWaitingForApprovalDisplayed();
        System.out.println("Waiting For Approval is displayed: " + isDisplayed);
        Assert.assertTrue(isDisplayed);
    }

    @Test(priority=21)
    public void testTableTextVisibility() throws InterruptedException {
    	Pendingpage =new PendingProductsPage(driver);
    	boolean isDisplayed = Pendingpage.isTableTextDisplayed();
        System.out.println("Table Text is displayed: " + isDisplayed);
        Assert.assertTrue(isDisplayed);
    }

    @Test(priority=22)
    public void testPreviousAndNextVisibility() throws InterruptedException {
    	Pendingpage =new PendingProductsPage(driver);
    	boolean isDisplayed = Pendingpage.isPreviousAndNextDisplayed();
        System.out.println("Previous And Next is displayed: " + isDisplayed);
        Assert.assertTrue(isDisplayed);
    }

    @Test(priority=23)
    public void testNoProductFoundVisibility() throws InterruptedException {
    	Pendingpage =new PendingProductsPage(driver);
    	boolean isDisplayed = Pendingpage.isNoProductFoundDisplayed();
        System.out.println("No Product Found is displayed: " + isDisplayed);
        Assert.assertTrue(isDisplayed);
    }
}
