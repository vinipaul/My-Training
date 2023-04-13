package com.obsqura.maven.testScripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.obsqura.maven.pages.LoginPage;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;


public class LoginTest extends Base {
	public LoginPage loginPage;
	@Test
	@Parameters({"username","password"})
	public void verify_login(String username,String password) throws IOException {
		loginPage=new LoginPage(driver);
		loginPage.enterUserName(username);
		WaitUtility.waitForElement(driver, loginPage.usernameTextBox());
		loginPage.enterPassword(password);
		WaitUtility.waitForElement(driver, loginPage.passwordTextBox());
		assertTrue(username.equalsIgnoreCase("admin"));
		assertTrue(password.equals("admin"));
		assertTrue(PageUtility.isElementEnabled(loginPage.signInButton()));
		loginPage.clickOnSignInButton();
	}	
}
