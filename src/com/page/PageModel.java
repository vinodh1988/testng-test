package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageModel {
  
  private   static By searchbox = By.name("q");
  private static By searchButton = By.name("btnK");
  private static By selectItem1 = By.xpath("//*[@jsname=\"MVliGc\"]");
  public static  WebElement search(WebDriver wb) {
	  return wb.findElement(searchbox);
  }
  
  public static  WebElement button(WebDriver wb) {
	  return wb.findElement(searchButton);
  }
  
  public static  Select select1(WebDriver wb) {
	  return new Select(wb.findElement(selectItem1));
  }
}
