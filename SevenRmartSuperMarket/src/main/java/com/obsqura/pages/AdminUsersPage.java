package com.obsqura.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FakerUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUsersPage {
	public WebDriver driver;
	public AdminUsersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBox;
	@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBox;
	@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButton;
	@FindBy (xpath = "//a[contains(@class,'btn btn-rounded btn-danger')]") WebElement newButton;
	@FindBy (xpath = "//select[@id='user_type']") WebElement usertypedropdownElement;
	@FindBy (xpath = "//a[contains(@class,'btn btn-rounded btn-warning')]") WebElement resetButton;
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and  @class='small-box-footer']") WebElement adminUsersLink;
	@FindBy (xpath = "//input[@id='username']") WebElement newUsernameTextBox;
	@FindBy (xpath = "//input[@id='password']") WebElement newPassword;
	@FindBy (xpath = "//button[@name='Create']") WebElement newUserSaveButton;
	@FindBy (xpath = "//div[contains(@class,'alert alert-success alert-dismissible')]") WebElement successAlert;
	@FindBy (xpath = "//a[@onclick='click_button(2)']") WebElement searchButton;
	@FindBy (xpath = "//input[@id='un']") WebElement searchusernameTextBox;
	@FindBy (xpath = "//button[@name='Search']") WebElement searchSubmitButton;
		
	By TableValuesBy=By.xpath("//tbody//child::tr//child::td");
	
	public AdminUsersPage enterUserName(String username) {
		PageUtility.enterText(usernameTextBox, username);
		return this;
	}
	public AdminUsersPage enterPassword(String password) {
		PageUtility.enterText(passwordTextBox, password);
		return this;
	}
	public AdminUsersPage clickOnSignInButton() {
		PageUtility.clickOnElement(signInButton);
		return this;
	}
	public AdminUsersPage clickonNewButton() {
		WaitUtility.waitForElementClickable(driver, newButton);
		PageUtility.clickOnElement(newButton);
		return this;
	}
	public String togetbackGroundColorofButton() {
		return(PageUtility.getcssValueofElement(resetButton,"background-color"));
	}
	public AdminUsersPage clickOnAdminUsersLink() {
		WaitUtility.waitForElementClickable(driver, adminUsersLink);
		PageUtility.clickOnElement(adminUsersLink);
		return this;
	}
	public AdminUsersPage enterNewUserName(String newUserName) {
		WaitUtility.waitForvisibilityOfElement(driver,newUsernameTextBox);
		newUsernameTextBox.sendKeys(newUserName);
		return this;
	}
	public AdminUsersPage enterAdminUsersDetails() {
		WaitUtility.waitForvisibilityOfElement(driver,newPassword);
		newPassword.sendKeys(FakerUtility.fakePassword());
		WaitUtility.waitForvisibilityOfElement(driver, usertypedropdownElement);
		PageUtility.selectDropdownbyIndex(usertypedropdownElement, 2);
		return this;
	}
	public AdminUsersPage clickOnSaveButton() {
		WaitUtility.waitForElementClickable(driver, newUserSaveButton);
		newUserSaveButton.click();
		return this;
	}
	public AdminUsersPage clickOnSearchButton() {
		WaitUtility.waitForElementClickable(driver, searchButton);
		searchButton.click();
		return this;
	}
	public AdminUsersPage clickOnSearchSubmitButton() {
		WaitUtility.waitForElementClickable(driver, searchSubmitButton);
		searchSubmitButton.click();
		return this;
	}
	public AdminUsersPage enterUserNameToSearch(String searchUser) {
		searchusernameTextBox.clear();
		WaitUtility.waitForvisibilityOfElement(driver, searchusernameTextBox);
		searchusernameTextBox.sendKeys(searchUser);
		return this;
	}
	public boolean checkInTtheTable(String newUserName) {
		String userNameInTheTable="";
		WaitUtility.waitForvisibilityOfElement(driver, successAlert);
		boolean isSuccesAlertDisplayed=PageUtility.isElementDisplayed(successAlert);
		List<WebElement> columnElements=driver.findElements(TableValuesBy);
		for (WebElement columnElement:columnElements) {
		userNameInTheTable= columnElement.getText();
	    break;
		}
		if(newUserName.equalsIgnoreCase(userNameInTheTable) && isSuccesAlertDisplayed==true)
			return true;
		else {
			return false;
		}
	}
	public boolean searchInTheTable(String searchUser) {
		String searchUserNameInTheTable="";
		int flag=0;
		List<WebElement> columnElements=driver.findElements(TableValuesBy);
		for (WebElement columnElement:columnElements) {
			searchUserNameInTheTable= columnElement.getText();
			if(searchUserNameInTheTable.equalsIgnoreCase(searchUser)) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			return true;
		else 
		return false;
	}
	public String searchNonExistingUser(String nonExistingUser) {
		String searchUserNameInTheTable="";
		List<WebElement> columnElements=driver.findElements(TableValuesBy);
		for (WebElement columnElement:columnElements) {
			searchUserNameInTheTable= columnElement.getText();
			break;
		}
		return searchUserNameInTheTable;
	}
}




















