package com.ValuerModule;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	@DataProvider(name = "data-provider1")
	public Object[][] dataProviderMethod() {

		return new Object[][] { { "1.shivshankar" }, { "2.swapnil" }, { "3.Nisha" } };

	}

	@Test(dataProvider = "data-provider1")
	public void testmethod(String data) {

		System.out.println("Data is:" + data);

	}

}
