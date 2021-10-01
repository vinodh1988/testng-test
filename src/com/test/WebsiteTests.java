package com.test;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebsiteTests {
	WebDriver wd;
	Logger log=Logger.getLogger(SeleniumTests.class);
	
  @BeforeTest
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	  wd=new ChromeDriver();
  }
  
  
  @Test(priority=1)
  public void titleTest() {
	  wd.get("http://20.98.246.113/");
	  Assert.assertEquals(wd.getTitle(), "SampleSite");
  }
  
  @Test(priority=2)
  public void headerTest() {
	  List<WebElement> list=wd.findElements(By.tagName("h1"));
	  Assert.assertEquals(list.get(0).getText(), "Sales Website");
  }

}
