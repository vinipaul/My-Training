package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;


public class LoginTest extends Base {
	public LoginPage loginPage;
	@Test(dataProvider = "LoginProvider")
	public void verify_login_with_Credentials(String username,String password) {
		String expectedurl="https://groceryapp.uniqassosiates.com/admin";
		loginPage=new LoginPage(driver);
		assertTrue(PageUtility.isElementDisplayed(loginPage.usernameTextBox()),"UserName Field Is Not Enabled");
		loginPage.enterUserName(username);
		WaitUtility.waitForElement(driver, loginPage.usernameTextBox());
		assertTrue(PageUtility.isElementDisplayed(loginPage.passwordTextBox()),"Password Field Is Not Enabled");
		loginPage.enterPassword(password);
		WaitUtility.waitForElement(driver, loginPage.passwordTextBox());
		assertTrue(PageUtility.isElementEnabled(loginPage.signInButton()));
		loginPage.clickOnSignInButton();
		assertEquals(driver.getCurrentUrl(),expectedurl,"Login failed" );
		}
		@DataProvider(name="LoginProvider")
	    public Object[][] getDataFromDataprovider(){
			return new Object[][] 
	    	{
	            { "admin","admin" },
	            { "admin","fhgj" },
	            { "ghujhk", "admin" },
	            {"hgjhk","nbjhkj"}
	        };
		}
}
