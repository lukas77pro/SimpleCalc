package com.comarch.training;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PositiveCases {
	SimpleCalculator simpleCalculator;

	@BeforeClass
	public void init() {
		simpleCalculator = new SimpleCalculator();
	}

	@Test(groups = { "success"}, dataProvider = "TwoArgs", dataProviderClass=DataProviderExample.class)
	public void AddingTest(int a, int b)  {

		// Given

		// When
		int z = simpleCalculator.add(a, b);

		// Than
		Assert.assertEquals(z, a+b);

	}

	@Test(groups = { "success"}, dataProvider = "TwoArgs", dataProviderClass=DataProviderExample.class)
	public void MinusTest(int a, int b)  {

		// Given

		// When
		int z = simpleCalculator.minus(a, b);

		// Than
		Assert.assertEquals(z, a-b);

	}

	@Test(groups = { "success"}, dataProvider = "TwoArgs", dataProviderClass=DataProviderExample.class)
	public void MultiplyTest(int a, int b)  {

		// Given

		// When
		int z = simpleCalculator.multiply(a, b);

		// Than
		Assert.assertEquals(z, a*b);

	}

	@Test(groups = { "success"}, dataProvider = "TwoArgs", dataProviderClass=DataProviderExample.class)
	public void DivideTest(int a, int b)  {

		// Given

		// When
		float z = simpleCalculator.divide(a, b);
		float wynik = a/b;
		// Than
		Assert.assertEquals(z, wynik);

	}
	
	@Test(groups = { "success"}, dataProvider = "OneArgs", dataProviderClass=DataProviderExample.class)
	public void AddMemoryTest(int value) {

		// Given
		simpleCalculator.memory = 0;
		

		// When
		simpleCalculator.addToMemory(value);
		int z = simpleCalculator.memory;

		// Than
		Assert.assertEquals(z, value);

	}
	
	@Test(groups = { "success"}, dataProvider = "OneArgs", dataProviderClass=DataProviderExample.class)
	public void SetMemoryTest(int value) {

		// Given

		// When
		simpleCalculator.setMemory(value);
		int x = simpleCalculator.memory;

		// Than
		Assert.assertEquals(x, value);

	}
	
	@Test(groups = { "success"}, dataProvider = "OneArgs", dataProviderClass=DataProviderExample.class)
	public void GetMemoryTest(int value) {

		// Given
		simpleCalculator.memory = value;

		// When		
		int x = simpleCalculator.getMemory();

		// Than
		Assert.assertEquals(x, value);

	}

}
