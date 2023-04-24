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
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBox;
	@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBox;
	@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButton;
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-notifications' and @class=' nav-link']") WebElement pushNotificationlink;
	@FindBy (xpath = "//input[@id='title']") WebElement titleTextBox;
	@FindBy (xpath = "//input[@id='description']") WebElement descriptionTextBox;
	@FindBy (xpath = "//button[@name='create']") WebElement sendButton;
	@FindBy (xpath = "//div[starts-with(@class,'alert alert-success alert-dismissible')]") WebElement alertBox;

	
	public PushNotificationsPage enterUserName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver,usernameTextBox);
		PageUtility.enterText(usernameTextBox, username);
		return this;
	}
	public PushNotificationsPage enterPassword(String password) {
		WaitUtility.waitForvisibilityOfElement(driver,passwordTextBox);
		PageUtility.enterText(passwordTextBox, password);
		return this;
	}
	public PushNotificationsPage clickOnSignInButton() {
		WaitUtility.waitForElementClickable(driver, signInButton);
		PageUtility.clickOnElement(signInButton);
		return this;
	}
	public PushNotificationsPage clickOnPushNotificationlink() {
		WaitUtility.waitForElementClickable(driver, pushNotificationlink);
		PageUtility.clickOnElement(pushNotificationlink);
		return this;
	}
	public PushNotificationsPage enterTitle() throws IOException{
		WaitUtility.waitForvisibilityOfElement(driver,titleTextBox);
		PageUtility.enterText(titleTextBox,ExcelUtility.getString(0, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"PushNotifications_Page"));
		return this;
	}
	public PushNotificationsPage enterDescription() throws IOException {
		WaitUtility.waitForvisibilityOfElement(driver,descriptionTextBox);
		descriptionTextBox.sendKeys(ExcelUtility.getString(0, 1,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"PushNotifications_Page"));
		return this;
	}
	public PushNotificationsPage clickOnSendButton() {
		WaitUtility.waitForElementClickable(driver, sendButton);
		sendButton.click();
		return this;
	}
	public boolean checkForAlertMessage() {
		WaitUtility.waitForvisibilityOfElement(driver,alertBox);
		return PageUtility.isElementDisplayed(alertBox);
	}
}









