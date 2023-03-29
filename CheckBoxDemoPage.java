package com.obsqura.maven.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;

public class CheckBoxDemoPage {
public WebDriver driver;
public CheckBoxDemoPage(WebDriver driver) {
	this.driver=driver;
}
By clickOnThisCheckBox=By.cssSelector("input#gridCheck");
By selectallButton=By.xpath("//input[@id='button-two']");


public WebElement clickOnThisCheckBoxElement() {
	WebElement ClickOnThisCheckBox=driver.findElement(clickOnThisCheckBox);
	return ClickOnThisCheckBox ;
}
public WebElement selectallButtonElement() {
	WebElement SelectallButtonElement=driver.findElement(selectallButton);
	return SelectallButtonElement;
}


public void selectSingleInputCheckBox() {
	//clickOnThisCheckBoxElement().click();
	PageUtility pageutility=new PageUtility();
	pageutility.clickOnElement(clickOnThisCheckBoxElement());
}

}
