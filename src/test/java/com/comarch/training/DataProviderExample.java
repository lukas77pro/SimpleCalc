package com.comarch.training;

import org.testng.annotations.DataProvider;

public class DataProviderExample {

	@DataProvider(name = "TwoArgs")
	public static Object[][] getClient1Data() {
		return new Object[][] { { 10, 5 }, { 2, 5 }, { 7, 6 }, { 7, 6 }, { -2, 11 }, { 17, 222 }, { -7, 14 }, { -7, 2 },
				{ 1, -4 }, { 0, -5 } };
	}
	
	@DataProvider(name = "OneArgs")
	public static Object[][] getClient1Data2() {
		return new Object[][] { {10}, {22}, {-131}, {102}, {0}, {35}, {81}, {2150}, {-2121}, {77} };
	}

}
