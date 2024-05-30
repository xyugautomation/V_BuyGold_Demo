package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class HelperAnnotion {

	@Test(invocationCount = 7, invocationTimeOut = 30)
	public void TestCase01() {

		System.out.println("HR");

	}

	@Test(description = "This is TestCase2")
	public void TestCase02() {

		System.out.println("Software Developer");

	}

	@Test(description = "This is TestCase3", priority = 1)
	public void TestCase03() {

		System.out.println("QA Analyst");

	}

	@Test
	public void skip_Ignore_Test() {
		String a = "Skip / Ignore Test";
		if (a.equals("Skip / Ignore Test")) {
			throw new SkipException("Skipping / Ignoring - Script not Ready for Execution ");
		} else {
			System.out.println("In else condition");
		}
		System.out.println("Out of the if else condition");
	}

}
