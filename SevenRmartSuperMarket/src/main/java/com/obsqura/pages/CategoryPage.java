package com.obsqura.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class CategoryPage {
	public WebDriver driver;
	public CategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']") WebElement CategoryLink;
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBox;
	@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBox;
	@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButton;
	@FindBy (xpath = "//p[text()='Category']//preceding-sibling::h3") WebElement countOfCategory;
	@FindBy (xpath = "//li[@class='breadcrumb-item']//child::a[@href='https://groceryapp.uniqassosiates.com/admin/home']")  WebElement homeLink;
	
	By tableRawsBy=By.xpath("//tbody//child::tr");
	
	public CategoryPage enterUserName(String username) {
		WaitUtility.waitForvisibilityOfElement(driver, usernameTextBox);
		PageUtility.enterText(usernameTextBox, username);
		return this;
	}
	public CategoryPage enterPassword(String password) {
		WaitUtility.waitForvisibilityOfElement(driver, passwordTextBox);
		PageUtility.enterText(passwordTextBox, password);
		return this;
	}
	public CategoryPage clickOnSignInButton() {
		WaitUtility.waitForElementClickable(driver, signInButton);
		PageUtility.clickOnElement(signInButton);
		return this;
	}
	public CategoryPage clickOnCategory() {
		WaitUtility.waitForElementClickable(driver, CategoryLink);
		PageUtility.clickOnElement(CategoryLink);
		return this;
	}
	public String findcountOfCategories() {
		WaitUtility.waitForPresenceOfAllElementsLocated(driver, tableRawsBy);
		List<WebElement> rowsinTable= driver.findElements(tableRawsBy);
		String actualrowcount=String.valueOf(rowsinTable.size());
		return actualrowcount;
	}
	public CategoryPage clickOnHomeLink() {
		WaitUtility.waitForElementClickable(driver, homeLink);
		PageUtility.clickOnElement(homeLink);
		return this;
	}
	public String findHomeCategoryCount() {
		WaitUtility.waitForvisibilityOfElement(driver, countOfCategory);
		return countOfCategory.getText();
	}
}
