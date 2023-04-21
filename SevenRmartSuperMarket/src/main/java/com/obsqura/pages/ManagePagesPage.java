package com.obsqura.pages;

import java.util.List;

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
@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page' and @class='small-box-footer']") WebElement managepagesLinkElement;
@FindBy(xpath = "((//tbody//tr)[1]//child::td)[4]") WebElement newlyAddedPageElement;

public ManagePagesPage enterUserName(String username) {
	PageUtility.enterText(usernameTextBoxElement, username);
	return this;
}
public ManagePagesPage enterPassword(String password) {
	PageUtility.enterText(passwordTextBoxElement, password);
	return this;
}
public ManagePagesPage clickOnSignInButton() {
	PageUtility.clickOnElement(signInButtonElement);
	return this;
}
public ManagePagesPage clickonNewButton() {
	PageUtility.clickOnElement(newButtonElement);
	return this;
}
public ManagePagesPage toEnterTitle(String title) {
	PageUtility.clearText(titleElement);
	WaitUtility.waitForvisibilityOfElement(driver, titleElement);
	PageUtility.enterText(titleElement, title);
	return this;
}
public ManagePagesPage toEnterPage(String page) {
	WaitUtility.waitForvisibilityOfElement(driver,pageElement);
	PageUtility.enterText(pageElement, page);
	return this;
}
public ManagePagesPage clickOnSaveButton() {
	PageUtility.clickOnElement(saveButtonElement);
	return this;
}
public ManagePagesPage clickOnSearchButton() {
	PageUtility.clickOnElement(searchButtonElement);
	return this;
}
public ManagePagesPage clickOnManagePagesLink() {
	PageUtility.clickOnElement(managepagesLinkElement);
	return this;
}
public ManagePagesPage toentertitletoSearch(String searchTitle) {
	WaitUtility.waitForvisibilityOfElement(driver, ListPageSearchButtonElement);
	PageUtility.enterText(ListPageTitleTextBoxElement, searchTitle);
	return this;
	}

public ManagePagesPage clickOnListPageSearchButton() {
	PageUtility.clickOnElement(ListPageSearchButtonElement);
	WaitUtility.waitForvisibilityOfElement(driver, ListPageSearchButtonElement);
	return this;
}
public boolean toKnowResult() {
	boolean isPresent=PageUtility.isElementDisplayed(resultNotFoundElement);
	return isPresent;
}
public String checknewlyAddedPageIntheTable() {
		driver.navigate().back();
		driver.navigate().back();
		boolean isDisaplayed= PageUtility.isElementDisplayed(newlyAddedPageElement);
		if(isDisaplayed==true) {
			return PageUtility.getElementText(newlyAddedPageElement);
		}else{
			return "not found";
		}
	}
public boolean searchInTheTable(String searchTitle) {
	String searchTitleText="";
	List<WebElement> columnElements=driver.findElements(By.xpath("//tbody//child::tr//child::td"));
	for (WebElement columnElement:columnElements) {
    searchTitleText= columnElement.getText();
    break;
	}
	if(searchTitleText.equalsIgnoreCase(searchTitle))
		return true;
	else {
		return false;
	}		
}
}
	
