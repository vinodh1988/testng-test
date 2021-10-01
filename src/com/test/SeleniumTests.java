package com.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SeleniumTests {
	WebDriver wd;
	Logger log=Logger.getLogger(SeleniumTests.class);
	
  @BeforeTest
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	  wd=new ChromeDriver();
  }
  
  @Test(priority = 1)
  public void testTopics() {
	  wd.get("https://www.india.gov.in/topics");
	List<WebElement> list=wd.findElements(By.xpath("//*[@id=\"block-system-main\"]/div/div[1]/div/div[3]/div/div/ul/li"));
    /*System.out.println(list.size()+ " is number of topics");
    for(WebElement x:list)
    	System.out.println(x.getText());*/
	Assert.assertEquals(list.get(2).getText(),"Commerce");
	log.info("topic tests executed");
	
  }
  
  @Test(priority=2)
  public void testLinks() {
	WebElement we=wd.findElement(By.linkText("Birth Certificate"));
	we.click();
	Assert.assertNotNull(we);
	Assert.assertEquals(wd.getCurrentUrl(),"https://www.india.gov.in/gsearch?s=Birth%20Certificate");
    log.info("Birth certificatie linke working");
  }
  
  @Test(priority=3)
  public void testHover() {
	WebElement we=wd.findElement(By.cssSelector("#nav > li.topics > a"));
	
	Assert.assertNotNull(we);
	Actions action = new  Actions(wd);
	action.moveToElement(we).perform();
	
	WebElement link=wd.findElement(By.cssSelector("#nav > li.topics > ul > li:nth-child(21) > a"));
	link.click();
	Assert.assertEquals(wd.getCurrentUrl(), "https://www.india.gov.in/topics/rural");
    log.info("mouse hovering tested");
  }
}
