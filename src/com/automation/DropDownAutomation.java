package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
 import static com.page.PageModel.*;

import com.page.PageModel;

public class DropDownAutomation {
    public static void main(String n[]) {
    	WebDriver wd=SiteLoader.load("http://www.google.co.in");
    	search(wd).sendKeys("Area Conversion");
    	//PageModel.button(wd).click();
    	JavascriptExecutor js=(JavascriptExecutor)wd;
    	js.executeScript("arguments[0].click()",button(wd));
    	
    	select1(wd).selectByIndex(6);
    	select2(wd).selectByIndex(8);
    	select3(wd).selectByIndex(1);
    	
        input(wd).sendKeys("\b1000");
    }
}
