package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

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
	public void clickOnNonvegRadioButton() {
		PageUtility.clickOnElement(nonvegRadioButtonElement);
	}
	public boolean nonVegRadioButtonIsSelected() {
		return PageUtility.isElementSelected(nonvegRadioButtonElement);
	}
}
