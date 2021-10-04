package com.automation;

import static com.page.PageModel.button;
import static com.page.PageModel.input;
import static com.page.PageModel.output;
import static com.page.PageModel.search;
import static com.page.PageModel.select1;
import static com.page.PageModel.select2;
import static com.page.PageModel.select3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DropDownAutomation {
	static WebDriver wd;
	
	static {
		 wd=SiteLoader.load("http://www.google.co.in");
			search(wd).sendKeys("Area Conversion");
	    	//PageModel.button(wd).click();
	    	JavascriptExecutor js=(JavascriptExecutor)wd;
	    	js.executeScript("arguments[0].click()",button(wd));
	}
    public static String execute(int type,int unit1,int unit2,String value) {
    	
    
    	
    	select1(wd).selectByIndex(type);
    	select2(wd).selectByIndex(unit1);
    	select3(wd).selectByIndex(unit2);
    	
        input(wd).sendKeys("\b"+value);
        
        return output(wd).getAttribute("value");
       
    }
}
