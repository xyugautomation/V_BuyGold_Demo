package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

	@BeforeMethod
	public void secondmethod() {

		System.out.println("This method belong to BeforeMethod");

	}

	@Test(priority = 2)
	public void Test2Method() {

		System.out.println("Test Two Method");

	}

	@Test(priority = 3)
	public void Test5Method() {

		System.out.println("Test Three Method");

	}

	@AfterMethod
	public void ThirdMethod() {

		System.out.println("This method belong to aftermethod");
	}

	@AfterTest
	public void Test3Method() {

		System.out.println("This method AfterTest");

	}

	@Test
	public void fristmethod() {

		System.out.println("Test one Method");

	}

	@BeforeTest
	public void Test4Method() {

		System.out.println("This method BeforeTest");

	}

	@BeforeClass
	public void TestClass() {

		System.out.println("This method BeforeClass");

	}

	@AfterClass
	public void Test1Class() {

		System.out.println("This method AfterClass");

	}

}
