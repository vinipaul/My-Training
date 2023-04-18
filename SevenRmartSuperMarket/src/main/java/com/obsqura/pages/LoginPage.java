package com.obsqura.pages;

import org.openqa.selenium.By;
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
@FindBy(xpath = "//input[@id='remember']") WebElement remembermeCheckboxElement;

public boolean isUserNameTextBoxDisplayed() {
	return PageUtility.isElementDisplayed(usernameTextBoxElement);
}
public void enterUserName(String username) {
	WaitUtility.waitForvisibilityOfElement(driver,usernameTextBoxElement);
	PageUtility.enterText(usernameTextBoxElement, username);
}
public boolean ispasswordTextBoxDisplayed() {
	return PageUtility.isElementDisplayed(passwordTextBoxElement);
}
public void enterPassword(String password) {
	WaitUtility.waitForvisibilityOfElement(driver,passwordTextBoxElement );
	PageUtility.enterText(passwordTextBoxElement, password);
}
public boolean issignInButtonEnabled() {
	return PageUtility.isEnabled(signInButtonElement);
}
public void clickOnSignInButton() {
	WaitUtility.waitForElementClickable(driver, signInButtonElement);
	PageUtility.clickOnElement(signInButtonElement);
}
public boolean issignInButtonDisplayed() {
	return PageUtility.isElementDisplayed(signInButtonElement);
}
public String signInButtonTextAlignment() {
	WaitUtility.waitForvisibilityOfElement(driver, signInButtonElement);
	String alignment= PageUtility.getcssValueofElement(signInButtonElement, "text-align");
	return alignment;
	}
public boolean isRemembermeCheckboxisSelected() {
	return(PageUtility.isElementSelected(remembermeCheckboxElement));
}
}
