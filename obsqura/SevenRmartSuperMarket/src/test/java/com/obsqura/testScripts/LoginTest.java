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
	            { "admin","admin" }
					/*
					 * { "admin","fhgj" }, { "ghujhk", "admin" }, {"hgjhk","nbjhkj"}
					 */
	        };
		}
	@Test
	public void verify_SignIn_Button_Text_AlignmentIsCenter() {
		String expectedTextAlignment="center";
		loginPage=new LoginPage(driver);
		String actualTextAlignment=loginPage.signInButtonTextAlignment();
		assertEquals(expectedTextAlignment,actualTextAlignment,"Alignment is not "+expectedTextAlignment);
		}
	@Test
	public void verify_RememberMeCheckBox_Is_Selected() {
		boolean expectedResult=false;
		loginPage =new LoginPage(driver);
		boolean actualResult=loginPage.isRemembermeCheckboxisSelected();
		assertEquals(actualResult, expectedResult,"Rememeber me checkbox is found "+expectedResult);
	}
}
