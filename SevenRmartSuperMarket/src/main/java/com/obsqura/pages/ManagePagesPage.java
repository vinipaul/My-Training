package com.obsqura.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManagePagesPage{
public WebDriver driver;
public ManagePagesPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath = "//a[text()=' New']") WebElement newButtonElement;
@FindBy(xpath = "//input[@id='title']") WebElement titleElement;
@FindBy(xpath = "//input[@id='page']") WebElement pageElement;
@FindBy(xpath = "//button[@type='submit']") WebElement saveButtonElement;
@FindBy(xpath = "//a[contains(@class,'btn btn-rounded btn-primary')]") WebElement searchButtonElement;
@FindBy (xpath = "//input[@placeholder='Title']") WebElement ListPageTitleTextBoxElement;
@FindBy (xpath ="//button[@name='Search']") WebElement ListPageSearchButtonElement;
@FindBy (xpath = "//span[@id='res']//child::center") WebElement resultNotFoundElement;
@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBoxElement;
@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBoxElement;
@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButtonElement;
@FindBy(xpath = "(//div[contains(@class,'col-lg-3 col-6')]//a)[1]") WebElement managepagesLinkElement;
@FindBy(xpath = "(//tbody//child::tr//td)[1]") WebElement firstPageTitle;

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
	PageUtility.clickOnElement(newButtonElement);
}
public boolean isNewButtonEnabled() {
	return PageUtility.isElementEnabled(newButtonElement);
}
public void toEnterTitle(String title) {
	PageUtility.clearText(titleElement);
	WaitUtility.waitForvisibilityOfElement(driver, titleElement);
	PageUtility.enterText(titleElement, title);
}
public void toEnterPage(String page) {
	WaitUtility.waitForvisibilityOfElement(driver,pageElement);
	PageUtility.enterText(pageElement, page);
}
public void clickOnSaveButton() {
	PageUtility.clickOnElement(saveButtonElement);
}
public void clickOnSearchButton() {
	PageUtility.clickOnElement(searchButtonElement);
}
public void clickOnManagePagesLink() {
	PageUtility.clickOnElement(managepagesLinkElement);
}
public void toentertitletoSearch(String searchTitle) {
	WaitUtility.waitForvisibilityOfElement(driver, ListPageSearchButtonElement);
	PageUtility.enterText(ListPageTitleTextBoxElement, searchTitle);
	}

public void clickOnListPageSearchButton() {
	PageUtility.clickOnElement(ListPageSearchButtonElement);
	WaitUtility.waitForvisibilityOfElement(driver, ListPageSearchButtonElement);
}
public boolean toKnowResult() {
	boolean isPresent=PageUtility.isElementDisplayed(resultNotFoundElement);
	return isPresent;
}
public String checknewlyAddedPageIntheTable() {
	driver.navigate().back();
	driver.navigate().back();
	boolean isDisaplayed= PageUtility.isElementDisplayed(firstPageTitle);
	if(isDisaplayed==true) {
		return PageUtility.getElementText(firstPageTitle);
	}else {
		return "not found";
	}
	
}
}
	
