package com.obsqura.testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
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
	@Test(dataProvider = "LoginProvider",retryAnalyzer = Retry.class)
	public void verify_login_with_Credentials(String username,String password) throws IOException {
		String expectedurl=ExcelUtility.getString(0, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login");
		loginPage=new LoginPage(driver);
		loginPage.enterUserName(username).enterPassword(password).clickOnSignInButton();
		String actualUrl=driver.getCurrentUrl();
		assertEquals(actualUrl,expectedurl,"Login failed" );
		}
		@DataProvider(name="LoginProvider")
	    public Object[][] getDataFromDataprovider(){
			return new Object[][] 
	    	{
	            {"admin","admin"}
	        };
		}
	@Test(retryAnalyzer = Retry.class)
	public void verify_SignIn_Button_Text_AlignmentIsCenter() throws IOException {
		String expectedTextAlignment=ExcelUtility.getString(2, 0,System.getProperty("user.dir")+constants.Constants.TESTDATAFILE,"login");
		loginPage=new LoginPage(driver);
		String actualTextAlignment=loginPage.signInButtonTextAlignment();
		assertEquals(expectedTextAlignment,actualTextAlignment,"Sign In Button text alignment expected center but found "+actualTextAlignment);
		}
	@Test(retryAnalyzer = Retry.class)
	public void verify_RememberMeCheckBox_Is_Selected() {
		loginPage =new LoginPage(driver);
		boolean actualResult=loginPage.isRemembermeCheckboxisSelected();
		assertFalse(actualResult,"Rememeber me checkbox is already Selected");
	}
}
