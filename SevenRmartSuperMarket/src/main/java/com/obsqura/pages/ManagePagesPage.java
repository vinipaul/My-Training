package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

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
@FindBy (xpath = "//div[contains(@class,'alert alert-danger alert-dismissible')") WebElement alertElement;
@FindBy (xpath = "//span[@id='res']//child::center") WebElement resultNotFoundElement;
@FindBy (xpath ="//input[@id='main_img']") WebElement chooseFileButtonElement;
@FindBy (xpath ="//div[@id='imagePreview']") WebElement imageElement;

@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBoxElement;
@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBoxElement;
@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButtonElement;

By newButtonElementBy=By.xpath("//a[text()=' New']");
By titleTextBox=By.xpath("//input[@id='title']");
By pageTextBox=By.xpath("//input[@id='page']");
By resultnotfoundElementby=By.xpath("//span[@id='res']//child::center");
By choosefilebuttonBy =By.xpath("//input[@id='main_img']");

By signInButtonElementBy=By.xpath("//button[text()='Sign In']");
By usernameElementBy=By.xpath("//input[@placeholder='Username']");
By passwordElementBy=By.xpath("//input[@name='password']");

public WebElement signInButton() {
	WebElement signinbutton=driver.findElement(signInButtonElementBy);
	return signinbutton;
}
public WebElement choosefilebutton() {
	WebElement choosefilebuttonElement=driver.findElement(choosefilebuttonBy);
	return choosefilebuttonElement;
}
public WebElement usernameTextBox() {
	WebElement usernametextbox=driver.findElement(usernameElementBy);
	return usernametextbox;
}
public WebElement passwordTextBox() {
	WebElement passwordtextbox=driver.findElement(signInButtonElementBy);
	return passwordtextbox;
}
public WebElement resultnotFoundElement() {
	WebElement reresultnotfoundelement=driver.findElement(resultnotfoundElementby);
	return reresultnotfoundelement;
}
public WebElement newbuttonElement() {
	WebElement newbuttonelement=driver.findElement(newButtonElementBy);
	return newbuttonelement;
}
public WebElement titleTextBoxElement() {
	WebElement titletextboxElement=driver.findElement(titleTextBox);
	return titletextboxElement;
}
public WebElement pageTextBoxElement() {
	WebElement pagetextboxElement=driver.findElement(titleTextBox);
	return pagetextboxElement;
}


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
public void toEnterTitle(String title) {
	PageUtility.clearText(titleElement);
	PageUtility.enterText(titleElement, title);
}
public void toEnterPage(String page) {
	PageUtility.enterText(pageElement, page);
}
public void clickOnSaveButton() {
	PageUtility.clickOnElement(saveButtonElement);
}
public void clickOnSearchElement() {
	PageUtility.clickOnElement(searchButtonElement);
}
public void toentertitletoSearch(String searchTitle) {
	PageUtility.enterText(ListPageTitleTextBoxElement,searchTitle);
}
public void clickOnListPageSearchButton() {
	PageUtility.clickOnElement(ListPageSearchButtonElement);
}
public String toknowalertIsPresent() {
	String alertbackgroundColor= PageUtility.getcssValueofElement(alertElement, "backgroundcolor");
		return alertbackgroundColor;
	}
public boolean toKnowResult() {
	boolean isPresent=PageUtility.isElementDisplayed(resultNotFoundElement);
	return isPresent;
}
public void clickonchooseFileButton() {
	PageUtility.clickOnElement(chooseFileButtonElement);
}
public boolean toknowImageIsPresent() {
	return( PageUtility.isElementDisplayed(imageElement));
}
}
	
