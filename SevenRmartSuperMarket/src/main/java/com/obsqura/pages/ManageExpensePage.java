package com.obsqura.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageExpensePage {
	public WebDriver driver;
	public ManageExpensePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBoxElement;
	@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBoxElement;
	@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButtonElement;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/expense' and @class='small-box-footer']")WebElement manageExpenseLinkElement;
	@FindBy (xpath = "(//i[@class='fas fa-trash-alt'])[1]") WebElement deleteIconElement;
	
	public ManageExpensePage enterUserName(String username) { 
		PageUtility.enterText(usernameTextBoxElement, username);
		return this;
	}
	public ManageExpensePage enterPassword(String password) {
		PageUtility.enterText(passwordTextBoxElement, password);
		return this;
	}
	public ManageExpensePage clickOnSignInButton() {
		PageUtility.clickOnElement(signInButtonElement);
		return this;
	}
	public ManageExpensePage clickOnmanageExpenseLink() {
		PageUtility.clickOnElement(manageExpenseLinkElement);
		return this;
	}
	public ManageExpensePage clickOnDeleteIcon() {
		PageUtility.clickOnElement(deleteIconElement);
		return this;
	}
	public String getAlertboxText() {
		WaitUtility.waitForAlterIsPresent(driver);
		return PageUtility.getAlertBoxText(driver);
	}
	public ManageExpensePage toClickCancelButton() {
		WaitUtility.waitForAlterIsPresent(driver);
		PageUtility.alertCancelButton(driver);
		return this;
	}
	public Alert tocheckAlertisPresent() {
		Alert alertIsPresent= WaitUtility.IsAlterIsPresent(driver);
		return alertIsPresent;
	}
}
	
