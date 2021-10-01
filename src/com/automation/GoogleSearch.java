package com.automation;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch {
	static Logger log=Logger.getLogger(GoogleSearch.class);
	  public static void main(String n[]) {
		  System.setProperty("webdriver.chrome.driver", "e:\\chromedriver.exe");
		  WebDriver wb=new ChromeDriver();
		  wb.get("http://www.google.co.in");
		  wb.findElement(By.name("q")).sendKeys("selenium");
		  wb.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  log.info("Log is firing");
	  }
}
