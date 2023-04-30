package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageProductPage {
	public WebDriver driver;

	public ManageProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usernameTextBoxElement;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTextBoxElement;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signInButtonElement;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newButtonElement;
	@FindBy(xpath = "//input[@value='Nonveg']")
	WebElement nonvegRadioButtonElement;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product' and  @class='small-box-footer']")
	WebElement manageproductLinkElement;
	@FindBy(xpath = "//select[@id='w_unit']")
	WebElement weightunitdropdownElement;

	public ManageProductPage clickOnManageProductLink() {
		PageUtility.clickOnElement(manageproductLinkElement);
		return this;
	}

	public ManageProductPage enterUserName(String username) {
		PageUtility.enterText(usernameTextBoxElement, username);
		return this;
	}

	public ManageProductPage enterPassword(String password) {
		PageUtility.enterText(passwordTextBoxElement, password);
		return this;
	}

	public ManageProductPage clickOnSignInButton() {
		PageUtility.clickOnElement(signInButtonElement);
		return this;
	}

	public ManageProductPage clickonNewButton() {
		WaitUtility.waitForElementClickable(driver, newButtonElement);
		PageUtility.clickOnElement(newButtonElement);
		return this;
	}

	public ManageProductPage clickOnNonvegRadioButton() {
		PageUtility.clickOnElement(nonvegRadioButtonElement);
		WaitUtility.waitForElementSelected(driver, nonvegRadioButtonElement);
		return this;
	}

	public boolean nonVegRadioButtonIsSelected() {
		WaitUtility.waitForvisibilityOfElement(driver, nonvegRadioButtonElement);
		return PageUtility.isElementSelected(nonvegRadioButtonElement);
	}

	public ManageProductPage toSelectfromDropDown() {
		PageUtility.selectDropdownbyText(weightunitdropdownElement, "g");
		WaitUtility.waitFortextToBePresentInElement(driver, weightunitdropdownElement, "g");
		return this;
	}

	public String getdropdownText() {
		WaitUtility.waitForvisibilityOfElement(driver, weightunitdropdownElement);
		return PageUtility.FirstSelectedOption(weightunitdropdownElement);
	}
}
