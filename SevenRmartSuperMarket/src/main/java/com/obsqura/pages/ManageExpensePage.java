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
	
	public void enterUserName(String username) { 
		PageUtility.enterText(usernameTextBoxElement, username);
	}
	public void enterPassword(String password) {
		PageUtility.enterText(passwordTextBoxElement, password);
	}
	public void clickOnSignInButton() {
		PageUtility.clickOnElement(signInButtonElement);
	}
	public void clickOnmanageExpenseLink() {
		PageUtility.clickOnElement(manageExpenseLinkElement);
	}
	public void clickOnDeleteIcon() {
		PageUtility.clickOnElement(deleteIconElement);
	}
	public String getAlertboxText() {
		WaitUtility.waitForAlterIsPresent(driver);
		return PageUtility.getAlertBoxText(driver);
	}
	public void toClickCancelButton() {
		WaitUtility.waitForAlterIsPresent(driver);
		PageUtility.alertCancelButton(driver);
	}
	public Alert tocheckAlertisPresent() {
		Alert alertIsPresent= WaitUtility.IsAlterIsPresent(driver);
		return alertIsPresent;
	}
}
	
