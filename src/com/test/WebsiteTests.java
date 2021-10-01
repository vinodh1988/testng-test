package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
	  wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
  
  @Test(priority=3)
  public void messageClick() {
	  WebElement btn1=wd.findElement(By.id("btn2"));
	  btn1.click();
	  Assert.assertEquals(wd.findElement(By.id("message2")).getText(),"ASIA");
  }
  
  @Test(priority=4)
  public void messageClick2() {
	  WebElement btn1=wd.findElement(By.id("btn1"+ ""));
	  btn1.click();
	  Assert.assertEquals(wd.findElement(By.id("message")).getText(),"INDIA");
  }
}
