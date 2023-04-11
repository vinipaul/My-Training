package com.obsqura.maven.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;

public class MagnaveBarPage {
	public WebDriver driver;
	 public MagnaveBarPage(WebDriver driver) {
		 this.driver=driver;
	 }
	 By magnaveBarTitles=By.xpath("//ul[@class='navbar-nav']//a");
	 public void mainMenuOrMagnave(String input) {
		 List<WebElement> items=driver.findElements(magnaveBarTitles);
		 for(WebElement item:items) {
			 String itemtext=item.getText();
			 if(itemtext.equalsIgnoreCase(input)) {
				 PageUtility.clickOnElement(item);
				 break;
			 }
		 }
	}
}
