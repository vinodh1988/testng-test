package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
 import static com.page.PageModel.*;

import com.page.PageModel;

public class DropDownAutomation {
    public static String execute(int type,int unit1,int unit2,String value) {
    	WebDriver wd=SiteLoader.load("http://www.google.co.in");
    	search(wd).sendKeys("Area Conversion");
    	//PageModel.button(wd).click();
    	JavascriptExecutor js=(JavascriptExecutor)wd;
    	js.executeScript("arguments[0].click()",button(wd));
    	
    	select1(wd).selectByIndex(type);
    	select2(wd).selectByIndex(unit1);
    	select3(wd).selectByIndex(unit2);
    	
        input(wd).sendKeys("\b"+value);
        
        return output(wd).getAttribute("value");
       
    }
}
