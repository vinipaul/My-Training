package com.obsqura.pages;

import java.util.ArrayList;
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
	By dashboardOptions=By.xpath("//div[@class='inner']//p");
	//By links=By.xpath("//div[contains(@class,'col-lg-3 col-6')]//a");
	//(//div[@class='inner']//p//parent::div[@class='inner']//following::a)[1]
	////div[@class='inner']//p//following::a[text()='More info ']
	public void selectIcon(String input) {
		 String dashboardIconText="";
		List<WebElement> dashboardIcons=driver.findElements(dashboardOptions);
		ArrayList list=new ArrayList();
		for(WebElement dashboardIcon:dashboardIcons) {
			String tempElement=dashboardOptions.toString();
			 dashboardIconText=dashboardIcon.getText();
			 if(dashboardIconText.equals(input)) {
				// driver. findElement(By.xpath((tempElement+"//parent::div[@class='inner']//following::a)[1]"
				 break;
					/*
					 * List <WebElement> moreInfoLinks=driver.findElements(links); for(WebElement
					 * moreinfoLink:moreInfoLinks) { String
					 * moreinfoattribute=moreinfoLink.getAttribute("href"); List<WebElement>
					 * linksList=driver.findElements(By.
					 * xpath("dashboardOptions//following::a[text()='More info ']"));
					 * if(moreinfoattribute.contains(dashboardIconText)) {
					 * PageUtility.clickOnElement(moreinfoLink); break; } }
					 */
				/*
				 * WebElement link= (tempElement.findElement(By.xpath(
				 * "//parent::div[@class='inner']//following::a)[1]"))); link.click();
				 */
			 }
		}
		
	}
}
