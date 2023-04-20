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
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBoxElement;
	@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBoxElement;
	@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButtonElement;
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-slider' and @class='small-box-footer']") WebElement manageSliderLinkElement;
	@FindBy (xpath = "//a[@onclick='click_button(1)']") WebElement newButtonElement;
	@FindBy (xpath = "//button[@class='close']//parent::div") WebElement alertElement;
	@FindBy (xpath = "//input[@id='main_img']") WebElement choosefileButtonElement;
	@FindBy (xpath = "//input[@id='link']") WebElement httpLinkElement;
	@FindBy (xpath = "//button[@type='submit']") WebElement saveButtonElement;
	@FindBy (xpath = "//div[@class='col-sm-6']//h1[text()]") WebElement listSlidersPageNameElement;
	@FindBy (xpath = "(//a[@role='button'])[1]") WebElement statusButtonElement;
	@FindBy (xpath = "//div[starts-with(@class,'alert alert-success alert-dismissible')]") WebElement statusAlertElement;
	
	public ManageSliderPage enterUserName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver, usernameTextBoxElement);
		PageUtility.enterText(usernameTextBoxElement, username);
		return this;
	}
	public ManageSliderPage enterPassword(String password) {
		WaitUtility.waitForvisibilityOfElement(driver, passwordTextBoxElement);
		PageUtility.enterText(passwordTextBoxElement, password);
		return this;
	}
	public ManageSliderPage clickOnSignInButton() 
	{
		WaitUtility.waitForElementClickable(driver, signInButtonElement);
		PageUtility.clickOnElement(signInButtonElement);
		return this;
	}
	public ManageSliderPage clickonNewButton() {
		WaitUtility.waitForElementClickable(driver,newButtonElement);
		PageUtility.clickOnElement(newButtonElement);
		return this;
	}
	public ManageSliderPage clickOnManageSliderLink() {
		WaitUtility.waitForElementClickable(driver,manageSliderLinkElement);
		PageUtility.clickOnElement(manageSliderLinkElement);
		return this;
	}
	public ManageSliderPage imageFileUpload() throws IOException {
		PageUtility.clickOnElement(choosefileButtonElement);
	    Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\ImageSmiley.exe"); 
	    return this;
	}
	public ManageSliderPage toEnterLink(String httpLink) {
		WaitUtility.waitForvisibilityOfElement(driver, httpLinkElement);
		PageUtility.enterText(httpLinkElement,httpLink );
		return this;
		}
	public ManageSliderPage clickOnSaveButton() {
		WaitUtility.waitForElementClickable(driver,saveButtonElement);
		PageUtility.clickOnElement(saveButtonElement);
		return this;
	}
	public String toGetNameOfTheDirectedPage() {
		WaitUtility.waitForvisibilityOfElement(driver, listSlidersPageNameElement);
		return PageUtility.getElementText(listSlidersPageNameElement);
	}
	public ManageSliderPage clickOnStatusButton() {
		WaitUtility.waitForElementClickable(driver,statusButtonElement);
		PageUtility.clickOnElement(statusButtonElement);
		return this;
		}
	public boolean isAlertPresent() {
		WaitUtility.waitForvisibilityOfElement(driver,statusAlertElement);
		boolean isAlertDisplayed= PageUtility.isElementDisplayed(statusAlertElement);
		return isAlertDisplayed;
	}
}
