package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
import com.obsqura.retry.Retry;

import utilities.ExcelUtility;


public class LoginTest extends Base {
	public LoginPage loginPage;
	@Test(dataProvider = "LoginProvider",retryAnalyzer = Retry.class)
	public void verify_login_with_Credentials(String username,String password) throws IOException {
		loginPage=new LoginPage(driver);
		loginPage.enterUserName(username).enterPassword(password).clickOnSignInButton();
		assertTrue(loginPage.isExpectedPageElementPresent(),"Sign In Failed");
		}
		@DataProvider(name="LoginProvider")
	    public Object[][] getDataFromDataprovider(){
			return new Object[][] 
	    	{
	            {"admin","admin"},
	            {"Admin","admin"}
	        };
		}
	@Test(retryAnalyzer = Retry.class)
	public void verify_SignIn_Button_Text_Alignment_Is_Center() throws IOException {
		String expectedTextAlignment=ExcelUtility.getString(2, 0,constants.Constants.FILEPATH,"login");
		loginPage=new LoginPage(driver);
		String actualTextAlignment=loginPage.signInButtonTextAlignment();
		assertEquals(expectedTextAlignment,actualTextAlignment,"Sign In Button text alignment expected center but found "+actualTextAlignment);
		}
	@Test(retryAnalyzer = Retry.class)
	public void verify_logout_from_the_Session_is_Possible_when_LogoutButton_Clicked() throws IOException {
		loginPage =new LoginPage(driver);
		loginPage.enterUserName((ExcelUtility.getString(1, 0,constants.Constants.FILEPATH,"login")))
		.enterPassword((ExcelUtility.getString(1, 1,constants.Constants.FILEPATH,"login")))
		.clickOnSignInButton()
		.clickOnAdmin()
		.clickOnLogoutButton();
		assertTrue(loginPage.checkLogoutOrNot(),"Logout Failed");
	}
	
}
