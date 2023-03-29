package com.obsqura.maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class RadiButtonDemoPageFactoryPage {
public WebDriver driver;
public RadiButtonDemoPageFactoryPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

By showSelectedValueButtonElement=By.cssSelector("button#button-one");

@FindBy(css="input#inlineRadio2") WebElement femaleRadioButton;
@FindBy(css="button#button-one") WebElement showSelectedValueButton;
@FindBy(css="div#message-one") WebElement showSelectedValueLabel;

public WebElement showSelectedValueButtonElement() {
	WebElement ShowSelectedValueButtonElement=driver.findElement(showSelectedValueButtonElement);
	return ShowSelectedValueButtonElement;
}
public void selectFemaleRadioButton() {
	PageUtility.clickOnElement(femaleRadioButton);
}
public boolean isEnabledShowSelectedValueButton() {
	//return showSelectedValueButtonElement().isEnabled();
	PageUtility pageUtility=new PageUtility();
	boolean status= pageUtility.isEnabled(showSelectedValueButton);
	return status;
}
public void showSelectedValueButtonClick() {
	//showSelectedValueButtonElement().click();
	PageUtility.clickOnElement(showSelectedValueButton);
}
public String showSelectedValueLabelText() {
	//String showSelectedValueButtonText=showSelectedValueLabelElement().getText();
	PageUtility pageUtility=new PageUtility();
	String showSelectedValueLabelText=pageUtility.getElementText(showSelectedValueLabel);
	return showSelectedValueLabelText;
}
}
