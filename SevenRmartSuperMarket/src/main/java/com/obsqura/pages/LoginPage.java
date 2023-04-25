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
@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page' and  @class='small-box-footer']") WebElement moreInfoLink;
@FindBy (xpath = "//a[@data-toggle='dropdown']") WebElement AdminDropDown;
@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout' and @class='dropdown-item']") WebElement logoutButton;
@FindBy (xpath = "//p[text()='Sign in to start your session']") WebElement loginPageHeading;

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
public boolean isExpectedPageElementPresent() {
	WaitUtility.waitForvisibilityOfElement(driver, moreInfoLink);
	return  PageUtility.isElementDisplayed(moreInfoLink);
}
public LoginPage clickOnAdmin() {
	WaitUtility.waitForElementClickable(driver, AdminDropDown);
	PageUtility.clickOnElement(AdminDropDown);
	return this;
}
public LoginPage clickOnLogoutButton() {
	WaitUtility.waitForElementClickable(driver,logoutButton);
	PageUtility.clickOnElement(logoutButton);
	return this;
}
public boolean checkLogoutOrNot() {
	WaitUtility.waitForvisibilityOfElement(driver, loginPageHeading);
	return PageUtility.isElementDisplayed(loginPageHeading);
}
}

























