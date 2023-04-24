package com.obsqura.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageSliderPage {
	public WebDriver driver;
	public ManageSliderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBox;
	@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBox;
	@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButton;
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-slider' and @class='small-box-footer']") WebElement manageSliderLink;
	@FindBy (xpath = "//a[@onclick='click_button(1)']") WebElement newButton;
	@FindBy (xpath = "//button[@class='close']//parent::div") WebElement alert;
	@FindBy (xpath = "//button[@type='submit']") WebElement saveButton;
	@FindBy (xpath = "//div[@class='col-sm-6']//h1[text()]") WebElement listSlidersPageName;
	@FindBy (xpath = "(//a[@role='button'])[1]") WebElement statusButton;
	@FindBy (xpath = "//div[starts-with(@class,'alert alert-success alert-dismissible')]") WebElement statusAlert;
	
	public ManageSliderPage enterUserName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver, usernameTextBox);
		PageUtility.enterText(usernameTextBox, username);
		return this;
	}
	public ManageSliderPage enterPassword(String password) {
		WaitUtility.waitForvisibilityOfElement(driver, passwordTextBox);
		PageUtility.enterText(passwordTextBox, password);
		return this;
	}
	public ManageSliderPage clickOnSignInButton() 
	{
		WaitUtility.waitForElementClickable(driver, signInButton);
		PageUtility.clickOnElement(signInButton);
		return this;
	}
	public ManageSliderPage clickonNewButton() {
		WaitUtility.waitForElementClickable(driver,newButton);
		PageUtility.clickOnElement(newButton);
		return this;
	}
	public ManageSliderPage clickOnManageSliderLink() {
		WaitUtility.waitForElementClickable(driver,manageSliderLink);
		PageUtility.clickOnElement(manageSliderLink);
		return this;
	}
	public ManageSliderPage clickOnSaveButton() {
		WaitUtility.waitForElementClickable(driver,saveButton);
		saveButton.click();
		return this;
	}
	public String toGetNameOfTheDirectedPage() {
		WaitUtility.waitForvisibilityOfElement(driver, listSlidersPageName);
		return PageUtility.getElementText(listSlidersPageName);
	}
	public ManageSliderPage clickOnStatusButton() {
		WaitUtility.waitForElementClickable(driver,statusButton);
		statusButton.click();
		return this;
		}
	public String beforeChange() {
		String statusBeforeChanging= PageUtility.getElementText(statusButton);
		return statusBeforeChanging;
	}
	public String afterChange() {
		statusButton.click();
		String statusAfterChanging= PageUtility.getElementText(statusButton);
		return statusAfterChanging;
	}
	
}
