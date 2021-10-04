package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.page.PageModel;

public class DropDownAutomation {
    public static void main(String n[]) {
    	WebDriver wd=SiteLoader.load("http://www.google.co.in");
    	PageModel.search(wd).sendKeys("Area Conversion");
    	//PageModel.button(wd).click();
    	JavascriptExecutor js=(JavascriptExecutor)wd;
    	js.executeScript("arguments[0].click()",PageModel.button(wd));
    	
    	PageModel.select1(wd).selectByIndex(6);
    }
}
