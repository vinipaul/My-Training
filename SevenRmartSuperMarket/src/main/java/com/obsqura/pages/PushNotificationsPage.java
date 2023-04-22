package com.obsqura.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class PushNotificationsPage {
	public WebDriver driver;
	public PushNotificationsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBoxElement;
	@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBoxElement;
	@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButtonElement;
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-notifications' and @class=' nav-link']") WebElement pushNotificationlinkElement;
	@FindBy (xpath = "//input[@id='title']") WebElement titleTextBoxElement;
	@FindBy (xpath = "//input[@id='description']") WebElement descriptionTextBoxElement;
	@FindBy (xpath = "//button[@name='create']") WebElement sendButtonElement;
	@FindBy (xpath = "//div[starts-with(@class,'alert alert-success alert-dismissible')]") WebElement alertBoxElement;

	
	public PushNotificationsPage enterUserName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver,usernameTextBoxElement);
		PageUtility.enterText(usernameTextBoxElement, username);
		return this;
	}
	public PushNotificationsPage enterPassword(String password) {
		WaitUtility.waitForvisibilityOfElement(driver,passwordTextBoxElement);
		PageUtility.enterText(passwordTextBoxElement, password);
		return this;
	}
	public PushNotificationsPage clickOnSignInButton() {
		WaitUtility.waitForElementClickable(driver, signInButtonElement);;
		PageUtility.clickOnElement(signInButtonElement);
		return this;
	}
	public PushNotificationsPage clickOnPushNotificationlink() {
		WaitUtility.waitForElementClickable(driver, pushNotificationlinkElement);
		PageUtility.clickOnElement(pushNotificationlinkElement);
		return this;
	}
	public PushNotificationsPage enterTitle() throws IOException{
		WaitUtility.waitForvisibilityOfElement(driver,titleTextBoxElement);
		PageUtility.enterText(titleTextBoxElement,ExcelUtility.getString(0, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"PushNotifications_Page"));
		return this;
	}
	public PushNotificationsPage enterDescription() throws IOException {
		WaitUtility.waitForvisibilityOfElement(driver,descriptionTextBoxElement);
		descriptionTextBoxElement.sendKeys(ExcelUtility.getString(0, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"PushNotifications_Page"));
		return this;
	}
	public PushNotificationsPage clickOnSendButton() {
		WaitUtility.waitForElementClickable(driver, sendButtonElement);
		sendButtonElement.click();
		return this;
	}
	public boolean checkForAlertMessage() {
		WaitUtility.waitForvisibilityOfElement(driver,alertBoxElement);
		return PageUtility.isElementDisplayed(alertBoxElement);
	}
}









