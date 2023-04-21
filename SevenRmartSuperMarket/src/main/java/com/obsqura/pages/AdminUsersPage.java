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
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBoxElement;
	@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBoxElement;
	@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButtonElement;
	@FindBy (xpath = "//a[contains(@class,'btn btn-rounded btn-danger')]") WebElement newButtonElement;
	@FindBy (xpath = "//select[@id='user_type']") WebElement usertypedropdownElement;
	@FindBy (xpath = "//a[contains(@class,'btn btn-rounded btn-warning')]") WebElement resetButtonElement;
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and  @class='small-box-footer']") WebElement adminUsersLinkElement;
	@FindBy (xpath = "//input[@id='username']") WebElement newUsernameTextBoxElement;
	@FindBy (xpath = "//input[@id='password']") WebElement newPasswordElement;
	@FindBy (xpath = "//button[@name='Create']") WebElement newUserSaveButtonElement;
		
	By TableValuesBy=By.xpath("//tbody//child::tr//child::td");
	
	public AdminUsersPage enterUserName(String username) {
		PageUtility.enterText(usernameTextBoxElement, username);
		return this;
	}
	public AdminUsersPage enterPassword(String password) {
		PageUtility.enterText(passwordTextBoxElement, password);
		return this;
	}
	public AdminUsersPage clickOnSignInButton() {
		PageUtility.clickOnElement(signInButtonElement);
		return this;
	}
	public AdminUsersPage clickonNewButton() {
		WaitUtility.waitForElementClickable(driver, newButtonElement);
		PageUtility.clickOnElement(newButtonElement);
		return this;
	}
	public String togetbackGroundColorofButton() {
		return(PageUtility.getcssValueofElement(resetButtonElement,"background-color"));
	}
	public AdminUsersPage clickOnAdminUsersLink() {
		WaitUtility.waitForElementClickable(driver, adminUsersLinkElement);
		PageUtility.clickOnElement(adminUsersLinkElement);
		return this;
	}
	public AdminUsersPage enterNewUserName(String newUserName) {
		WaitUtility.waitForvisibilityOfElement(driver,newUsernameTextBoxElement);
		newUsernameTextBoxElement.sendKeys(newUserName);
		return this;
	}
	public AdminUsersPage enterAdminUsersDetails() {
		WaitUtility.waitForvisibilityOfElement(driver,newPasswordElement);
		newPasswordElement.sendKeys(FakerUtility.fakePassword());
		WaitUtility.waitForvisibilityOfElement(driver, usertypedropdownElement);
		PageUtility.selectDropdownbyIndex(usertypedropdownElement, 2);
		return this;
	}
	public AdminUsersPage clickOnSaveButton() {
		WaitUtility.waitForElementClickable(driver, newUserSaveButtonElement);
		newUserSaveButtonElement.click();
		return this;
	}
	public boolean checkInTtheTable(String newUserName) {
		String userNameInTheTable="";
		List<WebElement> columnElements=driver.findElements(TableValuesBy);
		for (WebElement columnElement:columnElements) {
		userNameInTheTable= columnElement.getText();
	    break;
		}
		if(newUserName.equalsIgnoreCase(userNameInTheTable))
			return true;
		else {
			return false;
		}
	}
}




















