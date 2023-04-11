package com.obsqura.maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;

public class SimpleInputFormDemoPage {
	public WebDriver driver;
	public SimpleInputFormDemoPage(WebDriver driver) {
		this.driver=driver;
	}
	By singleInputField=By.cssSelector("input#single-input-field");
	By showMessageButton=By.xpath("//button[@id='button-one']");
	By yourMessageLabel=By.cssSelector("div#message-one");
	
	
	public WebElement SingleInputFieldElement() {
		WebElement singleInputFieldElement=driver.findElement(singleInputField);
		return singleInputFieldElement;
	}
	public WebElement showMessageButtonElement() {
		WebElement ShowMessageButtonElement=driver.findElement(showMessageButton);
		return ShowMessageButtonElement;
	}
	public WebElement yourMessageLabelElement() {
		WebElement yourMessageLabelElement=driver.findElement(yourMessageLabel);
		return yourMessageLabelElement;
	}
	
	
	public void enterDataInSingleInputField(String inputString) {
		//SingleInputFieldElement().sendKeys(inputString);
		PageUtility pageUtility=new PageUtility();
		pageUtility.sendKey(SingleInputFieldElement(), inputString);
	}
	public void clickOnShowMessageButton() {
		showMessageButtonElement().click();
	}
	public String getYourMessageLabelText() {
	String yourMessageLabelText=yourMessageLabelElement().getText();
	return yourMessageLabelText;
	}
}
