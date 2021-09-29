package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.unit.BasicMath;

public class BasicMathTest {
  @Test
  public void highTest() {
	  Assert.assertEquals(BasicMath.highest(2,3), 3);
	  Assert.assertEquals(BasicMath.highest(10,2,3), 10);
	  Assert.assertEquals(BasicMath.highest(25,1,54,344,3), 344);
	  Assert.assertEquals(BasicMath.highest(), 0);
	  
  }
}
