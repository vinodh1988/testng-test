package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageModel {
  
  private   static By searchbox = By.name("q");
  private static By searchButton = By.name("btnK");
  
  public static  WebElement search(WebDriver wb) {
	  return wb.findElement(searchbox);
  }
  
  public static  WebElement button(WebDriver wb) {
	  return wb.findElement(searchButton);
  }
}
