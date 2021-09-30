package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.info.EMIRecord;
import com.info.EMIReport;

public class HomeLoanCalculator {
	
	static WebDriver wb= SiteLoader.load("https://emicalculator.net/");
	
    public static void main(String n[]) {
    	String items[][] = {
    			{"100000000","7.5","10"},
    			{"500000000","7.5","10"},
    			{"200000000","8.5","16"},
    			{"400000000","3.5","12"},
    			{"300000000","7.5","10"},
    			{"200000000","8.5","10"},
    			{"100000000","8.5","10"},
    			{"300000000","7.5","10"},
    			{"120000000","7.5","12"},
    			{"110000000","8.5","10"}
    	};
    	
    	for(String[] x:items) {
    		doActivty(x);
    	}
    	EMIReport.report();
    }	
    
    public static void doActivty(String[] input) {
	
	 WebElement loanamount= wb.findElement(By.id("loanamount"));
	 WebElement loaninterest= wb.findElement(By.id("loaninterest"));
	 WebElement loanterm= wb.findElement(By.id("loanterm"));
	 WebElement button=wb.findElement(By.xpath("//*[@id=\"emicalculatorinnerform\"]/div[1]/div/div/div"));
	 loanamount.clear();
	 loanamount.sendKeys("\b"+input[0]);
	 loaninterest.clear();
     loaninterest.sendKeys("\b"+input[1]);
     loanterm.clear();
     loanterm.sendKeys("\b"+input[2]);
     button.click();
    EMIRecord e=new EMIRecord();
    e.setAmount(input[0]);
    e.setInterest(input[1]);
    e.setTerm(input[2]);
    e.setEmiamount(wb.findElement(By.xpath("//*[@id=\"emiamount\"]/p/span")).getText());
    e.setTotalinterest(wb.findElement(By.xpath("//*[@id=\"emitotalinterest\"]/p/span")).getText());
    e.setTotalamount(wb.findElement(By.xpath("//*[@id=\"emitotalamount\"]/p/span")).getText());
    EMIReport.addRecord(e);
  }
}
