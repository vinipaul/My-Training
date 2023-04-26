package com.obsqura.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageLocationPage {
	public WebDriver driver;
	public ManageLocationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBox;
	@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBox;
	@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButton;
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-location' and @class='small-box-footer']") WebElement manageLocationPage;
	@FindBy (xpath = "//a[@onclick='click_button(1)']") WebElement newButton;
	@FindBy (xpath = "//select[@id='country_id']") WebElement countryDropDown;
	@FindBy (xpath = "//select[@id='st_id']") WebElement stateDropDown;
	@FindBy (xpath = "//input[@id='location']") WebElement locationTextBox;
	@FindBy (xpath = "//input[@id='delivery']") WebElement deliveryChargeTextBox;
	@FindBy (xpath = "//button[@type='submit']") WebElement saveButton;
	@FindBy (xpath = "//div[contains(@class,'alert alert-success alert-dismissible')]") WebElement successAlert;
	
	By TableValuesBy=By.xpath("//tbody//child::tr//child::td");
	
	public ManageLocationPage enterUserName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver, usernameTextBox);
		PageUtility.enterText(usernameTextBox, username);
		return this;
	}
	public ManageLocationPage enterPassword(String password) {
		WaitUtility.waitForvisibilityOfElement(driver, passwordTextBox);
		PageUtility.enterText(passwordTextBox, password);
		return this;
	}
	public ManageLocationPage clickOnSignInButton() 
	{
		WaitUtility.waitForElementClickable(driver, signInButton);
		PageUtility.clickOnElement(signInButton);
		return this;
	}
	public ManageLocationPage clickonNewButton() {
		WaitUtility.waitForElementClickable(driver,newButton);
		PageUtility.clickOnElement(newButton);
		return this;
	}
	public ManageLocationPage clickOnManageLocationLink() {
		WaitUtility.waitForElementClickable(driver,manageLocationPage);
		PageUtility.clickOnElement(manageLocationPage);
		return this;
	}
	public ManageLocationPage selectCountry() {
		WaitUtility.waitForvisibilityOfElement(driver,countryDropDown);
		PageUtility.selectDropdownbyIndex(countryDropDown,1);
		return this;
	}
	public ManageLocationPage selectState() {
		WaitUtility.waitForvisibilityOfElement(driver,stateDropDown);
		PageUtility.selectDropdownbyIndex(stateDropDown,9);
		return this;
	}
	public ManageLocationPage enterLocation(String location) {
		WaitUtility.waitForvisibilityOfElement(driver,locationTextBox);
		locationTextBox.sendKeys(location);
		return this;
	}
	public ManageLocationPage enterDeliveryCharge() {
		WaitUtility.waitForvisibilityOfElement(driver,deliveryChargeTextBox);
		deliveryChargeTextBox.sendKeys("500");
		return this;
	}
	public ManageLocationPage clickonSaveButton() {
		WaitUtility.waitForElementClickable(driver,saveButton);
		PageUtility.clickOnElement(saveButton);
		return this;
	}
	public boolean checkInTheTable(String location) {
		String searchLocationInTheTable="";
		int flag=0;
		WaitUtility.waitForvisibilityOfElement(driver, successAlert);
		boolean isAlertPresent=PageUtility.isElementDisplayed(successAlert);
		driver.navigate().back();
		driver.navigate().back();
		List<WebElement> columnElements=driver.findElements(TableValuesBy);
		for (WebElement columnElement:columnElements) {
			searchLocationInTheTable= columnElement.getText();
			if(searchLocationInTheTable.equalsIgnoreCase(location)&& isAlertPresent==true) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			return true;
		else 
		return false;
	}
}
