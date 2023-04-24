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
@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBox;
@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBox;
@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButton;
@FindBy (xpath = "//input[@id='remember']") WebElement remembermeCheckbox;
@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page' and  @class='small-box-footer']") WebElement moreInfoLink;

public LoginPage enterUserName(String username) {
	WaitUtility.waitForvisibilityOfElement(driver,usernameTextBox);
	PageUtility.enterText(usernameTextBox, username);
	return this;
}
public LoginPage enterPassword(String password) {
	WaitUtility.waitForvisibilityOfElement(driver,passwordTextBox );
	PageUtility.enterText(passwordTextBox, password);
	return this;
}
public LoginPage clickOnSignInButton() {
	WaitUtility.waitForElementClickable(driver, signInButton);
	PageUtility.clickOnElement(signInButton);
	return this;
}
public String signInButtonTextAlignment() {
	WaitUtility.waitForvisibilityOfElement(driver, signInButton);
	String alignment= PageUtility.getcssValueofElement(signInButton, "text-align");
	return alignment;
	}
public boolean isRemembermeCheckboxisSelected() {
	return(PageUtility.isElementSelected(remembermeCheckbox));
}
public boolean isExpectedPageElementPresent() {
	WaitUtility.waitForvisibilityOfElement(driver, moreInfoLink);
	return  PageUtility.isElementDisplayed(moreInfoLink);
}
}

























