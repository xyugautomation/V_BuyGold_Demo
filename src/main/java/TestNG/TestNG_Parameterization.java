package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterization {

	@Parameters({ "browser" })
	@Test
	public void TestCaseOne(String browser) {

		System.out.println("Browser passed as:-" + browser);

	}

	@Parameters({ "user", "pass" })
	@Test
	public void TestCaseTwo(String user, String pass) {

		System.out.println("Parameter for UserName:" + user);
		System.out.println("Parameter for PassWord:" + pass);

	}

}
