package com.obsqura.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManagePagesPage {
	public WebDriver driver;

	public ManagePagesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=' New']")
	WebElement newButton;
	@FindBy(xpath = "//input[@id='title']")
	WebElement titleETextBox;
	@FindBy(xpath = "//input[@id='page']")
	WebElement pageTextBox;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveButton;
	@FindBy(xpath = "//a[contains(@class,'btn btn-rounded btn-primary')]")
	WebElement searchButton;
	@FindBy(xpath = "//input[@placeholder='Title']")
	WebElement ListPageTitleTextBox;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement ListPageSearchButton;
	@FindBy(xpath = "//span[@id='res']//child::center")
	WebElement resultNotFound;
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usernameTextBox;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTextBox;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signInButton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page' and @class='small-box-footer']")
	WebElement managepagesLink;
	@FindBy(xpath = "((//tbody//tr)[1]//child::td)[4]")
	WebElement newlyAddedPage;
	@FindBy(xpath = "((//tbody//tr)[1]//child::td)[1]")
	WebElement newlyAddedTitle;

	By TableValuesBy = By.xpath("//tbody//child::tr//child::td");

	public ManagePagesPage enterUserName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver, usernameTextBox);
		PageUtility.enterText(usernameTextBox, username);
		return this;
	}

	public ManagePagesPage enterPassword(String password) {
		WaitUtility.waitForvisibilityOfElement(driver, passwordTextBox);
		PageUtility.enterText(passwordTextBox, password);
		return this;
	}

	public ManagePagesPage clickOnSignInButton() {
		WaitUtility.waitForElementClickable(driver, signInButton);
		PageUtility.clickOnElement(signInButton);
		return this;
	}

	public ManagePagesPage clickOnManagePagesLink() {
		WaitUtility.waitForElementClickable(driver, managepagesLink);
		PageUtility.clickOnElement(managepagesLink);
		return this;
	}

	public ManagePagesPage clickonNewButton() {
		WaitUtility.waitForElementClickable(driver, newButton);
		PageUtility.clickOnElement(newButton);
		return this;
	}

	public ManagePagesPage toEnterTitle(String title) {
		PageUtility.clearText(titleETextBox);
		WaitUtility.waitForvisibilityOfElement(driver, titleETextBox);
		PageUtility.enterText(titleETextBox, title);
		return this;
	}

	public ManagePagesPage toEnterPage(String page) {
		WaitUtility.waitForvisibilityOfElement(driver, pageTextBox);
		PageUtility.enterText(pageTextBox, page);
		return this;
	}

	public ManagePagesPage clickOnSaveButton() {
		WaitUtility.waitForElementClickable(driver, saveButton);
		PageUtility.clickOnElement(saveButton);
		return this;
	}

	public ManagePagesPage clickOnSearchButton() {
		WaitUtility.waitForElementClickable(driver, searchButton);
		PageUtility.clickOnElement(searchButton);
		return this;
	}

	public ManagePagesPage toentertitletoSearch(String searchTitle) {
		WaitUtility.waitForvisibilityOfElement(driver, ListPageTitleTextBox);
		PageUtility.enterText(ListPageTitleTextBox, searchTitle);
		return this;
	}

	public ManagePagesPage clickOnListPageSearchButton() {
		WaitUtility.waitForElementClickable(driver, ListPageSearchButton);
		PageUtility.clickOnElement(ListPageSearchButton);
		return this;
	}

	public boolean toKnowResult() {
		boolean isPresent = PageUtility.isElementDisplayed(resultNotFound);
		return isPresent;
	}

	public boolean checknewlyAddedPageIntheTable() {
		driver.navigate().back();
		driver.navigate().back();
		boolean isDisaplayedPage = PageUtility.isElementDisplayed(newlyAddedPage);
		boolean isDisaplayedTilte = PageUtility.isElementDisplayed(newlyAddedTitle);
		if (isDisaplayedPage == true && isDisaplayedTilte == true) {
			return true;
		} else {
			return false;
		}
	}

	public boolean searchInTheTable(String searchTitle) {
		String searchTitleText = "";
		int flag = 0;
		List<WebElement> columnElements = driver.findElements(TableValuesBy);
		for (WebElement columnElement : columnElements) {
			searchTitleText = columnElement.getText();
			if (searchTitleText.equalsIgnoreCase(searchTitle)) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			return true;
		else
			return false;
	}
}
