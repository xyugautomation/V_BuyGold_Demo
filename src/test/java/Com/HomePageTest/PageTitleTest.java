package Com.HomePageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.launchbrowser;
public class PageTitleTest extends launchbrowser {
	@Test
	public void PageTitle() {

		String i = driver.getCurrentUrl();
		System.out.println(i);
		String j = driver.getTitle();
		System.out.println("Your page title Is : " + j);
		Assert.assertEquals("V-Buy-Gold", j);
		Assert.assertEquals("V-Buy-Gold", driver.getTitle());

	}

}
