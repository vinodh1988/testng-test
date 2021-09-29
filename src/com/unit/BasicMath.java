package com.unit;

public class BasicMath {
	
   public static int highest(int ... a){
	   int high=0;
	   for(int i=0;i<a.length;i++) {
		   if(high<a[i])
			   high=a[i];
	   }
	   return high;
   }
}
