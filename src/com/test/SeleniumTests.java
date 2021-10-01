package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTests {
	WebDriver wd;
	
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
  }
  
  @Test(priority=2)
  public void testLinks() {
	WebElement we=wd.findElement(By.linkText("Birth Certificate"));
	we.click();
	Assert.assertNotNull(we);
	Assert.assertEquals(wd.getCurrentUrl(),"https://www.india.gov.in/gsearch?s=Birth%20Certificate");
  }
}
