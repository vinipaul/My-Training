package com.obsqura.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageUsersPage {
	public WebDriver driver;
	public ManageUsersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBox;
	@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBox;
	@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButton;
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-user' and @class='small-box-footer'] ") WebElement manageUsersLink;
	@FindBy (xpath = "//a[@onclick='click_button(2)']") WebElement searchButton;
	@FindBy (xpath = "//input[@id='un']") WebElement nameTextBox;
	@FindBy (xpath = "//button[@name='Search']") WebElement searchSubmitButton;
	
	By TableValuesBy=By.xpath("//tbody//child::tr//child::td");
	
	public  ManageUsersPage enterUserName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver,usernameTextBox);
		PageUtility.enterText(usernameTextBox, username);
		return this;
	}
	public  ManageUsersPage enterPassword(String password) {
		WaitUtility.waitForvisibilityOfElement(driver,passwordTextBox );
		PageUtility.enterText(passwordTextBox, password);
		return this;
	}
	public ManageUsersPage clickOnSignInButton() {
		WaitUtility.waitForElementClickable(driver, signInButton);
		PageUtility.clickOnElement(signInButton);
		return this;
	}
	public ManageUsersPage clickonSearchButton() {
		WaitUtility.waitForElementClickable(driver,searchButton);
		PageUtility.clickOnElement(searchButton);
		return this;
	}
	public ManageUsersPage clickOnManageUsersLink() {
		WaitUtility.waitForElementClickable(driver,manageUsersLink);
		PageUtility.clickOnElement(manageUsersLink);
		return this;
	}
	public ManageUsersPage enterName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver,nameTextBox);
		nameTextBox.sendKeys(username);
		return this;
	}
	public ManageUsersPage clickonSearchSubmitButton() {
		WaitUtility.waitForElementClickable(driver,searchSubmitButton);
		PageUtility.clickOnElement(searchSubmitButton);
		return this;
	}
	public boolean searchInTtheTable(String username) {
		String userNameInTheTable="";
		List<WebElement> columnElements=driver.findElements(TableValuesBy);
		for (WebElement columnElement:columnElements) {
		userNameInTheTable= columnElement.getText();
	    break;
		}
		if(userNameInTheTable.contains(username))
			return true;
		else {
			return false;
		}
	}
}
