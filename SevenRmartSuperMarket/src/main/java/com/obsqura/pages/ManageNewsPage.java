package com.obsqura.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageNewsPage {
	public WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")
	WebElement manageNewsLink;
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usernameTextBox;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTextBox;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signInButton;
	@FindBy(xpath = "(//tbody//child::a[@class='btn btn-sm btn btn-primary btncss'])[1]")
	WebElement editIcon;
	@FindBy(xpath = "//textarea[@id='news']")
	WebElement newTextArea;
	@FindBy(xpath = "//button[@name='update']")
	WebElement updateButton;
	@FindBy(xpath = "//div[contains(@class,'alert alert-success alert-dismissible')]")
	WebElement successAlert;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newButton;
	@FindBy(xpath = "//textarea[@id='news']")
	WebElement newsTextArea;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveButton;
	@FindBy(xpath = "//a[@onclick='click_button(2)']")
	WebElement searchButton;
	@FindBy(xpath = "//input[@placeholder='Title']")
	WebElement newsTextBox;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchSubmitButton;

	By tableValuesby = By.xpath("//tbody//child::tr//child::td");

	public ManageNewsPage enterUserName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver, usernameTextBox);
		PageUtility.enterText(usernameTextBox, username);
		return this;
	}

	public ManageNewsPage enterPassword(String password) {
		WaitUtility.waitForvisibilityOfElement(driver, passwordTextBox);
		PageUtility.enterText(passwordTextBox, password);
		return this;
	}

	public ManageNewsPage clickOnSignInButton() {
		WaitUtility.waitForElementClickable(driver, signInButton);
		PageUtility.clickOnElement(signInButton);
		return this;
	}

	public ManageNewsPage clickOnManageNewsLink() {
		WaitUtility.waitForElementClickable(driver, manageNewsLink);
		PageUtility.clickOnElement(manageNewsLink);
		return this;
	}

	public ManageNewsPage clickOnEditIcon() {
		WaitUtility.waitForElementClickable(driver, editIcon);
		editIcon.click();
		return this;
	}

	public ManageNewsPage editNews(String news) {
		WaitUtility.waitForvisibilityOfElement(driver, newTextArea);
		newTextArea.clear();
		newTextArea.sendKeys(news);
		return this;
	}

	public ManageNewsPage clickOnUpdateButton() {
		WaitUtility.waitForElementClickable(driver, updateButton);
		updateButton.click();
		return this;
	}

	public boolean checkForUpdates(String news) {
		String newsText = "";
		WaitUtility.waitForvisibilityOfElement(driver, successAlert);
		boolean isAlertDisplayed = PageUtility.isElementDisplayed(successAlert);
		List<WebElement> columnElements = driver.findElements(tableValuesby);
		for (WebElement columnElement : columnElements) {
			newsText = columnElement.getText();
			break;
		}
		if (newsText.equalsIgnoreCase(news) && isAlertDisplayed == true)
			return true;
		else {
			return false;
		}
	}

	public ManageNewsPage clickOnNewButton() {
		WaitUtility.waitForElementClickable(driver, newButton);
		newButton.click();
		return this;
	}

	public ManageNewsPage enterNews(String news) {
		WaitUtility.waitForvisibilityOfElement(driver, newsTextArea);
		newsTextArea.clear();
		newTextArea.sendKeys(news);
		return this;
	}

	public ManageNewsPage clickOnSaveButton() {
		WaitUtility.waitForElementClickable(driver, saveButton);
		saveButton.click();
		return this;
	}

	public boolean searchInTheTable(String news) {
		String newsText = "";
		WaitUtility.waitForvisibilityOfElement(driver, successAlert);
		boolean isAlertDisplayed = PageUtility.isElementDisplayed(successAlert);
		driver.navigate().back();
		driver.navigate().back();
		List<WebElement> columnElements = driver.findElements(tableValuesby);
		for (WebElement columnElement : columnElements) {
			newsText = columnElement.getText();
			break;
		}
		if (newsText.equalsIgnoreCase(news) && isAlertDisplayed == true)
			return true;
		else {
			return false;
		}
	}

	public ManageNewsPage clickOnSearchButton() {
		WaitUtility.waitForElementClickable(driver, searchButton);
		searchButton.click();
		return this;
	}

	public ManageNewsPage clickOnSearchSubmitButton() {
		WaitUtility.waitForElementClickable(driver, searchSubmitButton);
		searchSubmitButton.click();
		return this;
	}

	public boolean toKnowResult(String news) {
		String newsText = "";
		List<WebElement> columnElements = driver.findElements(tableValuesby);
		for (WebElement columnElement : columnElements) {
			newsText = columnElement.getText();
			break;
		}
		if (newsText.equalsIgnoreCase(news))
			return true;
		else {
			return false;
		}
	}

	public ManageNewsPage enterNewstoSearch(String news) {
		WaitUtility.waitForvisibilityOfElement(driver, newsTextBox);
		newsTextBox.sendKeys(news);
		return this;
	}
}
