package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteLoader {
   public static WebDriver load(String url) {
	   System.setProperty("webdriver.chrome.driver", "e:\\chromedriver.exe");
	   WebDriver wb=new ChromeDriver();
		  wb.get(url);
		  return wb;
   }
}
