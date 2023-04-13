package com.obsqura.maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LoginPage {
public WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy (xpath = "//input[@placeholder='Username']") WebElement usernameTextBoxElement;
@FindBy (xpath = "//input[@name='password']") WebElement passwordTextBoxElement;
@FindBy (xpath = "//button[text()='Sign In']") WebElement signInButtonElement;

By signInButtonElementBy=By.xpath("//button[text()='Sign In']");
By usernameElementBy=By.xpath("//input[@placeholder='Username']");
By passwordElementBy=By.xpath("//input[@name='password']");

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

public void enterUserName(String username) {
	PageUtility.enterText(usernameTextBoxElement, username);
}
public void enterPassword(String password) {
	PageUtility.enterText(passwordTextBoxElement, password);
}
public void clickOnSignInButton() {
	PageUtility.clickOnElement(signInButtonElement);
}
}
