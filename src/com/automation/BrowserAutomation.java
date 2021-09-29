package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {
	  public static void main(String n[]) {
		  System.setProperty("webdriver.chrome.driver", "e:\\chromedriver.exe");
		  WebDriver wb=new ChromeDriver();
		  wb.get("http://www.google.co.in");
		  System.out.println(wb.getTitle());
	  }

}
