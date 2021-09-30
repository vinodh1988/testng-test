package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeLoanCalculator {
  public static void main(String n[]) {
	 WebDriver wb= SiteLoader.load("https://emicalculator.net/");
	 WebElement loanamount= wb.findElement(By.id("loanamount"));
	 WebElement loaninterest= wb.findElement(By.id("loaninterest"));
	 WebElement loanterm= wb.findElement(By.id("loanterm"));
	 WebElement button=wb.findElement(By.xpath("//*[@id=\"emicalculatorinnerform\"]/div[1]/div/div/div"));
	 loanamount.clear();
	 loanamount.sendKeys("\b10000000");
	 loaninterest.clear();
     loaninterest.sendKeys("\b7.5");
     loanterm.clear();
     loanterm.sendKeys("\b10");
     button.click();


  }
}
