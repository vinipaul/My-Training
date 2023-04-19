package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	@FindBy(xpath = "//a[contains(@class,'btn btn-rounded btn-danger')]") WebElement newButtonElement;
	@FindBy(xpath = "//select[@id='user_type']") WebElement usertypedropdownElement;
	@FindBy(xpath = "//a[contains(@class,'btn btn-rounded btn-warning')]") WebElement resetButtonElement;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and  @class='small-box-footer']") WebElement adminUsersLinkElement;
			
	public void enterUserName(String username) {
		PageUtility.enterText(usernameTextBoxElement, username);
	}
	public void enterPassword(String password) {
		PageUtility.enterText(passwordTextBoxElement, password);
	}
	public void clickOnSignInButton() {
		PageUtility.clickOnElement(signInButtonElement);
	}
	public void clickonNewButton() {
		WaitUtility.waitForElementClickable(driver, newButtonElement);
		PageUtility.clickOnElement(newButtonElement);
	}
	public void toSelectFromDropDown() {
		WaitUtility.waitForvisibilityOfElement(driver, usertypedropdownElement);
		PageUtility.selectDropdownbyIndex(usertypedropdownElement, 3);
	}
	public String dropdownvalue() {
		WaitUtility.waitForvisibilityOfElement(driver, usertypedropdownElement);
		return( PageUtility.getElementText(usertypedropdownElement));
	}
	public String togetbackGroundColorofButton() {
		return(PageUtility.getcssValueofElement(resetButtonElement,"background-color"));
	}
	public void clickOnAdminUsersLink() {
		PageUtility.clickOnElement(adminUsersLinkElement);
	}
}
