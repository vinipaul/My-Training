package com.obsqura.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class SingleInputFieldPageFactoryPage {
	public WebDriver driver;
	public SingleInputFieldPageFactoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "input#single-input-field") WebElement singleInputFieldElement;
	@FindBy(xpath="//button[@id='button-one']") WebElement ShowMessageButtonElement;
	@FindBy(css="div#message-one") WebElement yourMessageLabel;
	public void enterDataInSingleInputField( String input) {
		PageUtility.enterText(singleInputFieldElement,input);
	}
	public void clickOnShowMessageButton() {
		PageUtility.clickOnElement(ShowMessageButtonElement);
	}
	public String getYourMessageLabelText() {
		String yourMessageLabelText= PageUtility.getElementText(yourMessageLabel);
		return yourMessageLabelText;
	}
}
