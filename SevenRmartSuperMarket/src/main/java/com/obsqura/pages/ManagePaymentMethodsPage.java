package com.obsqura.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManagePaymentMethodsPage {
	public WebDriver driver;

	public ManagePaymentMethodsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[starts-with(@class,'nav-icon fas fa-credit-card')]//following::p[text()='Manage Payment Methods']")
	WebElement managePaymentMethods;
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usernameTextBox;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTextBox;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signInButton;
	@FindBy(xpath = "(//tbody//child::a[@class='btn btn-sm btn btn-primary btncss'])[1]")
	WebElement editIcon;
	@FindBy(xpath = "//input[@id='name']")
	WebElement titleTextBox;
	@FindBy(xpath = "//input[@id='limit']")
	WebElement paylimitTextBox;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement updateButton;
	@FindBy(xpath = "//div[contains(@class,'alert alert-success alert-dismissible')]")
	WebElement successAlert;

	By tableValuesby = By.xpath("//tbody//child::tr//child::td");

	public ManagePaymentMethodsPage enterUserName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver, usernameTextBox);
		PageUtility.enterText(usernameTextBox, username);
		return this;
	}

	public ManagePaymentMethodsPage enterPassword(String password) {
		WaitUtility.waitForvisibilityOfElement(driver, passwordTextBox);
		PageUtility.enterText(passwordTextBox, password);
		return this;
	}

	public ManagePaymentMethodsPage clickOnSignInButton() {
		WaitUtility.waitForElementClickable(driver, signInButton);
		PageUtility.clickOnElement(signInButton);
		return this;
	}

	public ManagePaymentMethodsPage clickOnManagePaymentMethods() {
		WaitUtility.waitForElementClickable(driver, managePaymentMethods);
		managePaymentMethods.click();
		return this;
	}

	public void clickOnEditIcon() {
		WaitUtility.waitForElementClickable(driver, editIcon);
		editIcon.click();
	}

	public ManagePaymentMethodsPage editPaymentMethods(String title, String paymentLimit) throws IOException {
		WaitUtility.waitForvisibilityOfElement(driver, titleTextBox);
		WaitUtility.waitForvisibilityOfElement(driver, paylimitTextBox);
		titleTextBox.clear();
		paylimitTextBox.clear();
		titleTextBox.sendKeys(title);
		paylimitTextBox.sendKeys(paymentLimit);
		return this;
	}

	public void clickOnUpdateButton() {
		WaitUtility.waitForElementClickable(driver, updateButton);
		updateButton.click();
	}

	public boolean checkForUpdatesInTheTable(String title, String paymentLimit) {
		String tableTitle = "";
		WaitUtility.waitForvisibilityOfElement(driver, successAlert);
		boolean isAlertDisplayed = PageUtility.isElementDisplayed(successAlert);
		List<WebElement> columnElements = driver.findElements(tableValuesby);
		for (WebElement columnElement : columnElements) {
			tableTitle = columnElement.getText();
			break;
		}
		if (tableTitle.equalsIgnoreCase(title) && isAlertDisplayed == true)
			return true;
		else {
			return false;
		}
	}
}
