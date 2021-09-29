package com.test;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.unit.MathOperation;

public class MathTest {
	
	@Test
	public void factorialTest() {
		AssertJUnit.assertEquals(MathOperation.factorial(5),120);
		AssertJUnit.assertEquals(MathOperation.factorial(3),6);
		AssertJUnit.assertEquals(MathOperation.factorial(0),1);
	}

}
