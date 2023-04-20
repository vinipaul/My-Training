package com.obsqura.pages;

import static org.testng.Assert.assertTrue;

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
@FindBy (xpath ="//input[@id='main_img']") WebElement chooseFileButtonElement;
@FindBy (xpath ="//div[@id='imagePreview']") WebElement imageElement;
@FindBy (xpath ="//div[contains(@class,'alert alert-danger alert-dismissible')") WebElement alertboxElement;

@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBoxElement;
@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBoxElement;
@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButtonElement;
@FindBy(xpath = "(//div[contains(@class,'col-lg-3 col-6')]//a)[1]") WebElement managepagesLinkElement;

By newButtonElementBy=By.xpath("//a[text()=' New']");
By titleTextBox=By.xpath("//input[@id='title']");
By pageTextBox=By.xpath("//input[@id='page']");
By listPageSearchButtonBy=By.xpath("//input[@placeholder='Title']");
By resultnotfoundElementby=By.xpath("//span[@id='res']//child::center");
By searchButtonElementBy=By.xpath("//a[contains(@class,'btn btn-rounded btn-primary')]");
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
public WebElement searchButton() {
	WebElement seachButton=driver.findElement(searchButtonElementBy);
	return seachButton;
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
	assertTrue(PageUtility.isElementEnabled(newButtonElement),"NewButton Is not enabled");
	PageUtility.clickOnElement(newButtonElement);
}
public void toEnterTitle(String title) {
	PageUtility.clearText(titleElement);
	WaitUtility.waitForElement(driver, titleTextBoxElement());
	PageUtility.enterText(titleElement, title);
}
public void toEnterPage(String page) {
	WaitUtility.waitForElement(driver,pageTextBoxElement());
	PageUtility.enterText(pageElement, page);
}
public void clickOnSaveButton() {
	PageUtility.clickOnElement(saveButtonElement);
}
public void clickOnSearchButton() {
	assertTrue(PageUtility.isElementEnabled(searchButtonElement),"search button  is disabled");
	PageUtility.clickOnElement(searchButtonElement);
}
public void clickOnManagePagesLink() {
	PageUtility.clickOnElement(managepagesLinkElement);
}
public void toentertitletoSearch(String searchTitle) {
	assertTrue(PageUtility.isElementDisplayed(ListPageSearchButtonElement),"Title Text Box is not displayed");
	PageUtility.enterText(ListPageTitleTextBoxElement,searchTitle);
	WaitUtility.waitForElementIsPresent(driver,listPageSearchButtonBy);
}
public void clickOnListPageSearchButton() {
	assertTrue(PageUtility.isElementEnabled(ListPageSearchButtonElement),"Search Button Is disabled");
	PageUtility.clickOnElement(ListPageSearchButtonElement);
}
public boolean toKnowResult() {
	boolean isPresent=PageUtility.isElementDisplayed(resultNotFoundElement);
	return isPresent;
}
public void clickonchooseFileButton() throws IOException {
	PageUtility.clickOnElement(chooseFileButtonElement);
    Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3.projecttestcasepicture.exe"); 
}
public boolean toCheckAlertIsPresent() {
	return PageUtility.isElementDisplayed(alertboxElement);
	}
}
	
