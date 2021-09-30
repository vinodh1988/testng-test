package com.info;

import java.util.ArrayList;
import java.util.List;

public class EMIReport {
	public static 	List<EMIRecord> elist=new ArrayList<EMIRecord>();
	
	public static void addRecord(EMIRecord e) {
	    elist.add(e);
	}
	
	public static void report() {
		System.out.println("Amount       Interest       Tenure       EMIAmount    TotalInterest     Total Amount");
		System.out.println("-----------------------------------------------------------------------------------------------");
	
		for(EMIRecord record:elist) {
			System.out.println(record.getAmount()+"     "+record.getInterest()+
					"    "+record.getTerm()+"    "+record.getEmiamount()+"    "+record.getTotalinterest()
					+"    "+record.getTotalamount());

			
		}
	}

}
