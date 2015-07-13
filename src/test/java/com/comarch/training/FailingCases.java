package com.comarch.training;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FailingCases {
	SimpleCalculator simpleCalculator;
	Random rand;

	@BeforeClass
	public void init() {
		simpleCalculator = new SimpleCalculator();
		rand = new Random();
	}
	
	@Test(groups = { "failures", "important" }, dataProvider = "TwoArgs", dataProviderClass=DataProviderExample.class)
	public void MinusTest(int a, int b) {

		// Given

		// When
		int z = simpleCalculator.minus(a, b);

		// Than
		Assert.assertEquals(z, a-b + rand.nextInt(2));

	}

	@Test(groups = { "failures" }, dependsOnGroups = {"important"}, dataProvider = "TwoArgs", dataProviderClass=DataProviderExample.class)
	public void AddingTest(int a, int b) {

		// Given


		// When
		int z = simpleCalculator.add(a, b);

		// Than
		Assert.assertEquals(z, a+b);

	}
	


	@Test(groups = { "failures" }, dependsOnGroups = {"important"}, dataProvider = "TwoArgs", dataProviderClass=DataProviderExample.class)
	public void MultiplyTest(int a, int b) {

		// Given


		// When
		int z = simpleCalculator.multiply(a, b);

		// Than
		Assert.assertEquals(z, a*b);

	}



}
