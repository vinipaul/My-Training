package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;

import io.netty.util.Signal;
import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;


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
	            {"admin","admin"}
	        };
		}
	@Test(retryAnalyzer = Retry.class)
	public void verify_SignIn_Button_Text_Alignment_Is_Center() throws IOException {
		String expectedTextAlignment=ExcelUtility.getString(2, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login");
		loginPage=new LoginPage(driver);
		String actualTextAlignment=loginPage.signInButtonTextAlignment();
		assertEquals(expectedTextAlignment,actualTextAlignment,"Sign In Button text alignment expected center but found "+actualTextAlignment);
		}
	@Test(retryAnalyzer = Retry.class)
	public void verify_RememberMe_CheckBox_Is_Selected() {
		loginPage =new LoginPage(driver);
		boolean actualResult=loginPage.isRemembermeCheckboxisSelected();
		assertFalse(actualResult,"Rememeber me checkbox is already Selected");
	}
}
