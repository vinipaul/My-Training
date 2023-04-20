package com.obsqura.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageProductPage {
	public WebDriver driver;
	public ManageProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBoxElement;
	@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBoxElement;
	@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButtonElement;
	@FindBy	(xpath = "//a[@class='btn btn-rounded btn-danger']") WebElement newButtonElement;
	@FindBy	(xpath="//input[@value='Nonveg']") WebElement nonvegRadioButtonElement;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product' and  @class='small-box-footer']") WebElement manageproductLinkElement;
	@FindBy(xpath = "//select[@id='w_unit']") WebElement weightunitdropdownElement;
	
	By signInButtonElementBy=By.xpath("//button[text()='Sign In']");
	By usernameElementBy=By.xpath("//input[@placeholder='Username']");
	By passwordElementBy=By.xpath("//input[@name='password']");
	By newButtonElementBy=By.xpath("//input[@name='password']");
	By nonvegRadioButtonElementBy=By.xpath("//input[@name='password']");
	
	public WebElement signInButton() {
		WebElement signinbutton=driver.findElement(signInButtonElementBy);
		return signinbutton;
	}
	public WebElement usernameTextBox() {
		WebElement usernametextbox=driver.findElement(usernameElementBy);
		return usernametextbox;
	}
	public WebElement passwordTextBox() {
		WebElement passwordtextbox=driver.findElement(signInButtonElementBy);
		return passwordtextbox;
	}
	public WebElement newbuttonElement() {
		WebElement newbuttonelement=driver.findElement(newButtonElementBy);
		return newbuttonelement;
	}
	public void clickOnManageProductLink() {
		PageUtility.clickOnElement(manageproductLinkElement);
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
		assertTrue(PageUtility.isElementEnabled(newButtonElement),"New Button is disabled");
		WaitUtility.waitForElementClickable(driver,newButtonElement);
		PageUtility.clickOnElement(newButtonElement);
	}
	public void clickOnNonvegRadioButton() {
		PageUtility.clickOnElement(nonvegRadioButtonElement);
		WaitUtility.waitForElementSelected(driver,nonvegRadioButtonElement);
	}
	public boolean nonVegRadioButtonIsSelected() {
		WaitUtility.waitForElement(driver, nonvegRadioButtonElement);
		return PageUtility.isElementSelected(nonvegRadioButtonElement);
	}
	public void toSelectfromDropDown(){
		PageUtility.selectDropdownbyText(weightunitdropdownElement, "g");
		WaitUtility.waitFortextToBePresentInElement(driver, weightunitdropdownElement, "g");
		}
	public String getdropdownText() {
		WaitUtility.waitForElement(driver, weightunitdropdownElement);
		return PageUtility.FirstSelectedOption(weightunitdropdownElement);
	}
}
