package com.obsqura.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageExpensePage {
	public WebDriver driver;

	public ManageExpensePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usernameTextBox;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTextBox;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signInButton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/expense' and @class='small-box-footer']")
	WebElement manageExpenseLink;
	@FindBy(xpath = "(//i[@class='fas fa-trash-alt'])[1]")
	WebElement deleteIcon;
	@FindBy(xpath = "(//tbody//child::tr//child::td)[1]")
	WebElement supposeddeleteTitle;

	By TableValuesBy = By.xpath("//tbody//child::tr//child::td");

	public ManageExpensePage enterUserName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver, usernameTextBox);
		PageUtility.enterText(usernameTextBox, username);
		return this;
	}

	public ManageExpensePage enterPassword(String password) {
		WaitUtility.waitForvisibilityOfElement(driver, passwordTextBox);
		PageUtility.enterText(passwordTextBox, password);
		return this;
	}

	public ManageExpensePage clickOnSignInButton() {
		WaitUtility.waitForElementClickable(driver, signInButton);
		PageUtility.clickOnElement(signInButton);
		return this;
	}

	public ManageExpensePage clickOnmanageExpenseLink() {
		WaitUtility.waitForElementClickable(driver, manageExpenseLink);
		PageUtility.clickOnElement(manageExpenseLink);
		return this;
	}

	public ManageExpensePage clickOnDeleteIcon() {
		WaitUtility.waitForElementClickable(driver, deleteIcon);
		PageUtility.clickOnElement(deleteIcon);
		return this;
	}

	public String getAlertboxText() {
		WaitUtility.waitForAlterIsPresent(driver);
		return PageUtility.getAlertBoxText(driver);
	}

	public ManageExpensePage ClickCancelButton() {
		WaitUtility.waitForAlterIsPresent(driver);
		PageUtility.alertCancelButton(driver);
		return this;
	}

	public Alert tocheckAlertisPresent() {
		Alert alertIsPresent = WaitUtility.IsAlterIsPresent(driver);
		return alertIsPresent;
	}

	public boolean checkSupposedTitleIsDeletedOrNot_From_TheTable() {
		WaitUtility.waitForvisibilityOfElement(driver, supposeddeleteTitle);
		return PageUtility.isElementDisplayed(supposeddeleteTitle);
	}
}
