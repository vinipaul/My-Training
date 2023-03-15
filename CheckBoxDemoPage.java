package com.obsqura.maven.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxDemoPage {
public WebDriver driver;
public CheckBoxDemoPage(WebDriver driver) {
	this.driver=driver;
}
By clickOnThisCheckBox=By.cssSelector("input#gridCheck");


public WebElement clickOnThisCheckBoxElement() {
	WebElement ClickOnThisCheckBox=driver.findElement(clickOnThisCheckBox);
	return ClickOnThisCheckBox ;
}


public void selectSingleInputCheckBox() {
	clickOnThisCheckBoxElement().click();
}
}
