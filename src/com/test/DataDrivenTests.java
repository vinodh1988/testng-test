package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.automation.DropDownAutomation;

import org.apache.log4j.Logger;
import org.testng.Assert;

public class DataDrivenTests {
   Logger log=Logger.getLogger(DataDrivenTests.class);
	@DataProvider(name="unit-conversion")
	public Object[][] data()
	{
		return new Object[][]{
			{"0","1","4","1","10.7639"},
			{"0","1","4","5","53.8196"},
			{"6","1","2","1","100"},
			{"6","1","3","1","1000"}
		};
	}
	
	
	@Test(dataProvider = "unit-conversion")
	public void test(String type,String unit1,String unit2,String value,String result) {
		log.debug(result+ " "+DropDownAutomation.execute(Integer.parseInt(type),
				Integer.parseInt(unit1), 
				Integer.parseInt(unit2), value));
		Assert.assertEquals(DropDownAutomation.execute(Integer.parseInt(type),
				Integer.parseInt(unit1), 
				Integer.parseInt(unit2), value),result);
	}
}
