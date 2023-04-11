package com.obsqura.maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.PageUtility;

public class CheckBoxDemoPageFactoryPage{
public WebDriver driver;
public CheckBoxDemoPageFactoryPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
By selectallButton=By.xpath("//input[@id='button-two']");

@FindBy(css="input#gridCheck") WebElement ClickOnThisCheckBox;

public void selectSingleInputCheckBox() {
	PageUtility.clickOnElement(ClickOnThisCheckBox);
}
public WebElement selectallButtonElement() {
	WebElement SelectallButtonElement=driver.findElement(selectallButton);
	return SelectallButtonElement;
}
}
