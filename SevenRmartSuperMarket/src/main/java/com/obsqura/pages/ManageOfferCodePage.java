package com.obsqura.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageOfferCodePage {
	public WebDriver driver;

	public ManageOfferCodePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-offercode']")
	WebElement manageOfferCodeLink;
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usernameTextBox;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTextBox;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signInButton;
	@FindBy(xpath = "//a[@onclick='click_button(2)']")
	WebElement searchButton;
	@FindBy(xpath = "//input[@placeholder='Offer Code']")
	WebElement offercodeTextBox;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchSubmitButton;
	@FindBy(xpath = "//tbody//child::tr")
	WebElement foundofferCode;
	@FindBy(xpath = "//p[text()='Manage Offer Code']//preceding-sibling::h3")
	WebElement homeOfferCodeCount;
	@FindBy(xpath = "//li[@class='breadcrumb-item']//child::a[@href='https://groceryapp.uniqassosiates.com/admin/home']")
	WebElement homeLink;

	By TableValuesBy = By.xpath("//tbody//child::tr//child::td");
	By tableRawsBy = By.xpath("//tbody//child::tr");

	public ManageOfferCodePage enterUserName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver, usernameTextBox);
		PageUtility.enterText(usernameTextBox, username);
		return this;
	}

	public ManageOfferCodePage enterPassword(String password) {
		WaitUtility.waitForvisibilityOfElement(driver, passwordTextBox);
		PageUtility.enterText(passwordTextBox, password);
		return this;
	}

	public ManageOfferCodePage clickOnSignInButton() {
		WaitUtility.waitForElementClickable(driver, signInButton);
		PageUtility.clickOnElement(signInButton);
		return this;
	}

	public ManageOfferCodePage clickonSearchButton() {
		WaitUtility.waitForElementClickable(driver, searchButton);
		PageUtility.clickOnElement(searchButton);
		return this;
	}

	public ManageOfferCodePage clickOnManageOfferLink() {
		WaitUtility.waitForElementClickable(driver, manageOfferCodeLink);
		PageUtility.clickOnElement(manageOfferCodeLink);
		return this;
	}

	public ManageOfferCodePage enterOfferCode(String offercode) {
		WaitUtility.waitForvisibilityOfElement(driver, offercodeTextBox);
		PageUtility.enterText(offercodeTextBox, offercode);
		return this;
	}

	public ManageOfferCodePage clickonSearchSubmitButton() {
		WaitUtility.waitForElementClickable(driver, searchSubmitButton);
		PageUtility.clickOnElement(searchSubmitButton);
		return this;
	}

	public boolean searchInTheTable(String offercode) {
		String offercodeText = "";
		List<WebElement> columnElements = driver.findElements(TableValuesBy);
		for (WebElement columnElement : columnElements) {
			offercodeText = columnElement.getText();
			break;
		}
		if (offercodeText.equalsIgnoreCase(offercode))
			return true;
		else {
			return false;
		}
	}

	public String toFindcountOfOffercodes() {
		WaitUtility.waitForPresenceOfAllElementsLocated(driver, tableRawsBy);
		List<WebElement> rowsinTable = driver.findElements(tableRawsBy);
		String actualrowcount = String.valueOf(rowsinTable.size());
		return actualrowcount;
	}

	public ManageOfferCodePage clickOnHomeLink() {
		WaitUtility.waitForElementClickable(driver, homeLink);
		PageUtility.clickOnElement(homeLink);
		return this;
	}

	public String findHomeOfferCodeCount() {
		WaitUtility.waitForvisibilityOfElement(driver, homeOfferCodeCount);
		return homeOfferCodeCount.getText();
	}

}
