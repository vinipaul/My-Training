package com.obsqura.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUsersPage {
	public WebDriver driver;
	public AdminUsersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBoxElement;
	@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBoxElement;
	@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButtonElement;
	@FindBy(xpath = "//a[contains(@class,'btn btn-rounded btn-danger')]") WebElement newButtonElement;
	@FindBy(xpath = "//select[@id='user_type']") WebElement usertypedropdownElement;
	@FindBy(xpath = "//a[contains(@class,'btn btn-rounded btn-warning')]") WebElement resetButtonElement;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and  @class='small-box-footer']") WebElement adminUsersLinkElement;
	
	By signInButtonElementBy=By.xpath("//button[text()='Sign In']");
	By usernameElementBy=By.xpath("//input[@placeholder='Username']");
	By passwordElementBy=By.xpath("//input[@name='password']");
	By newbuttonelementBy=By.xpath("//a[contains(@class,'btn btn-rounded btn-danger')]");
	By usertypedropdownby=By.xpath("//select[@id='user_type']");
	By resetbuttonElementbBy=By.xpath("//a[contains(@class,'btn btn-rounded btn-warning')]");
			
	public WebElement usertypeDropdown() {
		WebElement usertypedropdownelement=driver.findElement(usertypedropdownby);
		return usertypedropdownelement;
	}
	public WebElement resetButtonElement() {
		WebElement resetButtonElement=driver.findElement(resetbuttonElementbBy);
		return newButtonElement;
	}
	public WebElement newButtonElement() {
		WebElement newButtonElement=driver.findElement(newbuttonelementBy);
		return newButtonElement;
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
	public void toSelectFromDropDown() {
		WaitUtility.waitForElement(driver, usertypedropdownElement);
		PageUtility.selectDropdownbyIndex(usertypedropdownElement, 3);
	}
	public String dropdownvalue() {
		WaitUtility.waitForElement(driver, usertypedropdownElement);
		return( PageUtility.getElementText(usertypedropdownElement));
	}
	public String togetbackGroundColorofButton() {
		return(PageUtility.getcssValueofElement(resetButtonElement,"background-color"));
	}
	public void clickOnAdminUsersLink() {
		PageUtility.clickOnElement(adminUsersLinkElement);
	}
}
