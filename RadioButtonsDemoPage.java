package com.obsqura.maven.pages;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonsDemoPage {
public WebDriver driver;
public RadioButtonsDemoPage(WebDriver driver) {
	this.driver=driver;
}
By femaleRadioButton=By.cssSelector("input#inlineRadio2");
By showSelectedValueButton=By.cssSelector("button#button-one");
By showSelectedValueLabel=By.cssSelector("div#message-one");


public WebElement femaleRadioButtonElement() {
	WebElement FemaleRadioButtonElement=driver.findElement(femaleRadioButton);
	return FemaleRadioButtonElement;
}
public WebElement showSelectedValueButtonElement() {
	WebElement ShowSelectedValueButtonElement=driver.findElement(showSelectedValueButton);
	return ShowSelectedValueButtonElement;
}
public WebElement showSelectedValueLabelElement() {
	WebElement ShowSelectedValueLabelElement=driver.findElement(showSelectedValueLabel);
	return ShowSelectedValueLabelElement;
}


public void selectFemaleRadioButton() {
	femaleRadioButtonElement().click();
}
public boolean isEnabledShowSelectedValueButton() {
	return showSelectedValueButtonElement().isEnabled();
}
public void showSelectedValueButtonClick() {
	showSelectedValueButtonElement().click();
}
public String showSelectedValueLabelText() {
	String showSelectedValueButtonText=showSelectedValueLabelElement().getText();
	return showSelectedValueButtonText;
}
}
