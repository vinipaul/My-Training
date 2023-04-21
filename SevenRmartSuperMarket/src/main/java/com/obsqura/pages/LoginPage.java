package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LoginPage {
public WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBoxElement;
@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBoxElement;
@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButtonElement;
@FindBy (xpath = "//input[@id='remember']") WebElement remembermeCheckboxElement;
@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page' and  @class='small-box-footer']") WebElement moreInfoLinkElement;

public LoginPage enterUserName(String username) {
	WaitUtility.waitForvisibilityOfElement(driver,usernameTextBoxElement);
	PageUtility.enterText(usernameTextBoxElement, username);
	return this;
}
public LoginPage enterPassword(String password) {
	WaitUtility.waitForvisibilityOfElement(driver,passwordTextBoxElement );
	PageUtility.enterText(passwordTextBoxElement, password);
	return this;
}
public LoginPage clickOnSignInButton() {
	WaitUtility.waitForElementClickable(driver, signInButtonElement);
	PageUtility.clickOnElement(signInButtonElement);
	return this;
}
public String signInButtonTextAlignment() {
	WaitUtility.waitForvisibilityOfElement(driver, signInButtonElement);
	String alignment= PageUtility.getcssValueofElement(signInButtonElement, "text-align");
	return alignment;
	}
public boolean isRemembermeCheckboxisSelected() {
	return(PageUtility.isElementSelected(remembermeCheckboxElement));
}
public boolean isExpectedPageElementPresent() {
	WaitUtility.waitForvisibilityOfElement(driver, moreInfoLinkElement);
	return  PageUtility.isElementDisplayed(moreInfoLinkElement);
}
}

























