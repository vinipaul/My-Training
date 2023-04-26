package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageDeliveryBoyPage {
	public WebDriver driver;
	public  ManageDeliveryBoyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBox;
	@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBox;
	@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButton;
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy' and @class='small-box-footer']") WebElement manageDeliveryBoyLink;
	@FindBy (xpath = "(//i[starts-with(@class,'fa fa-angle-double-down')])[1]") WebElement passwordIcon;
	@FindBy (xpath = "(//div[@class='profile-info-name'])[1]") WebElement passwordRaw;
	
	By TableValuesBy=By.xpath("//tbody//child::tr//child::td");
	
	public ManageDeliveryBoyPage enterUserName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver,usernameTextBox);
		PageUtility.enterText(usernameTextBox, username);
		return this;
	}
	public ManageDeliveryBoyPage enterPassword(String password) {
		WaitUtility.waitForvisibilityOfElement(driver,passwordTextBox);
		PageUtility.enterText(passwordTextBox, password);
		return this;
	}
	public ManageDeliveryBoyPage clickOnSignInButton() {
		WaitUtility.waitForElementClickable(driver,signInButton);
		PageUtility.clickOnElement(signInButton);
		return this;
	}
	public ManageDeliveryBoyPage clickOnManageDeliveryBoy() {
		WaitUtility.waitForElementClickable(driver,manageDeliveryBoyLink);
		PageUtility.clickOnElement(manageDeliveryBoyLink);
		return this;
	}
	public ManageDeliveryBoyPage clickOnPasswordIcon() {
		WaitUtility.waitForElementClickable(driver,passwordIcon);
		PageUtility.clickOnElement(passwordIcon);
		return this;
	}
	public boolean isPasswordRawPresent() {
		WaitUtility.waitForvisibilityOfElement(driver,passwordRaw);
		return PageUtility.isElementDisplayed(passwordRaw);
	}
}
