package com.obsqura.maven.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;

public class DashBoardPage {
	public WebDriver driver;
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
	}
	//By dashboardOptions=By.xpath("//div[@class='inner']//p");
	By dashboardOptions=By.xpath("//div[contains(@class,'col-lg-3 col-6')]//a");
	public void selectIcon(String input) {
		List<WebElement> dashboardIcons=driver.findElements(dashboardOptions);
		for(WebElement dashboardIcon:dashboardIcons) {
			String dashboardIconText=dashboardIcon.getText();
			if(dashboardIconText.equals(input)) {
				PageUtility.clickOnElement(dashboardIcon);
				break;
			}
		}
	}
}
